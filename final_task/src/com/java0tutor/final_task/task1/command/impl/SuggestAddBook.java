package com.java0tutor.final_task.task1.command.impl;

import com.java0tutor.final_task.task1.bean.Book;
import com.java0tutor.final_task.task1.command.Command;
import com.java0tutor.final_task.task1.service.ServiceException;

public class SuggestAddBook implements Command {

	@Override
	public boolean execute(String request) throws ServiceException {
		boolean result;
		String res;
		Book book;

		result = false;
		res = request.split(",")[1].trim();
		book = null;
		try {
			book = bookService.suggestAddBookInCatalog(res);
			if (book != null) {
				result = userService.sendMailAdmin(book);
			}
		} catch (ServiceException e) {
			throw new ServiceException(e);
		} finally {
			userPresentation.printResultOfCommand(result);
		}
		return result;
	}
}
