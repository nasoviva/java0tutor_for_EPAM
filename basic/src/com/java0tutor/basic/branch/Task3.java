package com.java0tutor.basic.branch;

public class Task3 {
	// Ветвления. Задание 3:");
	// Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3).
	// Определить, будут ли они расположены на одной прямой.

	public void task(double x1, double y1, double x2, double y2, double x3, double y3) {
		System.out.println("А(" + x1 + ", " + y1 + "), " + "B(" + x2 + ", " + y2 + "), " + "C(" + x3 + ", " + y3 + ")");

		// уравнение прямой (y3 - y1) / (y2 - y1) = (x3 - x1) / (x2 - x1)
		if ((y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1))
			System.out.println("Точки расположены на одной прямой.");
		else
			System.out.println("Точки расположены не на одной прямой.");
	}

	public static void main(String[] args) {
		Task3 task = new Task3();
		task.task(1, 2, 3, 6, 2, 4);
	}
}
