package com.java0tutor.string.pattern.task2;

public class Main {

	public static void main(String[] args) {
		String s;

		s = """
				<notes>
				<note id = "1">
				<to>Вася</to>
				<from>Света</from>
				<heading>Напоминание</heading>
				<body>Позвони мне завтра!</body>
				</note>
				<note id = "2">
				<to>Петя</to>
				<from>Маша</from>
				<heading>Важное напоминание</heading>
				<body/>
				</note>
				</notes>""";
		Task2 task = new Task2(s);
		task.analiserXmlDocument(s);
	}

}
