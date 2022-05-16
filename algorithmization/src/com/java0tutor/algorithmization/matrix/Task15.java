package com.java0tutor.algorithmization.matrix;

public class Task15 {
	// Массивы массивов. Задание 15:
	// Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

	public void task(int height, int width) {
		int[][] array;
		int max;

		// инициализируем матрицу
		array = new int[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				array[i][j] = (int) (Math.random() * (10));
			}
		}

		// выводим матрицу и находим максимальный элемент
		max = Integer.MIN_VALUE;
		System.out.println("Дана матрица:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (array[i][j] > max)
					max = array[i][j];
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\nМаксимальный элемент = " + max);

		// заменим все нечетные элементы на максимальный элемент
		System.out.println("\nРезультат:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (array[i][j] % 2 != 0)
					array[i][j] = max;
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task15 task = new Task15();
		task.task(10, 20);

	}

}
