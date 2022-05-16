package com.java0tutor.string.object.task4;

public class Task4 {
	// Работа со строкой как с объектом типа String или StringBuilder. Задание 4:
	// С помощью функции копирования и операции конкатенации составить из частей
	// слова “информатика” слово “торт”.

	private String str;

	public Task4() {

	}

	public Task4(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String createNewWord(String str1, char[] str2) {
		String new_str;
		int index;

		new_str = new String();
		index = 0;
		for (int i = 0; i < str2.length; i++) {
			index = str1.indexOf(str2[i]);
			if (index < 0)
				return "";
			new_str = new_str + str1.substring(index, index + 1);
		}
		return new_str;
	}

}
