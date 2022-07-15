package com.java0tutor.final_task.task1.command.impl;

import com.java0tutor.final_task.task1.command.Command;
import com.java0tutor.final_task.task1.service.ServiceException;

public class SortBooksByAuthor implements Command {

	@Override
	public boolean execute(String request) throws ServiceException {
		boolean result;

		result = false;
		try {
			result = bookPresentation.printResultOfCommand(bookService.sortBooksByAuthor());
		} catch (ServiceException e) {
			throw new ServiceException(e);
		}
		return result;
	}

}
