package com.java0tutor.algorithmization.decomposition;

public class Task16 {
	// Декомпозиция с использованием методов. Задание 16:
	// Написать программу, определяющую сумму n - значных чисел,
	// содержащих только нечетные цифры.
	// Определить также, сколько четных цифр в найденной сумме.

	private int n;

	public Task16() {

	}

	public Task16(int n) {
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
		long sum;
		long max;
		long min;
		int count;

		if (n < 1 || n > 9) {
			System.out.println("Измените параметры");
			return;
		}
		max = findMaxValue();
		min = findMinValue();
		sum = findSum(min, max);
		count = countEvenDigits(sum);
		System.out.println("Сумма " + n + "-значных нечетных чисел равна: " + sum);
		System.out.println("Количество четных цифр в найденной сумме: " + count);
	}

	public int countEvenDigits(long sum) {
		int count;
		String str;

		count = 0;
		str = Long.toString(sum);
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) - '0') % 2 == 0)
				count++;
		}
		return count;
	}

	public int countOddDigits(long min, long max) {
		int count;
		long value;

		count = 0;
		value = min;
		while (value <= max) {
			if (value % 2 != 0) {
				count++;
			}
			value++;
		}
		return count;
	}

	public long findSum(long min, long max) {
		long sum;
		int count;

		count = countOddDigits(min, max);
		sum = (min + 1 + max) * count / 2;
		return sum;
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
		Task16 task = new Task16(4);
		task.result();
	}

}
