package com.java0tutor.algorithmization.array;

public class Task7 {
	// Одномерные массивы. Задание 7:
	// Даны действительные числа a1 , a2 ,..., an.
	// Найти max(a[1] + a[2n], a[2] + a[2n − 1] , ... , a[n] + a[n + 1])

	public void task(int n) {
		double[] array;
		double max;

		// инициализируем массив
		array = new double[n];
		for (int i = 0; i < n; i++) {
			array[i] = (Math.random() * (201)) - 100;
		}
		// выводим массив
		System.out.print("n = " + n + ", array =");
		for (int i = 0; i < n; i++) {
			System.out.format("%.1f ", array[i]);
		}

		// находим max
		max = array[0] + array[n - 1];// a[0]+a[n]
		for (int i = 1; i < n / 2; i++) {
			if ((array[i] + array[n - i - 1]) > max) {
				max = array[i] + array[n - i];// a[1]+a[n-1] и так далее до середины
			}
		}

		// выводим результат
		System.out.format("\n\nmax = %.2f", max);
	}

	public static void main(String[] args) {
		Task7 task = new Task7();
		task.task(10);
	}
}
