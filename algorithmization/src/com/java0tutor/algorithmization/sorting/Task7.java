package com.java0tutor.algorithmization.sorting;

public class Task7 {
	// Одномерные массивы. Сортировки. Задание 7:
	// Пусть даны две неубывающие последовательности действительных чисел a1 <= a2
	// <= ... <= an и b1 <= b2 <=...<= bm.
	// Требуется указать те места, на которые нужно вставлять элементы
	// последовательности b1 <= b2 <=...<= bm в первую
	// последовательность так, чтобы новая последовательность оставалась
	// возрастающей.

	public void task() {
		int[] array1;
		int[] array2;
		int x;
		int y;

		// инициализируем массивы
		array1 = new int[10];
		x = 0;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = x;
			x = x + 1;
		}
		array2 = new int[10];
		x = 0;
		for (int i = 0; i < array2.length; i++) {
			array2[i] = x;
			x = x + 3;
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

		// решение
		System.out.println("");
		x = 0;
		y = 0;
		for (int i = 0; i < array1.length + array2.length; i++) {
			if (y >= array2.length || (x < array1.length && array1[x] < array2[y])) {
				x++;
			} else if (x >= array1.length || (y < array2.length && array1[x] >= array2[y])) {
				System.out.println("array2[" + y + "] = " + array2[y] + " нужно вставить на позицию " + i);
				y++;
			}
		}
	}

	public static void main(String[] args) {
		Task7 task = new Task7();
		task.task();

	}

}
