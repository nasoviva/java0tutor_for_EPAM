package com.java0tutor.algorithmization.sorting;

public class Task4 {
	// Одномерные массивы. Сортировки. Задание 4:
	// Сортировка обменами. Дана последовательность чисел a1, a2...an.
	// Требуется переставить числа в порядке возрастания.
	// Для этого сравниваются два соседних числа a[i] и a[i+1] .
	// Если a[i] > a[i+1], то делается перестановка.
	// Так продолжается до тех пор, пока все элементы не станут расположены в
	// порядке возрастания.
	// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

	public void task() {
		int[] array;
		int tmp;
		int count;

		// инициализируем массив
		array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * (10));
		}

		// выводим массив
		System.out.print("\narray =");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}

		// cортировка обменами (пузырьковая)
		System.out.println("");
		count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
					count++;
					System.out.print("\ncurrent array =");
					for (int k = 0; k < array.length; k++) {
						System.out.print(" " + array[k]);
					}
				}
			}
		}

		// выводим результат
		System.out.print("\n\nКоличество перестановок = " + count + ", final array =");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	public static void main(String[] args) {
		Task4 task = new Task4();
		task.task();

	}

}
