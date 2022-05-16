package com.java0tutor.algorithmization.decomposition;

public class Task12 {

	// Декомпозиция с использованием методов. Задание 12:
	// Даны натуральные числа К и N.
	// Написать метод(методы) формирования массива А, элементами которого
	// являются числа, сумма цифр которых равна К и которые не большее N.

	private int k;
	private int n;

	public Task12() {

	}

	public Task12(int k, int n) {
		super();
		this.k = k;
		this.n = n;
	}

	public int getK() {
		return k;
	}

	public void setK(int k) {
		this.k = k;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public void result() {
		int[] a;
		int length;

		length = countLengthOfArray();
		if (length == 0) {
			System.out.println("Не удалось сформировать массив. Измените параметры");
			return;
		}
		a = createArray(length);
		printResult(a, "K = " + k + ", N = " + n + "\nмассив =");
	}

	public void printResult(int[] array, String str) {
		System.out.print(str);
		for (int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
		}
	}

	public int[] createArray(int length) {
		int[] array;
		int num;

		array = new int[length];
		length = 0;
		num = 0;
		while (num <= n) {
			if (countSumDigitsOfNumber(num) == k) {
				array[length] = num;
				length++;
			}
			num++;
		}
		return array;
	}

	public int countLengthOfArray() {
		int length;
		int num;

		num = 0;
		length = 0;
		while (num <= n) {
			if (countSumDigitsOfNumber(num) == k) {// если сумма цифр равна К, нам это подходит
				length++;
			}
			num++;
		}
		return length;
	}

	public int countSumDigitsOfNumber(int num) {// считаем сумму цифр от 1 до N
		int[] array;
		int sum;

		array = createArrayOfDigits(num);// получаем из числа от 1 до N цифры и кладем их в массив
		sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public int[] createArrayOfDigits(int num) {
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
		Task12 task = new Task12(15, 200);
		task.result();

	}

}
