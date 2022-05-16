package com.java0tutor.string.array;

public class Task1 {
	// Работа со строкой как с массивом символов. Задание 1:
	// Дан массив названий переменных в camelCase.
	// Преобразовать названия в snake_case.

	public void task() {
		char[][] str;
		str = new char[4][];

		str[0] = new char[] { 'i', 't', 'I', 's', 'W', 'i', 'n', 't', 'e', 'r' };
		str[1] = new char[] { 'i', 't', 'I', 's', 'S', 'p', 'r', 'i', 'n', 'g' };
		str[2] = new char[] { 'i', 't', 'I', 's', 'S', 'u', 'm', 'm', 'e', 'r' };
		str[3] = new char[] { 'i', 't', 'I', 's', 'A', 'u', 't', 'u', 'm', 'n' };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < (str[i].length); j++) {
				System.out.print(str[i][j]);
			}
			System.out.print(" = ");
			str[i] = changeArray(str[i]);
			System.out.println(str[i]);
		}
	}

	public char[] changeArray(char[] str) {
		char[] new_str;
		int i;

		new_str = new char[str.length + 2];
		for (int j = 0; j < (str.length + 2); j++) {
			new_str[j] = ' ';
		}
		i = 0;
		for (int j = 0; j < str.length; j++) {
			if (str[j] >= 65 && str[j] <= 90) {
				new_str[i] = '_';
				i++;
				new_str[i] = (char) (str[j] + 32);
				i++;

			} else if (str[j] < 65 || str[j] > 90) {
				new_str[i] = str[j];
				i++;
			}
		}
		return new_str;
	}

	public static void main(String[] args) {
		Task1 task = new Task1();
		task.task();
	}

}
