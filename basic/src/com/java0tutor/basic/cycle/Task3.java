package com.java0tutor.basic.cycle;

public class Task3 {
	// Циклы. Задание 3:
	// Найти сумму квадратов первых ста чисел.

	public void task() {
		int result;
		int x;

		result = 0;
		for (int i = 0; i <= 100; i++) {
			x = (int) Math.pow(i, 2);
			result = result + x;
		}
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {
		Task3 task = new Task3();
		task.task();
	}
}
