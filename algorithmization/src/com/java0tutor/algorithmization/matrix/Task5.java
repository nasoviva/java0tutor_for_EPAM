package com.java0tutor.algorithmization.matrix;

public class Task5 {
	// Массивы массивов. Задание 5:
	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
	// 1 1 1 1 1 1 1 1
	// 2 2 2 2 2 2 2 0
	// 3 3 3 3 3 3 0 0
	// . . . . . . . .
	// . . . . . . . .
	// . . . . . . . .
	// n-1 n-1 0 0 0 0 0 0
	// n 0 0 0 0 0 0 0

	public void task(int n) {
		int[][] array;
		int count;

		if (n < 0 || n % 2 != 0) {
			System.out.println("n = " + n + " это недопустимое значение");
			return;
		}

		// инициализируем матрицу
		count = 0;
		array = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - count; j++) {
				array[i][j] = count + 1;
			}
			count++;
		}

		// выводим матрицу
		System.out.println("Матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(" " + array[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Task5 task = new Task5();
		task.task(8);
	}
}
