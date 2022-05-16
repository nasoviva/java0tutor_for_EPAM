package com.java0tutor.algorithmization.matrix;

public class Task2 {
	// Массивы массивов. Задание 2:
	// Дана квадратная матрица.
	// Вывести на экран элементы, стоящие на диагонали.

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
				if (j == i)
					System.out.print(" " + array[i][j]);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task2 task = new Task2();
		task.task(5, 5);

	}

}
