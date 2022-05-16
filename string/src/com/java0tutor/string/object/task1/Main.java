package com.java0tutor.string.object.task1;

public class Main {

	public static void main(String[] args) {
		Task1 task = new Task1("      H       e   l  l o   , World   !            ");

		System.out.println("Исходная строка: \"" + task.getStr() + "\"");
		System.out.println("Наибольшее количество подряд идущих пробелов: " + task.maxCountOfSpaces(task.getStr()));

	}

}
