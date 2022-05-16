package com.java0tutor.basic.cycle;

public class Task5 {
	// Циклы. Задание 5:
	// Даны числовой ряд и некоторое число е.
	// Найти сумму тех членов ряда, модуль которых больше или равен заданному е.
	// Общий член ряда имеет вид: a(n) = 1 / 2^n + 1 / 3^n

	public void task(int n, double e) {
		double sum;
		double a;

		sum = 0;
		a = 0;
		for (int i = 0; i <= n; i++) {
			a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
			if (Math.abs(a) >= e) // Math.abs дает модуль числа
				sum = sum + a;
		}

		System.out.println("n = " + n + ", e = " + e);
		System.out.println("sum = " + sum);
	}

	public static void main(String[] args) {
		Task5 task = new Task5();
		task.task(5, 0.1);
	}
}
