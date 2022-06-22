package com.java0tutor.class_simpleClass.task9.logic;

import com.java0tutor.class_simpleClass.task9.entity.Library;

public class LibraryLogic {

	public Library findBooksOfAuthorSurmane(Library lib, String author) {
		Library newLib;
		int count;

		count = countOfBooksByAuthorSurmane(lib, author);
		if (count > 0) {
			newLib = new Library(count);
			for (int i = 0; i < lib.getBook().length; i++) {
				if (lib.getBook()[i].getAuthor().toUpperCase().compareTo(author.toUpperCase()) == 0) {
					newLib.add(lib.getBook()[i]);
				}
			}
			return newLib;
		}
		return null;
	}

	public Library findBooksOfPublishingHouse(Library lib, String publishingHouse) {
		Library newLib;
		int count;

		count = countOfBooksByPublishingHouse(lib, publishingHouse);
		if (count > 0) {
			newLib = new Library(count);
			for (int i = 0; i < lib.getBook().length; i++) {
				if (lib.getBook()[i].getPublishingHouse().toUpperCase().compareTo(publishingHouse.toUpperCase()) == 0) {
					newLib.add(lib.getBook()[i]);
				}
			}
			return newLib;
		}
		return null;
	}

	public Library findBooksOfYearsOfPublishing(Library lib, int yearOfPublishing) {
		Library newLib;
		int count;

		count = countOfBooksByYearsOfPublishing(lib, yearOfPublishing);
		if (count > 0) {
			newLib = new Library(count);
			for (int i = 0; i < lib.getBook().length; i++) {
				if (lib.getBook()[i].getYearOfPublishing() >= yearOfPublishing) {
					newLib.add(lib.getBook()[i]);
				}
			}
			return newLib;
		}
		return null;
	}

	private int countOfBooksByAuthorSurmane(Library lib, String str) {
		int count;

		count = 0;
		for (int i = 0; i < lib.getBook().length; i++) {
			if (lib.getBook()[i].getAuthor().toUpperCase().compareTo(str.toUpperCase()) == 0) {
				count++;
			}
		}
		return count;
	}

	private int countOfBooksByPublishingHouse(Library lib, String str) {
		int count;

		count = 0;
		for (int i = 0; i < lib.getBook().length; i++) {
			if (lib.getBook()[i].getPublishingHouse().toUpperCase().compareTo(str.toUpperCase()) == 0) {
				count++;
			}
		}
		return count;
	}

	private int countOfBooksByYearsOfPublishing(Library lib, int x) {
		int count;

		count = 0;
		for (int i = 0; i < lib.getBook().length; i++) {
			if (lib.getBook()[i].getYearOfPublishing() >= x) {
				count++;
			}
		}
		return count;
	}
}
