package com.java0tutor.algorithmization.matrix;

public class Task3 {
	// Массивы массивов. Задание 3:
	// Дана матрица.
	// Вывести k-ю строку и p-й столбец матрицы.

	public void task(int height, int width, int k, int p) {
		int[][] array;

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

		// вывод строки
		if (k >= height || k < 0)
			System.out.println("Cтроки " + k + " не существует");
		else {
			System.out.println("\nСтрока номер " + k);
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (i == k)
						System.out.print(" " + array[i][j]);
				}
			}
			System.out.println("");
		}

		// вывод столбца
		if (p >= width || p < 0)
			System.out.println("Cтолбца " + p + " не существует");
		else {
			System.out.println("Столбец номер " + p);
			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (j == p)
						System.out.print(" " + array[i][j]);
				}
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		Task3 task = new Task3();
		task.task(5, 40, 1, 3);
	}

}
