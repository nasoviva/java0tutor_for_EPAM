package com.java0tutor.oop.task4.command.impl;

import com.java0tutor.oop.task4.command.Command;
import com.java0tutor.oop.task4.service.ServiceException;

public class ViewAllTreasuresCommand implements Command {

	@Override
	public void execute(String request) throws ServiceException {

		try {
			treasurePresentation.printAllTreasures(treasureService.getTreasuresOfDragon().getTreasures());
		} catch (ServiceException e) {
			throw new ServiceException(e);
		}
	}

}
