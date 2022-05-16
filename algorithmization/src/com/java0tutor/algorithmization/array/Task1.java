package com.java0tutor.algorithmization.array;

public class Task1 {
	// Одномерные массивы. Задание 1:
	// В массив A [N] занесены натуральные числа.
	// Найти сумму тех элементов, которые кратны данному К.

	public void task(int k) {
		int sum;
		int[] array;

		// инициализируем массив
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (100));
		}
		// выводим массив
		System.out.print("K = " + k + ", array =");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		// находим сумму
		sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % k == 0) {
				sum = sum + array[i];
			}
		}

		// выводим результат
		System.out.println("\nsum = " + sum);
	}

	public static void main(String[] args) {
		Task1 task = new Task1();
		task.task(3);
	}
}
