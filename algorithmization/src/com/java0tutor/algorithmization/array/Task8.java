package com.java0tutor.algorithmization.array;

public class Task8 {
	// Одномерные массивы. Задание 8:
	// Дана последовательность целых чисел a1 , a2 ,..., an.
	// Образовать новую последовательность, выбросив из исходной те члены, которые
	// равны min( a1 , a2 , ... , an ).

	public void task(int n) {
		int[] array;
		int[] array_new;
		int min;
		int num;
		int j;

		// инициализируем массив
		array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = (int) (Math.random() * (10));
		}
		// выводим массив
		System.out.print("n = " + n + ", array =");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + array[i]);
		}

		// находим min
		min = array[0];// a[0]+a[n]
		for (int i = 1; i < n; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		// считаем количество min
		num = 0;
		for (int i = 0; i < n; i++) {
			if (array[i] == min) {
				num++;
			}
		}

		// заполняем новый массив
		j = 0;
		array_new = new int[n - num];
		for (int i = 0; i < n; i++) {
			if (array[i] != min) {
				array_new[j] = array[i];
				j++;
			}
		}

		// выводим результат
		System.out.print("\nnew array =");
		for (int i = 0; i < array_new.length; i++) {
			System.out.print(" " + array_new[i]);
		}
	}

	public static void main(String[] args) {
		Task8 task = new Task8();
		task.task(10);
	}
}
