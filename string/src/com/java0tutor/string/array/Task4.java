package com.java0tutor.string.array;

public class Task4 {
	// Работа со строкой как с массивом символов. Задание 4:
	// В строке найти количество чисел.

	public void task(char[] str) {
		System.out.print("Количество чисел в строке <");
		for (int j = 0; j < (str.length); j++) {
			System.out.print(str[j]);
		}
		System.out.println("> равно " + countOfNumbers(str));
	}

	public int countOfNumbers(char[] str) {
		int count;

		count = 0;
		for (int j = 0; j < str.length; j++) {
			if (str[j] >= 48 && str[j] <= 57) {
				while (str[j] >= 48 && str[j] <= 57) {
					j++;
				}
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		char[] str;
		Task4 task = new Task4();

		str = new char[] { '1', '2', 'H', 'e', 'l', 'l', 'o', ',', ' ', '3', 'W', 'o', '4', '5', 'r', 'l', 'd' };
		task.task(str);
	}
}
