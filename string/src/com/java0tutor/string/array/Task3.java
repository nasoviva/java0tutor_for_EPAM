package com.java0tutor.string.array;

public class Task3 {
	// Работа со строкой как с массивом символов. Задание 3:
	// В строке найти количество цифр.

	public void task(char[] str) {
		System.out.print("Количество цифр в строке <");
		for (int j = 0; j < (str.length); j++) {
			System.out.print(str[j]);
		}
		System.out.println("> равно " + countOfDigits(str));
	}

	public int countOfDigits(char[] str) {
		int count;

		count = 0;
		for (int j = 0; j < str.length; j++) {
			if (str[j] >= 48 && str[j] <= 57) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		char[] str;
		Task3 task = new Task3();

		str = new char[] { '1', '2', 'H', 'e', 'l', 'l', 'o', ',', ' ', '3', 'W', 'o', '4', 'r', 'l', '5', 'd' };
		task.task(str);
	}
}
