package com.java0tutor.oop.task4.command.impl;

import com.java0tutor.oop.task4.command.Command;
import com.java0tutor.oop.task4.presentation.PresentationProvider;
import com.java0tutor.oop.task4.presentation.TreasurePresentation;
import com.java0tutor.oop.task4.service.ServiceException;
import com.java0tutor.oop.task4.service.ServiceProvider;
import com.java0tutor.oop.task4.service.TreasureService;
import com.java0tutor.oop.task4.service.util.Validator;

public class FindTreasuresForPrice implements Command {

	@Override
	public void execute(String request) throws ServiceException {

		ServiceProvider serviceProvider;
		TreasureService treasureService;
		PresentationProvider presentationProvider;
		TreasurePresentation treasurePresentation;

		serviceProvider = ServiceProvider.getInstance();
		treasureService = serviceProvider.getTreasureService();
		presentationProvider = PresentationProvider.getInstance();
		treasurePresentation = presentationProvider.getTreasurePresentation();

		double sum;

		if (!(Validator.isValid(request)))
			System.err.println("данные некорректны");
		else {

			try {
				sum = Double.valueOf(request.split(",")[1]);
				treasurePresentation.printAllTreasures(
						treasureService.findTreasuresForPrice(treasureService.getTreasuresOfDragon(), sum));
			} catch (ServiceException e) {
				throw new ServiceException(e);
			}
		}
	}
}
