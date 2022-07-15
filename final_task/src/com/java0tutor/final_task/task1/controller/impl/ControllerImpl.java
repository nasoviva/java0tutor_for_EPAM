package com.java0tutor.final_task.task1.controller.impl;

import com.java0tutor.final_task.task1.command.Command;
import com.java0tutor.final_task.task1.command.CommandProvider;
import com.java0tutor.final_task.task1.controller.Controller;
import com.java0tutor.final_task.task1.presentation.PresentationProvider;
import com.java0tutor.final_task.task1.service.ServiceException;

public class ControllerImpl implements Controller {

	private static final CommandProvider provider = new CommandProvider();

	@Override
	public boolean doAction(String request) {
		String commandName;
		Command command;
		boolean result;

		result = false;
		commandName = request.split(",")[0];
		command = provider.getCommand(commandName);
		if (command != null) {
			try {
				result = command.execute(request);
			} catch (ServiceException e) {
				PresentationProvider.getInstance().getBookPresentation().printError(e);
				PresentationProvider.getInstance().getUserPresentation().printError(e);
			}
		} else {
			System.err.println("нет такой команды");
			return false;
		}
		return result;
	}

}
