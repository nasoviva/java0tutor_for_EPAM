package com.java0tutor.string.object.task8;

public class Task8 {
	// Работа со строкой как с объектом типа String или StringBuilder. Задание 8:
	// Вводится строка слов, разделенных пробелами.
	// Найти самое длинное слово и вывести его на экран.
	// Случай, когда самых длинных слов может быть несколько, не обрабатывать.

	private String str;

	public Task8() {

	}

	public Task8(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String findLongestWord(String str) {
		String max_word;
		int max;
		int i;

		max = 0;
		max_word = new String();
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) != ' ') {
				i = 0;
				while (j + i < str.length() && str.charAt(j + i) != ' ') {
					i++;
				}
				if (i > max) {
					max = i;
					max_word = str.substring(j, j + i);
				}
				j = j + i;
			}
		}
		return max_word;
	}

}
