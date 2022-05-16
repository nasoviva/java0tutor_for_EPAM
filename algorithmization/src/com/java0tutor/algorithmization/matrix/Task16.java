package com.java0tutor.algorithmization.matrix;

public class Task16 {
	// Массивы массивов. Задание 16:
	// Магическим квадратом порядка n называется квадратная матрица размера n x n,
	// составленная из чисел 1, 2, 3,..., n^2 так, что суммы по каждому столбцу,
	// каждой строке и каждой из двух больших диагоналей равны между собой.
	// Построить такой квадрат.

	private int n;

	public Task16() {

	}

	public Task16(int n) {
		super();
		this.n = n;
	}

	public void result() {
		int[][] array;
		int magic;

		if (n > 9) {
			System.out.println("попробуйте 2 < n < 10");
			return;
		}
		// найдем магическую константу
		magic = (n * ((int) (Math.pow(n, 2)) + 1) / 2);
		System.out.println("magic sum = " + magic);

		// инициализируем матрицу с нулями
		array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = 0;
			}
		}
		if (n % 2 == 0 && n % 4 != 0) // для квадратов одинарной четности: 6
			array = singleEven(array);
		if (n % 4 == 0) // для квадратов двойной четности: 4, 8
			array = doubleEven(array);
		if (n % 2 != 0) // для нечетных квадратов: 3, 5, 7, 9
			array = odd(array);
		System.out.println("\nРезультат:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
		review(array);// проверка
	}

	public int[][] odd(int[][] array) {
		int col;
		int str;
		int col1;
		int str1;
		int num;

		col = n / 2;
		str = 0;
		num = 1;
		array[str][col] = num;
		num++;
		col1 = col;
		str1 = str;
		col++;
		str--;
		while (num <= n * n) {
			if (str < 0)
				str = n - 1;
			if (col >= n)
				col = 0;
			if (array[str][col] != 0) {
				col = col1;
				str = str1 + 1;
			}
			if (array[str][col] == 0 && col < n && str >= 0 && str < n) {
				array[str][col] = num;
				col1 = col;
				str1 = str;
				col++;
				str--;
				num++;
			}
		}
		return array;
	}

	public int[][] doubleEven(int[][] array) {
		int num;
		int del;
		int tmp_del;
		int count;
		int k;

		del = n / 4;
		k = 0;
		num = 1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tmp_del = del;
				while (tmp_del >= 1) {
					if ((j == 0 || j == n - 1 || j == n / tmp_del || j == n / tmp_del - 1 || j == n - 4 || j == n - 5)
							&& (i == 0 || i == n - 1 || i == n / tmp_del || i == n / tmp_del - 1 || i == n - 4
									|| i == n - 5))
						array[i][j] = num;
					tmp_del = tmp_del / 2;

				}
				tmp_del = del;
				while (k <= n) {

					if ((j == k - 1 || j == k || j == n - k - 1 || j == n - k || j == n / tmp_del + k
							|| j == n / tmp_del + k - 1)
							&& (i == k - 1 || i == k || i == n - k - 1 || i == n - k || i == n / tmp_del + k
									|| i == n / tmp_del + k - 1))
						array[i][j] = num;

					tmp_del = tmp_del / 2;
					if (tmp_del == 0) {
						k = k + 2;
						tmp_del = del;
					}
				}
				k = 0;
				num++;
			}
		}
		num--;
		num--;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				while (array[i][j] == 0) {
					count = 0;
					for (int x = 0; x < n; x++) {
						for (int y = 0; y < n; y++) {
							if (array[x][y] == num) {
								count++;
							}
						}
					}
					if (count == 0) {
						array[i][j] = num;
						num--;
					} else
						num--;
				}
			}
		}
		return array;
	}

	public int[][] singleEven(int[][] array) {
		int col;
		int str;
		int col1;
		int str1;
		int tmp;
		int num;
		int del;

		num = 1;
		del = n / 2;
		while (num < n * n) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (num <= del * n / 2 && j < del && i < del) {

						col = del / 2;
						str = 0;
						array[str][col] = num;
						num++;
						col1 = col;
						str1 = str;
						col++;
						str--;
						while (num <= del * del) {
							if (str < 0)
								str = del - 1;
							if (col >= del)
								col = 0;
							if (array[str][col] != 0) {
								col = col1;
								str = str1 + 1;
							}
							if (array[str][col] == 0 && col < del && str >= 0 && str < del) {
								array[str][col] = num;
								col1 = col;
								str1 = str;
								col++;
								str--;
								num++;
							}
						}
					}
					if (num > del * del && num <= del * n && j >= del && i >= del) {
						col = del + del / 2;
						str = del;
						col1 = col;
						str1 = str;
						array[str][col] = num;
						num++;
						col++;
						str--;
						while (num > del * del && num <= del * n) {
							if (str < del)
								str = n - 1;
							if (col >= n)
								col = del;
							if (array[str][col] != 0) {
								col = col1;
								str = str1 + 1;
							}
							if (array[str][col] == 0 && col < n && str >= del && str < n) {
								array[str][col] = num;
								col1 = col;
								str1 = str;
								col++;
								str--;
								num++;
							}
						}
					}
					if (num > del * n && num <= del * del * 3 && num <= n * n && j < del && i >= del) {
						col = del + del / 2;
						str = 0;
						array[str][col] = num;
						num++;
						col1 = col;
						str1 = str;
						col++;
						str--;
						while (num > del * n && num <= del * del * 3) {

							if (str < 0)
								str = del - 1;
							if (col >= n)
								col = del;
							if (array[str][col] != 0) {
								col = col1;
								str = str1 + 1;
							}
							if (array[str][col] == 0 && col < n && str >= 0 && str < del) {
								array[str][col] = num;
								col1 = col;
								str1 = str;
								col++;
								str--;
								num++;
							}
						}
					}
					if (num > del * del * 3 && num <= n * n && j >= del && i < del) {
						col = del / 2;
						str = del;
						array[str][col] = num;
						num++;
						col1 = col;
						str1 = str;
						col++;
						str--;
						while (num > del * del * 3 && num <= n * n) {
							if (str < del)
								str = n - 1;
							if (col >= del)
								col = 0;
							if (array[str][col] != 0) {
								col = col1;
								str = str1 + 1;
							}
							if (array[str][col] == 0 && col < del && str >= del && str < n) {
								array[str][col] = num;
								col1 = col;
								str1 = str;
								col++;
								str--;
								num++;
							}
						}
					}
				}
			}
		}
		tmp = array[0][0];
		array[0][0] = array[del][0];
		array[del][0] = tmp;
		tmp = array[del - 1][0];
		array[del - 1][0] = array[n - 1][0];
		array[n - 1][0] = tmp;
		tmp = array[del / 2][del / 2];
		array[del / 2][del / 2] = array[del + del / 2][del / 2];
		array[del + del / 2][del / 2] = tmp;
		return array;
	}

	public void review(int[][] array) {
		int sum;

		System.out.println("\nПроверка:");
		sum = 0;
		for (int i = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < n; j++) {
				sum = sum + array[i][j];
			}
			System.out.println("sum of str[" + i + "] = " + sum);
		}
		System.out.println("");
		sum = 0;
		for (int j = 0; j < n; j++) {
			sum = 0;
			for (int i = 0; i < n; i++) {
				sum = sum + array[i][j];
			}
			System.out.println("sum of col[" + j + "] = " + sum);
		}
		System.out.println("");
		sum = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (j == i)
					sum = sum + array[i][j];
			}
		}
		System.out.println("sum of dia1 = " + sum);
		sum = 0;
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				if (j == n - 1 - i && i == n - 1 - j)
					sum = sum + array[i][j];
			}
		}
		System.out.println("sum of dia2 = " + sum);
	}

	public static void main(String[] args) {
		Task16 task = new Task16(3);
		task.result();
	}
}
