package com.java0tutor.string.object.task10;

public class Main {

	public static void main(String[] args) {
		Task10 task = new Task10("Hello, World?...Hi!");

		System.out.println("Строка Х: <" + task.getStr() + ">");
		System.out.println("Количество предложений = " + task.countOfSentences(task.getStr()));
	}
}
