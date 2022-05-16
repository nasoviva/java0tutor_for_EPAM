package com.java0tutor.algorithmization.decomposition;

public class Task15 {

	// Декомпозиция с использованием методов. Задание 15:
	// Найти все натуральные n-значные числа, цифры в которых образуют строго
	// возрастающую последовательность (например, 1234, 5789).

	private int n;

	public Task15() {

	}

	public Task15(int n) {
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
		int max;
		int min;

		if (n < 1 || n > 9) {
			System.out.println("Измените параметры");
			return;
		}
		max = findMaxValue();
		min = findMinValue();
		findAllValues(min, max);
	}

	public void findAllValues(int min, int max) {
		String str;
		int value;
		int j;

		j = 0;
		str = "";
		value = min;
		System.out.println("Список " + n + "-значных чисел, цифры в которых образуют возрастающую последовательность:");
		while (value < max) {
			for (int i = 1; i <= n; i++) {
				str = str + Integer.toString(i + j);
			}
			if (str.length() <= n) {
				value = Integer.parseInt(str);
				System.out.print(" " + value);
				str = "";
				j++;
			} else
				value = max;
		}
	}

	public int findMaxValue() {
		String str;

		str = "9";
		for (int i = 1; i < n; i++) {
			str = str + "9";
		}
		return Integer.parseInt(str);
	}

	public int findMinValue() {
		String str;

		str = "1";
		for (int i = 1; i < n; i++) {
			str = str + "0";
		}
		return Integer.parseInt(str);
	}

	public static void main(String[] args) {
		Task15 task = new Task15(4);
		task.result();

	}

}
