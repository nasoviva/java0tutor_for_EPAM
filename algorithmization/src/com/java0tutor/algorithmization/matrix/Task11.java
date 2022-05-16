package com.java0tutor.algorithmization.matrix;

public class Task11 {
	// Массивы массивов. Задание 11:
	// Матрицу 10x20 заполнить случайными числами от 0 до 15.
	// Вывести на экран саму матрицу и номера строк, в которых число 5 встречается
	// три и более раз.

	public void task(int height, int width) {
		int[][] array;
		int count;

		// инициализируем матрицу
		array = new int[height][width];
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				array[i][j] = (int) (Math.random() * (16));
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

		// результат
		System.out.print("\nНомера строк, в которых число 5 встречается три и более раз:");
		for (int i = 0; i < height; i++) {
			count = 0;
			for (int j = 0; j < width; j++) {
				if (array[i][j] == 5)
					count++;
			}
			if (count >= 3)
				System.out.print(" " + i);
		}
	}

	public static void main(String[] args) {
		Task11 task = new Task11();
		task.task(10, 20);
	}
}
