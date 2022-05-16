package com.java0tutor.basic.branch;

public class Task4 {
	// Ветвления. Задание 4:
	// Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича
	// Определить, пройдет ли кирпич через отверстие.

	public void task(double a, double b, double x, double y, double z) {
		System.out.println("А = " + a + ", B = " + b + ", x = " + x + ", y = " + y + ", z = " + z);

		if ((a >= x && b >= y) || (a >= x && b >= z) || (a >= y && b >= z) || (b >= x && a >= y) || (b >= x && a >= z)
				|| (b >= y && a >= z))
			System.out.println("Кирпич пройдет через отверстие.");
		else
			System.out.println("Кирпич не пройдет через отверстие.");
	}

	public static void main(String[] args) {
		Task4 task = new Task4();
		task.task(3, 2, 3, 64, 2);
	}
}
