package com.java0tutor.oop.task4.controller;

import com.java0tutor.oop.task4.command.Command;
import com.java0tutor.oop.task4.command.CommandProvider;
import com.java0tutor.oop.task4.presentation.PresentationProvider;
import com.java0tutor.oop.task4.service.ServiceException;

public class Controller {

	private static final CommandProvider provider = new CommandProvider();

	public void doAction(String request) {
		String commandName;
		Command command;
		PresentationProvider presentationProvider;

		commandName = request.split(",")[0];
		command = provider.getCommand(commandName);
		presentationProvider = PresentationProvider.getInstance();

		if (command != null) {
			try {
				command.execute(request);
			} catch (ServiceException e) {
				presentationProvider.getTreasurePresentation().printError(e);
			}
		} else {
			System.err.println("нет такой команды");
		}
	}

}
