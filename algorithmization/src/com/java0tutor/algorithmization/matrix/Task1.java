package com.java0tutor.algorithmization.matrix;

public class Task1 {
	// Массивы массивов. Задание 1:
	// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент
	// больше последнего.

	public void task(int width, int height) {
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

		// решение
		System.out.println("\nРезультат:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j % 2 != 0 && array[0][j] > array[height - 1][j])
					System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task1 task = new Task1();
		task.task(5, 4);
	}

}
