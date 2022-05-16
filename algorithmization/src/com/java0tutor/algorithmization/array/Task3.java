package com.java0tutor.algorithmization.array;

public class Task3 {
	// Одномерные массивы. Задание 3:
	// Дан массив действительных чисел, размерность которого N.
	// Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

	public void task(int n) {
		int num_positive;
		int num_negative;
		int num_null;
		double[] array;

		// инициализируем массив
		array = new double[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (Math.random() * (201)) - 100;// [ -100; +100], ( Math.random() * (b-a+1) ) + a
		}
		// выводим массив
		System.out.print("N = " + n + ", array = ");
		for (int i = 0; i < array.length; i++) {
			System.out.format("%.1f ", array[i]);
		}

		// считаем
		num_positive = 0;
		num_negative = 0;
		num_null = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > 0)
				num_positive++;
			else if (array[i] < 0)
				num_negative++;
			else
				num_null++;
		}

		// выводим результат
		System.out.println("\n\nКоличество положительных элементов = " + num_positive);
		System.out.println("Количество отрицательных элементов = " + num_negative);
		System.out.println("Количество нулевых элементов = " + num_null);
	}

	public static void main(String[] args) {
		Task3 task = new Task3();
		task.task(10);
	}
}
