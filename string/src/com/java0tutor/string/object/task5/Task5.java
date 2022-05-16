package com.java0tutor.string.object.task5;

public class Task5 {
	// Работа со строкой как с объектом типа String или StringBuilder. Задание 5:
	// Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

	private String str;

	public Task5() {

	}

	public Task5(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int countOfSymbol(String str, char a) {
		int count;
		count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (a == str.charAt(i)) {
				count++;
			}
		}
		return count;
	}
}
