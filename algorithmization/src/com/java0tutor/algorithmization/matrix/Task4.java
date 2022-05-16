package com.java0tutor.algorithmization.matrix;

public class Task4 {
	// Массивы массивов. Задание 4:
	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
	// 1 2 3 . . . n
	// n n-1 n-2 . . . 1
	// 1 2 3 . . . n
	// n n-1 n-2 . . . 1
	// . . . . . . .
	// n n-1 n-2 . . . 1

	public void task(int n) {
		int[][] array;
		int count;

		if (n < 0 || n % 2 != 0) {
			System.out.println("n = " + n + " это недопустимое значение");
			return;
		}

		// инициализируем матрицу
		array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i % 2 == 0) {
					count = 0;
					while (count <= j) {
						array[i][j] = count + 1;
						count++;
					}
				} else if (i % 2 != 0) {
					count = 0;
					while (count <= j) {
						array[i][j] = n - count;
						count++;
					}
				}
			}
		}

		// выводим матрицу
		System.out.println("Матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task4 task = new Task4();
		task.task(18);
	}
}
