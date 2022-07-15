package com.java0tutor.final_task.task1.command.impl;

import com.java0tutor.final_task.task1.command.Command;
import com.java0tutor.final_task.task1.service.ServiceException;

public class AddBookInCatalog implements Command {

	@Override
	public boolean execute(String request) throws ServiceException {
		boolean result;
		String res;

		result = false;
		res = request.split(",")[1].trim();
		try {
			result = bookPresentation.printResultOfCommand(bookService.addBookInCatalog(res));
			if (result == true) {
				result = userService.sendMail(bookService.getCatalog().get(bookService.getCatalog().size() - 1));
			}
		} catch (ServiceException e) {
			throw new ServiceException(e);
		} finally {
			userPresentation.printResultOfCommand(result);
		}
		return result;
	}

}
