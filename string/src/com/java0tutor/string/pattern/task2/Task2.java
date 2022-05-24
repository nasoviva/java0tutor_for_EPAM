package com.java0tutor.string.pattern.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {

//	Работа с регулярными выражениями (Pattern, Matcher). Задание 2:
//	Дана строка, содержащая следующий текст (xml-документ):
//		<notes>
//		<note id = "1">
//		<to>Вася</to>
//		<from>Света</from>
//		<heading>Напоминание</heading>
//		<body>Позвони мне завтра!</body>
//		</note>
//		<note id = "2">
//		<to>Петя</to>
//		<from>Маша</from>
//		<heading>Важное напоминание</heading>
//		<body/>
//		</note>
//		</notes>
//	Напишите анализатор, позволяющий последовательно возвращать 
//	содержимое узлов xml-документа и его тип (открывающий тег,
//	закрывающий тег, содержимое тега, тег без тела). 
//  Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

	private String str;

	public Task2() {
	}

	public Task2(String str) {
		super();
		this.str = str;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public static void analiserXmlDocument(String str) {
		Pattern pattern = Pattern.compile("(<[^\\/].*?[^\\/]>(?<bodyTeg>.+?)<\\/.*?>)|"
				+ "(?<openTeg><[^\\/].*?[^\\/]>)|(?<nobodyTeg><.*?\\/>)|(?<closeTeg><\\/.*?>)");
		Matcher matcher = pattern.matcher(str);
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}
