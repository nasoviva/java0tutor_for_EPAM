package com.java0tutor.final_task.task1.service;

import java.util.List;

import com.java0tutor.final_task.task1.bean.Book;

public interface BookService {

	List<Book> getCatalog() throws ServiceException;

	boolean removeBookFromCatalog(String str) throws ServiceException;

	boolean addBookInCatalog(String str) throws ServiceException;

	boolean sortBooksByAuthor() throws ServiceException;

	boolean sortBooksById() throws ServiceException;

	List<Book> searchBooksByTitle(String str) throws ServiceException;

	List<Book> searchBooksByAuthor(String str) throws ServiceException;

	List<Book> searchBooksByDescription(String str) throws ServiceException;

	Book suggestAddBookInCatalog(String str) throws ServiceException;
}
