package com.java0tutor.class_aggregation.task1;

import com.java0tutor.class_aggregation.task1.entity.Sentence;
import com.java0tutor.class_aggregation.task1.entity.Text;
import com.java0tutor.class_aggregation.task1.entity.Word;
import com.java0tutor.class_aggregation.task1.view.View;

//Programming with classes. Агрегация и композиция. Задание 1:
//Создать объект класса Текст, используя классы Предложение, Слово. 
//Методы: дополнить текст, вывести на консоль текст, заголовок текста.

public class Main {

	public static void main(String[] args) {
		View view = new View();
		Text text = new Text();
		String header;
		Sentence sentence = new Sentence();
		Sentence sentence2 = new Sentence();

		sentence.addWord(new Word("Hello,"));
		sentence.addWord(new Word("world"));
		sentence2.addWord(new Word("It"));
		sentence2.addWord(new Word("is"));
		sentence2.addWord(new Word("me"));
		header = new String("Hello!");
		text.setHeader(header);
		text.addText(sentence);
		text.addText(sentence2);

		view.printHeader(header);
		view.printText(text);
	}

}
