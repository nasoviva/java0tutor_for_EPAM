package com.java0tutor.oop.task4.dao;

import com.java0tutor.oop.task4.dao.impl.FileTreasureDao;

public class DaoProvider {

	private static final DaoProvider instance = new DaoProvider();
	private TreasureDao treasureDao = new FileTreasureDao();

	private DaoProvider() {
	}

	public static DaoProvider getInstance() {
		return instance;
	}

	public TreasureDao getTreasureDao() {
		return treasureDao;
	}
}
