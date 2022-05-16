package com.java0tutor.basic.linear;

public class Task2 {
	// Линейный программы. Задание 2:");
	// Вычислить значение выражения по формуле:
	// ((b + √(b^2 + 4ac)) / 2a) − a^3*c + b^-2

	public void task(double a, double b, double c) {
		double tmp;
		double tmp2;
		double result;

		tmp = Math.pow(b, 2);
		tmp = Math.sqrt(tmp + 4.0 * a * c);
		result = (b + tmp) / 2.0 * a;
		tmp = Math.pow(a, 3);
		tmp2 = Math.pow(b, -2);
		result = result - ((tmp * c) + tmp2);

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {
		Task2 task = new Task2();
		task.task(8, 4, 4);
	}
}
