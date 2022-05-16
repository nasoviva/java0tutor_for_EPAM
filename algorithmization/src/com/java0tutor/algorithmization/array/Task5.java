package com.java0tutor.algorithmization.array;

public class Task5 {
	// Одномерные массивы. Задание 5:
	// Даны целые числа а 1 ,а 2 ,..., а n .
	// Вывести на печать только те числа, для которых а [i] > i.

	public void task(int n) {
		int[] array;

		// инициализируем массив
		array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (10));
		}
		// выводим массив
		System.out.print("n = " + n + ", array =");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		// выводим результат
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i] > i)
				System.out.println("array[" + i + "] = " + array[i]);
		}
	}

	public static void main(String[] args) {
		Task5 task = new Task5();
		task.task(10);
	}
}
