package com.java0tutor.oop.task4.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.java0tutor.oop.task4.bean.CaveOfDragon;
import com.java0tutor.oop.task4.bean.Treasure;
import com.java0tutor.oop.task4.dao.DaoException;
import com.java0tutor.oop.task4.dao.DaoProvider;
import com.java0tutor.oop.task4.dao.TreasureDao;
import com.java0tutor.oop.task4.service.ServiceException;
import com.java0tutor.oop.task4.service.TreasureService;

public class TreasureServiceImpl implements TreasureService {

	@Override
	public CaveOfDragon getTreasuresOfDragon() throws ServiceException {

		CaveOfDragon cave;
		DaoProvider provider;
		TreasureDao treasureDao;

		provider = DaoProvider.getInstance();
		treasureDao = provider.getTreasureDao();
		try {
			cave = treasureDao.getTreasuresOfDragon();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		return cave;
	}

	@Override
	public Treasure findMostExpensiveTreasure(CaveOfDragon cave) {

		Treasure treasure;
		String title;
		double max;

		treasure = new Treasure();
		max = 0;
		title = "";

		for (int i = 0; i < cave.getTreasures().size(); i++) {
			if (cave.getTreasures().get(i).getPrice() > max) {
				max = cave.getTreasures().get(i).getPrice();
				title = cave.getTreasures().get(i).getTitle();
			}
		}
		treasure.setTitle(title);
		treasure.setPrice(max);

		return treasure;
	}

	@Override
	public List<Treasure> findTreasuresForPrice(CaveOfDragon cave, double sum) {

		List<Treasure> treasure;

		treasure = new ArrayList<>();
		Collections.sort(cave.getTreasures());
		for (int i = 0; i < cave.getTreasures().size(); i++) {
			if (cave.getTreasures().get(i).getPrice() <= sum && sum > 0) {
				sum = sum - cave.getTreasures().get(i).getPrice();
				treasure.add(cave.getTreasures().get(i));
			}
		}
		return treasure;
	}

}
