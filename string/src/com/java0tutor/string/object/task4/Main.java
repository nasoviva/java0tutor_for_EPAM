package com.java0tutor.string.object.task4;

public class Main {

	public static void main(String[] args) {
		Task4 task = new Task4("информатика");
		char[] result;

		result = new char[] { 'т', 'о', 'р', 'т' };
		System.out.println("Дано слово: " + task.getStr());
		System.out.println("Новое слово: " + task.createNewWord(task.getStr(), result));
	}

}
