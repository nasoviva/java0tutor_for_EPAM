package com.java0tutor.algorithmization.sorting;

public class Task6 {
	// Одномерные массивы. Сортировки. Задание 6:
	// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
	// его по возрастанию.
	// Делается это следующим образом: сравниваются два соседних элемента
	// a[i] и a[i + 1]. Если a[i] <= a[i + 1],
	// то продвигаются на один элемент вперед. Если a[i] > a[i + 1], то производится
	// перестановка и сдвигаются
	// на один элемент назад. Составить алгоритм этой сортировки.

	public void task() {
		int[] array;
		int tmp;
		int i;

		// инициализируем массив
		array = new int[10];
		for (int j = 0; j < array.length; j++) {
			array[j] = (int) (Math.random() * (10));
		}

		// выводим массив
		System.out.print("\narray =");
		for (int j = 0; j < array.length; j++) {
			System.out.print(" " + array[j]);
		}
		System.out.println("");

		// cортировка Шелла
		i = 0;
		while (i < array.length - 1) {
			if (array[i] <= array[i + 1])
				i++;
			else {
				tmp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = tmp;
				if (i > 0)
					i = i - 1;
				else
					i = 0;
				System.out.print("\ncurrent array =");
				for (int j = 0; j < array.length; j++) {
					System.out.print(" " + array[j]);
				}
			}
		}

		// выводим результат
		System.out.print("\n\nfinal array =");
		for (int j = 0; j < array.length; j++) {
			System.out.print(" " + array[j]);
		}
	}

	public static void main(String[] args) {
		Task6 task = new Task6();
		task.task();

	}

}
