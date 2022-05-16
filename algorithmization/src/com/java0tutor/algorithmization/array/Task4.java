package com.java0tutor.algorithmization.array;

public class Task4 {
	// Одномерные массивы. Задание 4:
	// Даны действительные числа а 1 ,а 2 ,..., а n .
	// Поменять местами наибольший и наименьший элементы.

	public void task(int n) {
		double[] array;
		double min;
		double max;

		// инициализируем массив
		array = new double[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * (201)) - 100;
		}
		// выводим массив
		System.out.print("n = " + n + ", array =");
		for (int i = 0; i < array.length; i++) {
			System.out.format("%.1f ", array[i]);
		}

		// находим min и max
		max = Double.MIN_VALUE;
		min = Double.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
			if (array[i] < min)
				min = array[i];
		}

		// меняем местами
		for (int i = 0; i < array.length; i++) {
			if (array[i] == max)
				array[i] = min;
			else if (array[i] == min)
				array[i] = max;
		}

		// выводим результат
		System.out.format("\n\nmin = %.1f", min);
		System.out.format(", max = %.1f", max);
		System.out.print(", array = ");
		for (int i = 0; i < array.length; i++) {
			System.out.format("%.1f ", array[i]);
		}
	}

	public static void main(String[] args) {
		Task4 task = new Task4();
		task.task(10);
	}
}
