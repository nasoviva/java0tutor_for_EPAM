package com.java0tutor.string.object.task2;

public class Task2 {

	// Работа со строкой как с объектом типа String или StringBuilder. Задание 2:
	// В строке вставить после каждого символа 'a' символ 'b'.

	private String str;

	public Task2() {

	}

	public Task2(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String addSymbol(String str, char c) {
		String new_str;

		new_str = "";
		for (int j = 0; j < str.length(); j++) {
			if (str.charAt(j) == 'a') {
				new_str = new_str + str.charAt(j) + c;
			} else {
				new_str = new_str + str.charAt(j);
			}
		}
		return new_str;
	}
}
