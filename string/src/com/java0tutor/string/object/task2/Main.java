package com.java0tutor.string.object.task2;

public class Main {

	public static void main(String[] args) {
		Task2 task = new Task2("a b c a");
		System.out.println("Исходная строка: <" + task.getStr() + ">");
		System.out.println("Итоговая строка: <" + task.addSymbol(task.getStr(), 'b') + ">");
	}
}
