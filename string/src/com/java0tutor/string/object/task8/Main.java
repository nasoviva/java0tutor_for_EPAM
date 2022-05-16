package com.java0tutor.string.object.task8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String str;

		System.out.print("Введите строку: ");
		Scanner console = new Scanner(System.in);
		str = console.nextLine();

		Task8 task = new Task8(str);
		System.out.println("Исходная строка: <" + str + ">");
		System.out.println("Самое длинное слово: <" + task.findLongestWord(task.getStr()) + ">");
	}

}
