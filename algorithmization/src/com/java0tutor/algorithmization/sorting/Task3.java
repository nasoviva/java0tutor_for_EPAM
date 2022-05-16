package com.java0tutor.algorithmization.sorting;

public class Task3 {
	// Одномерные массивы. Сортировки. Задание 3:
	// Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an.
	// Требуется переставить элементы так, чтобы они были расположены по убыванию.
	// Для этого в массиве, начиная с первого, выбирается наибольший элемент
	// и ставится на первое место, а первый - на место наибольшего.
	// Затем, начиная со второго, эта процедура повторяется.
	// Написать алгоритм сортировки выбором.

	public void task() {
		int[] array;
		int tmp;
		int count;
		int max;
		int x;

		// инициализируем массив
		array = new int[10];
		x = 0;
		for (int i = 0; i < array.length; i++) {
			array[i] = x;
			x = x + 5;
		}

		// выводим массив
		System.out.print("\narray =");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		// cортировка выбором
		System.out.println("");
		count = 0;

		for (int i = 0; i < array.length; i++) {
			max = array[i];
			count = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] > max) {
					max = array[j];
					count = j;
				}
			}
			tmp = array[i];
			array[i] = max;
			array[count] = tmp;
			System.out.print("\ncurrent array =");
			for (int k = 0; k < array.length; k++) {
				System.out.print(" " + array[k]);
			}
		}

		// выводим результат
		System.out.print("\n\nfinal array =");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	public static void main(String[] args) {
		Task3 task = new Task3();
		task.task();
	}

}
