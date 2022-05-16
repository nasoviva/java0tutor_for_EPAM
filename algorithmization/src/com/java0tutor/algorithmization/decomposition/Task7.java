package com.java0tutor.algorithmization.decomposition;

public class Task7 {

	// Декомпозиция с использованием методов. Задание 7:
	// Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел
	// от 1 до 9.

	public void result() {
		int num;
		int sum;

		num = 1;
		sum = 0;
		while (num <= 9) {
			if (num % 2 != 0)
				sum = sum + findFactorial(num);
			num++;
		}
		System.out.println("Сумма факториалов всех нечетных чисел от 1 до 9 равна " + sum);
	}

	public int findFactorial(int x) {
		int result;

		result = 1;
		for (int i = 1; i <= x; i++) {
			result = result * i;
		}
		return result;
	}

	public static void main(String[] args) {
		Task7 task = new Task7();
		task.result();

	}

}
