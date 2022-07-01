package com.java0tutor.oop.task4.presentation;

import java.util.List;

import com.java0tutor.oop.task4.bean.Treasure;
import com.java0tutor.oop.task4.service.ServiceException;

public interface TreasurePresentation {

	public void printAllTreasures(List<Treasure> list);

	public void printTreasure(Treasure treasure);

	public void printError(ServiceException e);

}
