package com.java0tutor.algorithmization.array;

public class Task6 {
	// Одномерные массивы. Задание 6:
	// Задана последовательность N вещественных чисел.
	// Вычислить сумму чисел, порядковые номера которых являются простыми числами.

	public void task(int n) {
		double[] array;
		double sum;

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

		// находим cумму
		sum = 0;
		int num = 2;
		for (int i = 0; i < array.length; i++) {
			if (i > 1) {
				while (num < i) {
					if (i % num != 0)
						num++;
					else
						break;
				}
				if (num == i)
					sum = sum + array[i];
			}
			num = 2;
		}

		// выводим результат
		System.out.format("\n\nсумма = %.2f", sum);
	}

	public static void main(String[] args) {
		Task6 task = new Task6();
		task.task(20);
	}
}
