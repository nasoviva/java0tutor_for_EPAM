package com.java0tutor.algorithmization.decomposition;

public class Task11 {

	// Декомпозиция с использованием методов. Задание 11:
	// Написать метод(методы), определяющий,
	// в каком из данных двух чисел больше цифр.

	private int a;
	private int b;

	public Task11() {

	}

	public Task11(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void result() {
		if (countDigitsOfNumber(a) > countDigitsOfNumber(b))
			System.out.println("Больше цифр в числе " + a);
		else if (countDigitsOfNumber(a) < countDigitsOfNumber(b))
			System.out.println("Больше цифр в числе " + b);
		else
			System.out.println("Количество цифр в числах " + a + " и " + b + " одинаковое");
	}

	public int countDigitsOfNumber(int n) {
		String str;
		int length;

		str = Integer.toString(n);
		length = str.length();
		return length;
	}

	public static void main(String[] args) {
		Task11 task = new Task11(1523, 22);
		task.result();

	}

}
