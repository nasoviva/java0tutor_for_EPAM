package com.java0tutor.class_simpleClass.task9.entity;

import java.util.Arrays;

public class Library {
	private int numberOfBooks;
	private int count;
	private Book[] book;

	public Library(int numberOfBooks) {
		if (numberOfBooks > 0) {
			book = new Book[numberOfBooks];
			count = 0;
		} else {
			book = null;
			count = 0;
			numberOfBooks = 0;
		}

	}

	public void add(Book newBook) {
		if (count < book.length) {
			book[count] = newBook;
			count++;
		}
	}

	public int getNumberOfBooks() {
		return numberOfBooks;
	}

	public int getCount() {
		return count;
	}

	public Book[] getBook() {
		return book;
	}

	public void setBook(Book[] book) {
		this.book = book;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(book);
		result = prime * result + count;
		result = prime * result + numberOfBooks;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		if (!Arrays.equals(book, other.book))
			return false;
		if (count != other.count)
			return false;
		if (numberOfBooks != other.numberOfBooks)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Library [numberOfBooks=" + numberOfBooks + ", count=" + count + ", book=" + Arrays.toString(book) + "]";
	}

}
