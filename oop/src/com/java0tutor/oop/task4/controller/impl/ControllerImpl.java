package com.java0tutor.oop.task4.controller.impl;

import com.java0tutor.oop.task4.command.Command;
import com.java0tutor.oop.task4.command.CommandProvider;
import com.java0tutor.oop.task4.controller.Controller;
import com.java0tutor.oop.task4.presentation.PresentationProvider;
import com.java0tutor.oop.task4.service.ServiceException;

public class ControllerImpl implements Controller {

	private static final CommandProvider provider = new CommandProvider();

	@Override
	public void doAction(String request) {
		String commandName;
		Command command;

		commandName = request.split(",")[0];
		command = provider.getCommand(commandName);

		if (command != null) {
			try {
				command.execute(request);
			} catch (ServiceException e) {
				e.printStackTrace();
				PresentationProvider.getInstance().getTreasurePresentation().printError(e);
			}
		} else {
			System.err.println("нет такой команды");
		}
	}

}
