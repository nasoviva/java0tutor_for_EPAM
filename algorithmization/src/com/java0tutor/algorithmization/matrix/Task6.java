package com.java0tutor.algorithmization.matrix;

public class Task6 {
	// Массивы массивов. Задание 6:
	// Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
	// 1 1 1 ... 1 1 1
	// 0 1 1 ... 1 1 0
	// 0 0 1 ... 1 0 0
	// . . . ... . . .
	// . . . ... . . .
	// . . . ... . . .
	// 0 1 1 ... 1 1 0
	// 1 1 1 ... 1 1 1

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
		for (int i = 0; (i < n); i++) {
			for (int j = 0; (j <= n - count - 1) || j <= count; j++) {
				if ((j >= n - count - 1) || j >= count)
					array[i][j] = 'a';
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
		Task6 task = new Task6();
		task.task(8);
	}
}
