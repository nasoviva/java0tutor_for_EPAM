package com.java0tutor.algorithmization.decomposition;

public class Task13 {

	// Декомпозиция с использованием методов. Задание 13:
	// Два простых числа называются «близнецами»,
	// если они отличаются друг от друга на 2 (например, 41 и 43).
	// Найти и напечатать все пары «близнецов» из отрезка [n,2n],
	// где n - заданное натуральное число больше 2.
	// Для решения задачи использовать декомпозицию.

	private int n;

	public Task13() {

	}

	public Task13(int n) {
		super();
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void result() {

		int length;
		int[] array;

		if (n <= 2) {
			System.out.println("Измените параметры");
			return;
		}
		length = countLengthOfArray();
		array = createArray(length);
		findSimpleTwins(array);
	}

	public int countLengthOfArray() {
		int num;
		int length;
		int i;

		num = n;
		i = 2;
		length = 0;
		while (num < n * 2) {
			if (num % i != 0) {
				i++;
				if (i == num) {
					length++;
					num++;
					i = 2;
				}
			} else if (num % i == 0) {
				num++;
				i = 2;
			}
		}
		return length;
	}

	public int[] createArray(int length) {
		int num;
		int[] array;
		int i;

		array = new int[length];
		num = n;
		i = 2;
		length = 0;
		while (num < n * 2) {
			if (num % i != 0) {
				i++;
				if (i == num) {
					array[length] = num;
					length++;
					num++;
					i = 2;
				}
			} else if (num % i == 0) {
				num++;
				i = 2;
			}
		}
		return array;
	}

	public void findSimpleTwins(int[] array) {
		int i;

		i = 0;
		for (int j = 1; j < array.length - 1; j++) {
			if (array[j] - array[j - 1] == 2) {
				System.out.println("" + array[j - 1] + ", " + array[j]);
				i++;
			}
		}
		if (i == 0)
			System.out.println("В заданном промежутке от " + n + " до " + 2 * n + " нет простых чисел \"близнецов\"");
	}

	public static void main(String[] args) {
		Task13 task = new Task13(20);
		task.result();

	}

}
