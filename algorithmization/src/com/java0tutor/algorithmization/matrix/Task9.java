package com.java0tutor.algorithmization.matrix;

public class Task9 {
	// Массивы массивов. Задание 9:
	// Задана матрица неотрицательных чисел.
	// Посчитать сумму элементов в каждом столбце.
	// Определить, какой столбец содержит максимальную сумму.

	public void task(int height, int width) {
		int[][] array;
		int sum;
		int max;
		int max_sum;

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

		// считаем сумму элементов в столбцах
		sum = 0;
		max = 0;
		max_sum = 0;
		for (int j = 0; j < width; j++) {
			sum = 0;
			for (int i = 0; i < height; i++) {
				sum = sum + array[i][j];
			}
			if (sum > max_sum) {
				max_sum = sum;
				max = j + 1;
			}
		}

		// результат
		System.out.println("\nМаксимальную сумму содержит " + max + " столбец");
	}

	public static void main(String[] args) {
		Task9 task = new Task9();
		task.task(4, 6);
	}
}
