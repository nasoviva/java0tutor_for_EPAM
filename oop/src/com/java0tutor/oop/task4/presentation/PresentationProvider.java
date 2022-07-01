package com.java0tutor.oop.task4.presentation;

import com.java0tutor.oop.task4.presentation.impl.TreasurePresentationImpl;

public class PresentationProvider {

	private static final PresentationProvider instance = new PresentationProvider();
	private TreasurePresentation treasurePresentation = new TreasurePresentationImpl();

	private PresentationProvider() {
	}

	public static PresentationProvider getInstance() {
		return instance;
	}

	public TreasurePresentation getTreasurePresentation() {
		return treasurePresentation;
	}
}
