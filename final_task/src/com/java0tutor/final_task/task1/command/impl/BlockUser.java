package com.java0tutor.final_task.task1.command.impl;

import com.java0tutor.final_task.task1.command.Command;
import com.java0tutor.final_task.task1.service.ServiceException;

public class BlockUser implements Command {

	@Override
	public boolean execute(String request) throws ServiceException {
		boolean result;
		String res;

		result = false;
		res = request.split(",")[1].trim();
		try {
			result = userPresentation.printResultOfCommand(userService.blockUser(res));
		} catch (ServiceException e) {
			throw new ServiceException(e);
		}
		return result;
	}

}
