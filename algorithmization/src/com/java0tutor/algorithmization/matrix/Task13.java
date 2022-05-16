package com.java0tutor.algorithmization.matrix;

public class Task13 {
	// Массивы массивов. Задание 13:
	// Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

	public void task(int height, int width) {
		int[][] array;
		int tmp;

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

		// сортируем
		System.out.println("\nСортировка столбцов по возрастанию:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				for (int k = i + 1; k < height; k++) {
					if (array[i][j] > array[k][j]) {
						tmp = array[i][j];
						array[i][j] = array[k][j];
						array[k][j] = tmp;
					}
				}
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}

		System.out.println("\nСортировка столбцов по убыванию:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				for (int k = i + 1; k < height; k++) {
					if (array[i][j] < array[k][j]) {
						tmp = array[i][j];
						array[i][j] = array[k][j];
						array[k][j] = tmp;
					}
				}
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task13 task = new Task13();
		task.task(10, 20);

	}

}
