package com.java0tutor.string.object.task3;

public class Main {

	public static void main(String[] args) {
		Task3 task = new Task3("abba");

		if (task.checkWord(task.getStr()))
			System.out.println("Слово: " + task.getStr() + " является палиндромом");
		else
			System.out.println("Слово: " + task.getStr() + " не является палиндромом");

	}
}
