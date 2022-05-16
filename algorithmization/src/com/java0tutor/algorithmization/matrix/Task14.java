package com.java0tutor.algorithmization.matrix;

public class Task14 {
	// Массивы массивов. Задание 14:
	// Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
	// причем в каждом столбце число единиц равно номеру столбца.

	public void task(int height, int width) {
		int[][] array;
		int count;

		// инициализируем матрицу
		array = new int[height][width];
		for (int j = 0; j < width; j++) {
			count = j;
			for (int i = 0; i < height; i++) {
				if (count <= 0)
					array[i][j] = 0;
				else {
					array[i][j] = 1;
					count--;
				}
			}
		}

		// выводим матрицу
		System.out.println("Матрица:");
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task14 task = new Task14();
		task.task(5, 4);
	}

}
