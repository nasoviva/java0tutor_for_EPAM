package com.java0tutor.algorithmization.array;

public class Task9 {
	// Одномерные массивы. Задание 9:
	// В массиве целых чисел с количеством элементов n найти наиболее часто
	// встречающееся число.
	// Если таких чисел несколько, то определить наименьшее из них.

	public void task(int n) {
		int[] array;
		int num;
		int count;
		int j;
		int max_num;
		int max_count;

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

		// находим наиболее часто встречающееся число
		j = 0;
		max_num = 0;
		max_count = 0;
		while (j < array.length) {
			num = array[j];
			count = 0;
			for (int i = 0; i < n; i++) {
				if (array[i] == num) {
					count++;
				}
			}
			if (count > max_count) {
				max_count = count;
				max_num = num;
			} else if (count == max_count) {
				if (num < max_num) {
					max_num = num;
				}

			}
			j++;
		}

		// выводим результат
		System.out.println("\nНаиболее часто встречающееся число = " + max_num);
	}

	public static void main(String[] args) {
		Task9 task = new Task9();
		task.task(20);
	}
}
