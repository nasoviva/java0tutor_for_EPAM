package com.java0tutor.oop.task4.command.impl;

import com.java0tutor.oop.task4.bean.Treasure;
import com.java0tutor.oop.task4.command.Command;
import com.java0tutor.oop.task4.presentation.PresentationProvider;
import com.java0tutor.oop.task4.presentation.TreasurePresentation;
import com.java0tutor.oop.task4.service.ServiceException;
import com.java0tutor.oop.task4.service.ServiceProvider;
import com.java0tutor.oop.task4.service.TreasureService;

public class MostExpensiveTreasure implements Command {

	@Override
	public void execute(String request) throws ServiceException {

		ServiceProvider provider;
		TreasureService treasureService;
		PresentationProvider presentationProvider;
		TreasurePresentation treasurePresentation;

		provider = ServiceProvider.getInstance();
		treasureService = provider.getTreasureService();
		presentationProvider = PresentationProvider.getInstance();
		treasurePresentation = presentationProvider.getTreasurePresentation();

		try {
			Treasure treasure = treasureService.findMostExpensiveTreasure(treasureService.getTreasuresOfDragon());
			treasurePresentation.printTreasure(treasure);
		} catch (ServiceException e) {
			throw new ServiceException(e);
		}

	}

}