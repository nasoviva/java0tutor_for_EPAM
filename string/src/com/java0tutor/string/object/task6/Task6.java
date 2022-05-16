package com.java0tutor.string.object.task6;

public class Task6 {

	// Работа со строкой как с объектом типа String или StringBuilder. Задание 6:
	// Из заданной строки получить новую, повторив каждый символ дважды.

	private String str;

	public Task6() {

	}

	public Task6(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String repeatEverySymbol(String str) {
		String new_str;

		new_str = "";
		for (int i = 0; i < str.length(); i++) {
			new_str = new_str + str.charAt(i) + str.charAt(i);
		}
		return new_str;
	}
}
