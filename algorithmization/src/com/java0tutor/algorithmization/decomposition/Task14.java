package com.java0tutor.algorithmization.decomposition;

public class Task14 {

	// Декомпозиция с использованием методов. Задание 14:
	// Натуральное число, в записи которого n цифр, называется числом Армстронга,
	// если сумма его цифр, возведенная в степень n, равна самому числу.
	// Найти все числа Армстронга от 1 до k.
	// Для решения задачи использовать декомпозицию.

	private int k;

	public Task14() {

	}

	public Task14(int k) {
		super();
		this.k = k;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public void result() {
		if (k <= 1) {
			System.out.println("Измените параметры");
			return;
		}
		findNumberOfArmstrong();
	}

	public void findNumberOfArmstrong() {
		int[] array;
		int i;
		int j;

		i = 1;
		j = 0;
		while (i <= k) {
			array = initArray(i);
			if (countSumOfElements(array) == i) {
				System.out.println("" + i + " является числом Армстронга");
				j++;
			}
			i++;
		}
		if (i == k && j == 0)
			System.out.println("В заданном промежутке от " + 1 + " до " + k + " нет чисел Армстронга");
	}

	public int countSumOfElements(int[] array) {
		int sum;

		sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + (int) Math.pow(array[i], array.length);
		}
		return sum;
	}

	public int[] initArray(int num) {
		int[] array;
		String str;
		int length;

		str = Integer.toString(num);
		length = str.length();
		array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = str.charAt(i) - '0';
		}
		return array;
	}

	public static void main(String[] args) {
		Task14 task = new Task14(55000);
		task.result();
	}

}
