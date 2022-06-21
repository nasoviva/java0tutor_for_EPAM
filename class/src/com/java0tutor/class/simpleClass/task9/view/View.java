package com.java0tutor.simpleClass.task9.view;

import com.java0tutor.simpleClass.task9.entity.Library;

public class View {
	public void printLib(Library lib) {
		if (lib == null) {
			System.out.println("Список пуст");
			return;
		}
		for (int i = 0; i < lib.getBook().length; i++) {
			System.out.println("ID: " + lib.getBook()[i].getId());
			System.out.println("Название: " + lib.getBook()[i].getTitle());
			System.out.println("Автор: " + lib.getBook()[i].getAuthor());
			System.out.println("Издательство: " + lib.getBook()[i].getPublishingHouse());
			System.out.println("Год издания: " + lib.getBook()[i].getYearOfPublishing() + " г.");
			System.out.println("Кол-во страниц: " + lib.getBook()[i].getNumberOfPages() + " стр.");
			System.out.println("Цена: " + lib.getBook()[i].getPrice() + " руб.");
			System.out.println("Тип переплета: " + lib.getBook()[i].getCoverType() + "\n");
		}
	}
}
