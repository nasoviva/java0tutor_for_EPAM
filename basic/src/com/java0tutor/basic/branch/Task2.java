package com.java0tutor.basic.branch;

public class Task2 {
	// Ветвления. Задание 2:
	// Найти max{min(a, b), min(c, d)}
	// a = " + a + ", b = " + b + ", c = " + c + ", d = " + d

	public void task(double a, double b, double c, double d) {
		double max;
		double min_ab;
		double min_cd;

		// min(a, b)
		if (a < b)
			min_ab = a;
		else if (a > b)
			min_ab = b;
		else {
			System.out.println("a = b, no min in (a, b)");
			min_ab = a;
		}

		// min(c, d)
		if (c < d)
			min_cd = c;
		else if (c > d)
			min_cd = d;
		else {
			System.out.println("c = d, no min in (c, d)");
			min_cd = c;
		}

		// max
		if (min_ab < min_cd) {
			max = min_cd;
			System.out.println("max = " + max);
		} else if (min_ab > min_cd) {
			max = min_ab;
			System.out.println("max = " + max);
		} else
			System.out.println("no max");
	}

	public static void main(String[] args) {
		Task2 task = new Task2();
		task.task(44, 11, 1, 2);
	}
}
