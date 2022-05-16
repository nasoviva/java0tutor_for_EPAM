package com.java0tutor.algorithmization.sorting;

public class Task5 {
	// Одномерные массивы. Сортировки. Задание 5:
	// Сортировка вставками. Дана последовательность чисел a1, a2...an. Требуется
	// переставить числа в порядке
	// возрастания. Делается это следующим образом. Пусть a1, a2,..., ai -
	// упорядоченная последовательность, т. е.
	// a1 <= a2 <=...<= an. Берется следующее число ai + 1 и вставляется в
	// последовательность так, чтобы новая
	// последовательность была тоже возрастающей. Процесс производится до тех пор,
	// пока все элементы от i+1 до n
	// не будут перебраны. Примечание. Место помещения очередного элемента в
	// отсортированную часть производить
	// с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

	public void task() {
		int[] array;
		int tmp;
		int count;
		int new_id;

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
		System.out.println("");

		// cортировка вставками
		for (int i = 1; i < array.length; i++) {
			count = i - 1;
			tmp = array[i];
			while (count >= 0 && tmp < array[count]) {
				array[count + 1] = array[count];
				count--;
			}
			array[count + 1] = tmp;
			new_id = binarySearch(array, 0, i, tmp);
			System.out.println("\narray[" + i + "]= " + tmp + ", new_id= " + new_id);
			System.out.print("current array =");
			for (int j = 0; j < array.length; j++) {
				System.out.print(" " + array[j]);
			}
		}

		// выводим результат
		System.out.print("\n\nfinal array =");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	public int binarySearch(int arr[], int start, int end, int elem) {

		if (start > end)
			return -1;
		while (start <= end) {
			int mid = (end + start) / 2;
			if (elem == arr[mid])
				return mid;
			else if (elem < arr[mid])
				end = mid - 1;
			else if (elem > arr[mid])
				start = mid + 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		Task5 task = new Task5();
		task.task();
	}
}
