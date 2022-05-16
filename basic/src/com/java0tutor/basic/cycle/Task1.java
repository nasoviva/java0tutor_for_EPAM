package com.java0tutor.basic.cycle;

import java.util.Scanner;

public class Task1 {
	// Циклы. Задание 1:
	// Напишите программу, где пользователь вводит любое целое положительное число.
	// А программа суммирует все числа от 1 до введенного пользователем числа.

	public void task() {
		int num;
		int sum;

		sum = 0;
		while (sum <= 0) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите число: ");
			if (scanner.hasNextInt()) {
				num = scanner.nextInt();
				if (num > 65535)
					System.out.println("Вы ввели слишком большое число");
				else if (num <= 0)
					System.out.println("Вы ввели слишком маленькое число");
				else {
					for (int i = 0; i <= num; i++)
						sum = sum + i;
					System.out.println("Cумма от 1 до " + num + " = " + sum);
				}
			} else {
				System.out.println("Вы ввели не целое число");
			}
		}
	}

	public static void main(String[] args) {
		Task1 task = new Task1();
		task.task();
	}
}
