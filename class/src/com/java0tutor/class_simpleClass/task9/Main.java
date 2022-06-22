package com.java0tutor.class_simpleClass.task9;

import com.java0tutor.class_simpleClass.task9.entity.Book;
import com.java0tutor.class_simpleClass.task9.entity.Library;
import com.java0tutor.class_simpleClass.task9.entity.TypeOfCover;
import com.java0tutor.class_simpleClass.task9.logic.LibraryLogic;
import com.java0tutor.class_simpleClass.task9.view.View;

public class Main {

	public static void main(String[] args) {
		Library lib = new Library(5);
		View view = new View();
		LibraryLogic logic = new LibraryLogic();

		lib.add(new Book(1, "Война и мир", "Толстой", "Москва", 1985, 605, 355.40, TypeOfCover.Твердый));
		lib.add(new Book(2, "Идиот", "Достоевский", "Москва", 1988, 890, 159.2, TypeOfCover.Твердый));
		lib.add(new Book(3, "Анна Каренина", "Толстой", "СПБ", 2010, 680, 320, TypeOfCover.Твердый));
		lib.add(new Book(4, "Очарованный странник", "Лесков", "Ленинград", 1956, 702, 305, TypeOfCover.Мягкий));
		lib.add(new Book(5, "Басни", "Крылов", "Москва", 1970, 205, 155.20, TypeOfCover.Мягкий));

		System.out.println("Список книг заданного автора:");
		view.printLib(logic.findBooksOfAuthorSurmane(lib, "толстой"));
		System.out.println("\nСписок книг, выпущенных заданным издательством:");
		view.printLib(logic.findBooksOfPublishingHouse(lib, "москва"));
		System.out.println("\nСписок книг, выпущенных после заданного года:");
		view.printLib(logic.findBooksOfYearsOfPublishing(lib, 2001));
	}

}
