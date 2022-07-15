package com.java0tutor.final_task.task1.presentation;

import java.util.List;

import com.java0tutor.final_task.task1.bean.Book;
import com.java0tutor.final_task.task1.service.ServiceException;

public interface BookPresentation {
	void printCatalog(List<Book> list);

	void printBook(Book treasure);

	void printError(ServiceException e);

	boolean printResultOfCommand(boolean result);

}
