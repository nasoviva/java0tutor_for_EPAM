package com.java0tutor.string.object.task1;

public class Task1 {
	// Работа со строкой как с объектом типа String или StringBuilder. Задание 1:
	// Дан текст (строка).
	// Найдите наибольшее количество подряд идущих пробелов в нем.

	private String str;

	public Task1() {

	}

	public Task1(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int maxCountOfSpaces(String str) {
		int count;
		int i;
		int k;

		count = 0;
		k = 0;
		while (str.charAt(str.length() - 1 - k) == ' ')
			k++;
		if (k > count)
			count = k;
		for (int j = 0; j < str.length() - k; j++) {
			if (str.charAt(j) == ' ') {
				i = 0;
				while (str.charAt(j + i) == ' ') {
					i++;
				}
				if (i > count)
					count = i;
			}
		}
		return count;
	}
}
