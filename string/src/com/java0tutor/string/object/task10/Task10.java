package com.java0tutor.string.object.task10;

public class Task10 {

	// Работа со строкой как с объектом типа String или StringBuilder. Задание 10:
	// Строка X состоит из нескольких предложений,
	// каждое из которых кончается точкой, восклицательным или вопросительным
	// знаком. Определить количество предложений в строке X.

	private String str;

	public Task10() {

	}

	public Task10(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public int countOfSentences(String str) {
		int count;

		count = 0;
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == 33 || str.charAt(j) == 46 || str.charAt(j) == 63) {
				while (j < str.length() && (str.charAt(j) == 33 || str.charAt(j) == 46 || str.charAt(j) == 63)) {
					j++;
				}
				count++;
			}
		}
		return count;
	}

}
