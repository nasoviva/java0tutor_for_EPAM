package com.java0tutor.oop.task4.service;

import java.util.List;

import com.java0tutor.oop.task4.bean.CaveOfDragon;
import com.java0tutor.oop.task4.bean.Treasure;

public interface TreasureService {

	CaveOfDragon getTreasuresOfDragon() throws ServiceException;

	Treasure findMostExpensiveTreasure(CaveOfDragon cave);

	List<Treasure> findTreasuresForPrice(CaveOfDragon cave, double sum);

}
