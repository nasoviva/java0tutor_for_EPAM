package com.java0tutor.string.object.task7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str;

		System.out.print("Введите строку: ");
		Scanner console = new Scanner(System.in);
		str = console.nextLine();

		Task7 task = new Task7(str);
		System.out.println("Исходная строка: <" + str + ">");
		System.out.println("Итоговая строка: <" + task.updString(task.getStr()) + ">");

	}

}
