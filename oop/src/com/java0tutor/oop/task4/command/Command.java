package com.java0tutor.oop.task4.command;

import com.java0tutor.oop.task4.presentation.PresentationProvider;
import com.java0tutor.oop.task4.presentation.TreasurePresentation;
import com.java0tutor.oop.task4.service.ServiceException;
import com.java0tutor.oop.task4.service.ServiceProvider;
import com.java0tutor.oop.task4.service.TreasureService;

public interface Command {

	static final ServiceProvider serviceProvider = ServiceProvider.getInstance();
	static final TreasureService treasureService = serviceProvider.getTreasureService();
	static final PresentationProvider presentationProvider = PresentationProvider.getInstance();
	static final TreasurePresentation treasurePresentation = presentationProvider.getTreasurePresentation();

	void execute(String request) throws ServiceException;
}
