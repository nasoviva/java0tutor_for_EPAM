package com.java0tutor.string.object.task6;

public class Main {

	public static void main(String[] args) {
		Task6 task = new Task6("Java");

		System.out.println("Исходная строка: <" + task.getStr() + ">");
		System.out.println("Итоговая строка: <" + task.repeatEverySymbol(task.getStr()) + ">");
	}

}
