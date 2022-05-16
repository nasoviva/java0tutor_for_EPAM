package com.java0tutor.basic.linear;

public class Task3 {
	// Линейный программы. Задание 3:
	// Вычислить значение выражения по формуле
	// ((sin x + cos y) / (cos x - sin y)) * tg x * y

	public void task(double x, double y) {
		double sin_x;
		double cos_x;
		double sin_y;
		double cos_y;
		double result;

		sin_x = Math.sin(x);
		cos_y = Math.cos(y);
		sin_y = Math.sin(y);
		cos_x = Math.cos(x);
		result = (sin_x + cos_y) / (cos_x - sin_y);
		result = result * (sin_x / cos_x) * y;// tg α = sin α ÷ cos α

		System.out.println("x = " + x + ", y = " + y);
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {
		Task3 task = new Task3();
		task.task(8, 4);
	}
}
