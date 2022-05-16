package com.java0tutor.algorithmization.matrix;

public class Task10 {
	// Массивы массивов. Задание 10:
	// Найти положительные элементы главной диагонали квадратной матрицы.

	public void task(int n) {
		int[][] array;

		if (n < 0 || n % 2 != 0) {
			System.out.println("n = " + n + " это недопустимое значение");
			return;
		}

		// инициализируем матрицу
		array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = (int) (Math.random() * (21)) - 10;
			}
		}

		// выводим матрицу
		System.out.println("Дана матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}

		// решение
		System.out.println("\nРезультат:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j == i && array[i][j] > 0)
					System.out.print(" " + array[i][j]);

			}
		}
	}

	public static void main(String[] args) {
		Task10 task = new Task10();
		task.task(18);

	}

}
