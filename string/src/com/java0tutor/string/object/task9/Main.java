package com.java0tutor.string.object.task9;

public class Main {

	public static void main(String[] args) {
		Task9 task = new Task9("Hello, World!");

		System.out.println("Исходная строка: <" + task.getStr() + ">");
		System.out.println("Количество строчных букв = " + task.countOfLowSymbols(task.getStr()));
		System.out.println("Количество строчных прописных букв = " + task.countOfUppSymbols(task.getStr()));
	}

}
