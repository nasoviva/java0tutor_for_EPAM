package com.java0tutor.oop.task4.presentation.impl;

import java.util.List;

import com.java0tutor.oop.task4.bean.Treasure;
import com.java0tutor.oop.task4.presentation.TreasurePresentation;
import com.java0tutor.oop.task4.service.ServiceException;

public class TreasurePresentationImpl implements TreasurePresentation {

	@Override
	public void printTreasure(Treasure treasure) {
		System.out.print(treasure.getTitle());
		System.out.println(" " + treasure.getPrice());

	}

	@Override
	public void printError(ServiceException e) {
		System.err.println(e);

	}

	@Override
	public void printAllTreasures(List<Treasure> list) {
		for (int i = 0; i < list.size(); i++) {
			printTreasure(list.get(i));
		}

	}

}
