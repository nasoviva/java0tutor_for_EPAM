package com.java0tutor.string.object.task9;

public class Task9 {
	// Работа со строкой как с объектом типа String или StringBuilder. Задание 9:
	// Посчитать количество строчных (маленьких) и прописных (больших) букв в
	// введенной строке. Учитывать только английские буквы.

	private String str;

	public Task9() {

	}

	public Task9(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int countOfLowSymbols(String str) {
		int count;

		count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) >= 97 && str.charAt(j) <= 122) {
				count++;
			}
		}
		return count;
	}

	public int countOfUppSymbols(String str) {
		int count;

		count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) >= 65 && str.charAt(j) <= 90) {
				count++;
			}
		}
		return count;
	}

}
