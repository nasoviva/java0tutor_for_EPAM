package com.java0tutor.oop.task4.service;

import com.java0tutor.oop.task4.service.impl.TreasureServiceImpl;

public class ServiceProvider {

	private static final ServiceProvider instance = new ServiceProvider();
	private TreasureService treasureService = new TreasureServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public TreasureService getTreasureService() {
		return treasureService;
	}
}
