package com.java0tutor.algorithmization.decomposition;

public class Task4 {

	// Декомпозиция с использованием методов. Задание 4:
	// На плоскости заданы своими координатами n точек. Написать метод(методы),
	// определяющие, между какими из пар точек самое большое расстояние.
	// Координаты точек занести в массив.

	private int n;

	public Task4() {

	}

	public Task4(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void printResult(int[][] result) {
		System.out.println("\nСамое большое расстояние между:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(" " + result[i][j]);
			}
			System.out.println("");
		}
	}

	public int[][] findMaxDistance(int n) {
		int[][] result;
		int[][] plane;
		double max;
		double tmp;
		int y;
		int yy;

		max = 0;
		result = new int[2][2];
		plane = initArray(n);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				y = i;
				if (i + j < n)
					yy = i + j;
				else
					yy = i + j - n;
				if (y != yy) {
					// расстояние между взятыми на плоскости двумя точками
					tmp = Math.sqrt(((plane[y][0] - plane[yy][0]) * 2 + (plane[y][1] - plane[yy][1]) * 2));
					if (tmp >= max) {
						max = tmp;
						result[0][0] = plane[y][0];
						result[0][1] = plane[y][1];
						result[1][0] = plane[yy][0];
						result[1][1] = plane[yy][1];
					}
				}
			}
		}
		return result;
	}

	public int[][] initArray(int n) {
		int[][] plane;

		plane = new int[n][2];
		System.out.println("Точки:");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 2; j++) {
				plane[i][j] = (int) (Math.random() * (10));
				System.out.print(" " + plane[i][j]);
			}
			System.out.println("");
		}
		return plane;
	}

	public static void main(String[] args) {
		Task4 task = new Task4(5);

		task.printResult(task.findMaxDistance(task.getN()));
	}

}
