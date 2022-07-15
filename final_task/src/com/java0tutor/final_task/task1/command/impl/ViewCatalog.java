package com.java0tutor.final_task.task1.command.impl;

import com.java0tutor.final_task.task1.command.Command;
import com.java0tutor.final_task.task1.service.ServiceException;

public class ViewCatalog implements Command {

	@Override
	public boolean execute(String request) throws ServiceException {
		boolean result;

		result = false;
		try {
			bookPresentation.printCatalog(bookService.getCatalog());
			result = true;
		} catch (ServiceException e) {
			throw new ServiceException(e);
		}
		return result;
	}

}
