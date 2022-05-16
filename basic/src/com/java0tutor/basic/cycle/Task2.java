package com.java0tutor.basic.cycle;

public class Task2 {
	// Циклы. Задание 2:
	// Вычислить значения функции на отрезке [а,b] c шагом h.
	// y = x, если x > 2 или y = - x, если x <= 2\n

	public void task(int a, int b, int h) {
		int y;

		System.out.println("a = " + a + ", b = " + b + ", h = " + h + "\n");
		y = 0;
		while (a <= b) {
			if (a > 2)
				y = a;
			else
				y = -a;
			System.out.println("a = " + a + ", y = " + y);
			a = a + h;
		}
	}

	public static void main(String[] args) {
		Task2 task = new Task2();
		task.task(2, 5, 1);
	}
}
