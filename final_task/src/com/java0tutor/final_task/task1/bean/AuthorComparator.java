package com.java0tutor.final_task.task1.bean;

import java.util.Comparator;

public class AuthorComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		if (o1.getAuthor().compareTo(o2.getAuthor()) > 0)
			return 1;
		else if (o1.getAuthor().compareTo(o2.getAuthor()) < 0)
			return -1;
		return 0;
	}
}
