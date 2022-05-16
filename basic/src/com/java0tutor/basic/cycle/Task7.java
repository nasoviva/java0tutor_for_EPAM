package com.java0tutor.basic.cycle;

import java.util.Scanner;

public class Task7 {
	// Циклы. Задание 7:
	// Для каждого натурального числа от m до n вывести делители, кроме единицы и
	// самого числа.
	// m и n вводятся с клавиатуры.

	public void task() {
		int m;
		int n;
		int del;
		int i;

		m = 0;
		n = 0;
		// ввод данных с клавиатуры
		while (m == 0 || m >= n) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Введите число m, с которого начнется промежуток чисел: ");
			if (scanner.hasNextInt()) {
				m = scanner.nextInt();
				if (m <= 0)
					System.out.println("Вы ввели слишком маленькое число");
				else {
					while (n == 0) {
						Scanner scanner1 = new Scanner(System.in);
						System.out.print("Введите число n, которым завершится промежуток чисел: ");
						if (scanner1.hasNextInt()) {
							n = scanner1.nextInt();
							if (m >= n) {
								System.out.println("Вы ввели число m, которое больше или равно n. Попробуйте снова");
								m = 0;
								n = 0;
							} else if (n <= 0)
								System.out.println("Вы ввели слишком маленькое число");
						} else
							System.out.println("Вы допустили ошибку");
					}
				}
			} else
				System.out.println("Вы допустили ошибку");
		}
		System.out.println("m = " + m + ", n = " + n);

		// поиск делителей
		del = 1;
		i = m;
		while (i <= n) {
			System.out.print("число = " + i + ", делители:");
			while (del < i) {
				if (i % del == 0 && del != 1) {
					System.out.print(" " + del);
				}
				del++;
			}
			del = 1;
			i++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Task7 task = new Task7();
		task.task();
	}
}
