package com.java0tutor.string.pattern.task1;

public class Main {

	public static void main(String[] args) {
		String s;

		s = "1_Aaaaxba 1_Aaxxaaaa x. Ccxcc dxxd dxx. Fxfff xgg.\n2_xH xii jjxj. lxk lx mxxm.\n3_lxNnn aoj pxxp o a rrrx o sxs.";
		Task1 task = new Task1(s);

		System.out.println("Исходная строка:\n" + task.getStr());
		System.out.println("\nСортировка абзацев по количеству предложений:");
		System.out.println(task.sortParagraphs());
		System.out.println("\nСортировка слов в предложении по длине:");
		System.out.println(task.sortWordsInSentences());
		System.out.println("Сортировка лексем в предложении по убыванию вхождений символа:");
		System.out.println(task.sortLexemesInSentences('x'));
	}
}
