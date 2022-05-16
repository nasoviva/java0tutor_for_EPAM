package com.java0tutor.algorithmization.sorting;

public class Task2 {
	// Одномерные массивы. Сортировки. Задание 2:
	// Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm .
	// Образовать из них новую последовательность чисел так, чтобы она тоже была
	// неубывающей. Дополнительный массив не использовать.

	public void task() {
		int[] array1;
		int[] array2;
		int[] new_array;
		int x;
		int y;

		// инициализируем массивы
		array1 = new int[10];
		x = 0;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = x;
			x = x + 5;
		}
		array2 = new int[10];
		x = 0;
		for (int i = 0; i < array2.length; i++) {
			array2[i] = x;
			x++;
		}
		// выводим массивы
		System.out.print("\narray1 =");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(" " + array1[i]);
		}
		System.out.print("\narray2 =");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(" " + array2[i]);
		}

		// объединяем
		System.out.println("");
		new_array = new int[array1.length + array2.length];
		x = 0;
		y = 0;
		for (int i = 0; i < new_array.length; i++) {
			if (y >= array2.length || (x < array1.length && array1[x] < array2[y])) {
				new_array[i] = array1[x];
				x++;
			} else if (x >= array1.length || (y < array2.length && array1[x] >= array2[y])) {
				new_array[i] = array2[y];
				y++;
			}
		}

		// выводим результат
		System.out.print("\nnew_array =");
		for (int i = 0; i < new_array.length; i++) {
			System.out.print(" " + new_array[i]);
		}
	}

	public static void main(String[] args) {
		Task2 task = new Task2();
		task.task();
	}

}
