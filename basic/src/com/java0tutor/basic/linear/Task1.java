package com.java0tutor.basic.linear;

public class Task1 {
	// Линейный программы. Задание 1:
	// Найдите значение функции: z = ( (a – 3) * b / 2) + c

	public void task(double a, double b, double c) {
		double tmp;
		double z;

		tmp = a - 3.0;
		tmp = tmp * b;
		z = tmp / 2.0 + c;

		System.out.println("a = " + a + ", b = " + b + ", c = " + c);
		System.out.println("z = " + z);
	}

	public static void main(String[] args) {
		Task1 task = new Task1();
		task.task(8.0, 4.0, 4.0);

	}

}
