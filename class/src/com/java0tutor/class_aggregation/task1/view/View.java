package com.java0tutor.class_aggregation.task1.view;

import com.java0tutor.class_aggregation.task1.entity.Sentence;
import com.java0tutor.class_aggregation.task1.entity.Text;

public class View {

	public void printText(Text text) {
		if (text.getText().size() == 0) {
			System.out.println("Текст отсутствует\n");
			return;
		}
		for (int i = 0; i < text.getText().size(); i++) {
			printSentence(text.getText().get(i));
		}
		System.out.println();
	}

	public void printHeader(String header) {
		if (header.length() == 0) {
			System.out.println("Заголовок отсутствует\n");
			return;
		}
		System.out.println(header);
		System.out.println();
	}

	public void printSentence(Sentence sentence) {
		if (sentence.getSentence().size() == 0) {
			System.out.println("Заголовок отсутствует\n");
			return;
		}
		for (int i = 0; i < sentence.getSentence().size(); i++) {
			System.out.print(sentence.getSentence().get(i).getSymbols());
		}
	}
}
