package com.java0tutor.basic.cycle;

public class Task6 {
	// Циклы. Задание 6:
	// Вывести на экран соответствий между символами и их численными обозначениями в
	// памяти компьютера.

	public void task() {
		for (int i = 0; i <= 255; i++)
			System.out.println("адрес = " + i + ", символ = " + (char) i);
	}

	public static void main(String[] args) {
		Task6 task = new Task6();
		task.task();
	}
}
