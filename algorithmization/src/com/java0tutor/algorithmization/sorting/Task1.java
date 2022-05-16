package com.java0tutor.algorithmization.sorting;

public class Task1 {
	// Одномерные массивы. Сортировки. Задание 1:
	// Заданы два одномерных массива с различным количеством элементов и натуральное
	// число k. Объединить их в один массив, включив второй между k-м и (k+1)-м
	// элементами первого, при этом не используя дополнительный массив.

	public void task(int a, int b, int k) {
		int[] array1;
		int[] array2;
		int[] new_array;

		if (k >= a) {
			System.out.println("k больше последнего элемента первого массива");
			return;
		}
		// инициализируем массивы
		array1 = new int[a];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * (10));
		}
		array2 = new int[b];
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (Math.random() * (10));
		}
		// выводим массивы
		System.out.print("k = " + k + "\narray1 =");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array1[i]);
		}
		System.out.print("\narray2 =");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array2[i]);
		}

		// объединяем
		System.out.println("");
		new_array = new int[a + b];
		for (int i = 0; i < new_array.length; i++) {
			if (i <= k)
				new_array[i] = array1[i];
			else if (i > k && i - k <= array2.length)
				new_array[i] = array2[i - k - 1];
			else if (i > k && i - k > array2.length)
				new_array[i] = array1[i - array2.length];
		}

		// выводим результат
		System.out.print("\nnew_array =");
		for (int i = 0; i < new_array.length; i++) {
			System.out.print(" " + new_array[i]);
		}
	}

	public static void main(String[] args) {
		Task1 task = new Task1();
		task.task(5, 7, 2);

	}

}
