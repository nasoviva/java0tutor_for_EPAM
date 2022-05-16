package com.java0tutor.string.array;

public class Task2 {
	// Работа со строкой как с массивом символов. Задание 2:
	// Замените в строке все вхождения 'word' на 'letter'.

	public void task(char[] str1) {
		char[] str2;

		str2 = new char[] {};
		for (int j = 0; j < (str1.length); j++) {
			System.out.print(str1[j]);
		}
		System.out.print(" = ");
		for (int i = 0; i < str1.length; i++) {
			str2 = changeArray(str1);
		}
		System.out.println(str2);
	}

	public char[] changeArray(char[] str) {
		char[] new_str;
		int i;

		i = 0;
		for (int j = 0; j < str.length; j++) {
			if (j + 3 < str.length && str[j] == 'w' && str[j + 1] == 'o' && str[j + 2] == 'r' && str[j + 3] == 'd') {
				j = j + 3;
				i = i + 2;
			}
		}
		new_str = new char[str.length + i];
		i = 0;
		for (int j = 0; j < str.length; j++) {
			if (j + 3 < str.length && str[j] == 'w' && str[j + 1] == 'o' && str[j + 2] == 'r' && str[j + 3] == 'd') {
				new_str[i] = 'l';
				new_str[i + 1] = 'e';
				new_str[i + 2] = 't';
				new_str[i + 3] = 't';
				new_str[i + 4] = 'e';
				new_str[i + 5] = 'r';
				i = i + 6;
				j = j + 3;
			} else {
				new_str[i] = str[j];
				i++;
			}
		}
		return new_str;
	}

	public static void main(String[] args) {
		char[] str;
		Task2 task = new Task2();

		str = new char[] { 'w', 'o', 'r', 'd', ' ', 'i', 's', ' ', 'l', 'e', 't', 't', 'e', 'r' };
		task.task(str);
	}
}
