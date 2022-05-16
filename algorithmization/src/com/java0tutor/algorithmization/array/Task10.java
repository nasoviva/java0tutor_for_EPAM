package com.java0tutor.algorithmization.array;

public class Task10 {
	// Одномерные массивы. Задание 10:
	// Дан целочисленный массив с количеством элементов п.
	// Сжать массив, выбросив из него каждый второй элемент (освободившиеся элементы
	// заполнить нулями). Дополнительный массив не использовать.

	public void task(int n) {
		int[] array;

		// инициализируем массив
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * (6));
		}
		// выводим массив
		System.out.print("n = " + n + ", array =");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + array[i]);
		}

		// меняем каждый четный элемент на ноль
		for (int i = 0; i < n; i++) {
			if (i % 2 == 0)
				array[i] = 0;
		}

		// выводим результат
		System.out.print("\narray =");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + array[i]);
		}
	}

	public static void main(String[] args) {
		Task10 task = new Task10();
		task.task(20);
	}
}
