package com.java0tutor.algorithmization.matrix;

public class Task12 {
	// Массивы массивов. Задание 12:
	// Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

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
		System.out.println("\nСортировка строк по возрастанию:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				for (int k = j + 1; k < width; k++) {
					if (array[i][j] > array[i][k]) {
						tmp = array[i][j];
						array[i][j] = array[i][k];
						array[i][k] = tmp;
					}
				}
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}

		System.out.println("\nСортировка строк по убыванию:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				for (int k = j + 1; k < width; k++) {
					if (array[i][j] < array[i][k]) {
						tmp = array[i][j];
						array[i][j] = array[i][k];
						array[i][k] = tmp;
					}
				}
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task12 task = new Task12();
		task.task(10, 20);

	}

}
