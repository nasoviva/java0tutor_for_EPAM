package com.java0tutor.oop.task4.command.impl;

import com.java0tutor.oop.task4.command.Command;
import com.java0tutor.oop.task4.service.ServiceException;
import com.java0tutor.oop.task4.service.util.Validator;

public class FindTreasuresForPrice implements Command {

	@Override
	public void execute(String request) throws ServiceException {

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
