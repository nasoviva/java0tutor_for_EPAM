package com.java0tutor.string.object.task5;

public class Main {

	public static void main(String[] args) {
		Task5 task = new Task5("Java");
		char a;

		a = 'a';
		System.out.println("В слове <" + task.getStr() + ">");
		System.out.println("буква \"" + a + "\" встречается " + task.countOfSymbol(task.getStr(), a) + " раз(а)");
	}

}
