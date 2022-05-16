package com.java0tutor.algorithmization.matrix;

import java.util.Scanner;

public class Task8 {
	// Массивы массивов. Задание 8:
	// В числовой матрице поменять местами два любых столбца,
	// т. е. все элементы одного столбца поставить на соответствующие им позиции
	// другого, а его элементы второго переместить в первый.
	// Номера столбцов вводит пользователь.

	public void task(int width, int height) {
		int[][] array;
		int[] tmp;
		int m;
		int n;

		// инициализируем матрицу
		array = new int[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				array[i][j] = (int) (Math.random() * (10));
			}
		}

		// выводим матрицу
		System.out.println("Дана матрица:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}

		// ввод столбцов с клавиатуры
		m = 0;
		n = 0;
		while (m <= 0 || m > width) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите номер первого столбца матрицы: ");
			if (scanner.hasNextInt()) {
				m = scanner.nextInt();
				if (m <= 0 || m > width)
					System.out.println("Вы ввели слишком маленькое/большое число");
				else {
					while (n <= 0 || n > width) {
						Scanner scanner1 = new Scanner(System.in);
						System.out.print("Введите номер второго столбца мартицы: ");
						if (scanner1.hasNextInt()) {
							n = scanner1.nextInt();

							if (n <= 0 || n > width)
								System.out.println("Вы ввели слишком маленькое/большое число");
						} else
							System.out.println("Вы допустили ошибку");
					}
				}
			} else
				System.out.println("Вы допустили ошибку");
		}
		System.out.println("Номер первого столбца = " + m + ", Номер второго столбца = " + n);

		// меняем местами столбцы
		System.out.println("Результат:");
		tmp = new int[width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j == m - 1) {
					tmp[j] = array[i][m - 1];
					array[i][m - 1] = array[i][n - 1];
					array[i][n - 1] = tmp[j];
				}
			}
		}

		// вывод результата
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task8 task = new Task8();
		task.task(4, 5);
	}
}
