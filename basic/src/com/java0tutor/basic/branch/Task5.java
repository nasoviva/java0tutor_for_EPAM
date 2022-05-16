package com.java0tutor.basic.branch;

public class Task5 {
	// Ветвления. Задание 5:
	// Вычислить значение функции:
	// F(x) = x^2 - 3 * x + 9, если x <= 3 или F(x) = 1 / (x^3 + 6), если x > 3

	public void task(double x) {
		double result;
		double tmp;

		if (x <= 3) {
			tmp = Math.pow(x, 2);
			result = tmp - 3.0 * x + 9.0;
		} else {
			tmp = Math.pow(x, 3);
			result = 1.0 / (tmp + 6.0);
		}
		System.out.println("F(" + x + ") = " + result);
	}

	public static void main(String[] args) {
		Task5 task = new Task5();
		task.task(4);
	}
}
