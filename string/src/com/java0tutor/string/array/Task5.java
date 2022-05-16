package com.java0tutor.string.array;

public class Task5 {
	// Работа со строкой как с массивом символов. Задание 5:
	// Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов
	// заменить на одиночные пробелы.
	// Крайние пробелы в строке удалить.

	public void task(char[] str) {
		char[] new_str;

		System.out.print("Исходная строка: <");
		for (int j = 0; j < (str.length); j++) {
			System.out.print(str[j]);
		}

		System.out.print(">\nИтоговая строка: <");
		new_str = checkSpaces(str);
		for (int j = 0; j < (new_str.length); j++) {
			System.out.print(new_str[j]);
		}
		System.out.print(">");
	}

	public char[] checkSpaces(char[] str) {
		char[] new_str;
		int start;
		int end;
		int space;
		int count;

		start = 0;
		end = 0;
		space = 0;
		count = 0;
		while (str[start] == ' ')
			start++;
		while (str[str.length - 1 - end] == ' ')
			end++;
		for (int j = start; j < str.length - end; j++) {
			if (str[j] == ' ') {
				while (str[j] == ' ') {
					j++;
					count++;
				}
				space++;

			}
		}
		space = count - space;
		count = 0;
		new_str = new char[str.length - start - end - space];
		for (int j = start; j < str.length - end; j++) {
			if (str[j] == ' ') {
				space = 0;
				while (str[j + space] == ' ')
					space++;
				j = j + space;
				new_str[count] = ' ';
				count++;

			}
			new_str[count] = str[j];
			count++;
		}
		return new_str;
	}

	public static void main(String[] args) {
		char[] str;
		Task5 task = new Task5();

		str = new char[] { ' ', ' ', 'H', 'e', 'l', 'l', 'o', ',', ' ', ' ', ' ', 'W', 'o', 'r', 'l', 'd', ' ', ' ' };
		task.task(str);
	}
}
