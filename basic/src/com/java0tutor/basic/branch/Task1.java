package com.java0tutor.basic.branch;

public class Task1 {
	// Ветвления. Задание 1:
	// Даны два угла треугольника (в градусах).
	// Определить, существует ли такой треугольник, и если да, то будет ли он
	// прямоугольным.
	// Сумма углов треугольника на евклидовой плоскости равна 180°

	public void task(int a, int b) {
		System.out.println("угол а = " + a + "°, угол b = " + b + "°");
		if (a + b >= 180)
			System.out.println("Треугольник не существует.");
		else if (a == 90 || b == 90 || (a + b) == 90)
			System.out.println("Треугольник существует. треугольник прямоугольный.");
		else if (a > 0 && b > 0 && a + b < 180)
			System.out.println("Треугольник существует.");
	}

	public static void main(String[] args) {
		Task1 task = new Task1();
		task.task(44, 45);
	}
}
