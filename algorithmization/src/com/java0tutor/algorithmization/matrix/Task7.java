package com.java0tutor.algorithmization.matrix;

public class Task7 {
	// Массивы массивов. Задание 7:
	// Сформировать квадратную матрицу порядка N по правилу:
	// A[I,J] = sin((I^2 − J^2)/N)
	// и подсчитать количество положительных элементов в ней.

	public void task(int n) {
		double[][] array;
		double i_pow;
		double j_pow;
		double res;
		int count;

		if (n < 0 || n % 2 != 0) {
			System.out.println("n = " + n + " это недопустимое значение");
			return;
		}

		// инициализируем матрицу
		array = new double[n][n];
		count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				i_pow = Math.pow(i, 2);
				j_pow = Math.pow(j, 2);
				res = (i_pow - j_pow) / n;
				array[i][j] = Math.sin(res);
				if (array[i][j] > 0)
					count++;
			}
		}

		// выводим результат
		System.out.println("Матрица:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.format("%.3f ", array[i][j]);
			}
			System.out.println("");
		}
		System.out.println("\nКоличество положительных элементов в матрице: " + count);
	}

	public static void main(String[] args) {
		Task7 task = new Task7();
		task.task(8);
	}
}
