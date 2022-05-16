package com.java0tutor.string.object.task3;

public class Task3 {
	// Работа со строкой как с объектом типа String или StringBuilder. Задание 3:
	// Проверить, является ли заданное слово палиндромом.

	private String str;

	public Task3() {

	}

	public Task3(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public Boolean checkWord(String str) {
		Boolean result;
		String str1;

		result = false;
		str1 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str1 = str1 + str.charAt(i);
		}
		result = str.equals(str1);
		return result;
	}
}
