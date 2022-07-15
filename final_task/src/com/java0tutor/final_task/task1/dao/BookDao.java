package com.java0tutor.final_task.task1.dao;

import java.util.List;

import com.java0tutor.final_task.task1.bean.Book;

public interface BookDao {

	List<Book> getCatalog() throws DaoException;

	void setCatalog(List<Book> catalog) throws DaoException;

	void removeBookFromCatalog(int idForRemove) throws DaoException;

	void addBookInCatalog(Book book) throws DaoException;

}
