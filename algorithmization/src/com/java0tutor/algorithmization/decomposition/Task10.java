package com.java0tutor.algorithmization.decomposition;

public class Task10 {

	// Декомпозиция с использованием методов. Задание 10:
	// Дано натуральное число N. Написать метод(методы) для формирования массива,
	// элементами которого являются цифры числа N.

	private int n;

	public Task10() {

	}

	public Task10(int n) {
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
		int[] array;

		array = initArray(n);
		printResult(array, n);
	}

	public void printResult(int[] array, int n) {
		System.out.print("N = " + n + ", массив =");
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	public int[] initArray(int n) {
		int[] array;
		String str;
		int length;

		str = Integer.toString(n);
		length = str.length();
		array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = str.charAt(i) - '0';
		}
		return array;
	}

	public static void main(String[] args) {
		Task10 task = new Task10(345659660);
		task.result();
	}

}
