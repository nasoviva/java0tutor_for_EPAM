package com.java0tutor.string.object.task7;

public class Task7 {
	// Работа со строкой как с объектом типа String или StringBuilder. Задание 7:
	// Вводится строка. Требуется удалить из нее повторяющиеся символы и пробелы.
	// Например, если было введено "abc cde def", то должно быть выведено "abcdef".

	private String str;

	public Task7() {

	}

	public Task7(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public String updString(String str) {
		String new_str;

		new_str = "";
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (new_str.indexOf(str.charAt(i)) < 0 && str.charAt(i) != ' ')
					new_str = new_str + str.charAt(i);
			}
		}
		return new_str;
	}

}
