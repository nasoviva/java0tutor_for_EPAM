package com.java0tutor.final_task.task1.presentation.impl;

import java.util.List;

import com.java0tutor.final_task.task1.bean.Book;
import com.java0tutor.final_task.task1.presentation.BookPresentation;
import com.java0tutor.final_task.task1.service.ServiceException;

public class BookPresentationImpl implements BookPresentation {

	@Override
	public void printCatalog(List<Book> list) {
		int pageSize;
		int pageMax;
		int page;

		pageSize = 3;
		pageMax = list.size() / pageSize + 1;
		page = 1;
		if (list.size() == 0) {
			System.out.println("книги не найдены");
		} else {
			System.out.println("\nСписок книг:\n");
			while (page <= pageMax) {
				list.stream().skip((page - 1) * pageSize).limit(pageSize).forEach(s -> printBook(s));
				System.out.println("-----------------" + page + "-----------------\n");
				page++;
			}
		}
	}

	@Override
	public void printBook(Book book) {
		System.out.println("Id: " + book.getId());
		System.out.println("Тип: " + book.getType());
		System.out.println("Название: " + book.getTitle());
		System.out.println("Автор: " + book.getAuthor());
		System.out.println("Описание: " + book.getDescription() + "\n");
	}

	@Override
	public void printError(ServiceException e) {
		System.err.println(e);
	}

	@Override
	public boolean printResultOfCommand(boolean result) {
		if (result)
			System.out.println("успешно");
		else
			System.out.println("не удалось выполнить действие, попробуйте снова");
		return result;

	}

}
