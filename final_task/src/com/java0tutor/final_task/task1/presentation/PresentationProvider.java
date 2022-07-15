package com.java0tutor.final_task.task1.presentation;

import com.java0tutor.final_task.task1.presentation.impl.BookPresentationImpl;
import com.java0tutor.final_task.task1.presentation.impl.UserPresentationImpl;

public class PresentationProvider {
	private static final PresentationProvider instance = new PresentationProvider();
	private BookPresentation bookPresentation = new BookPresentationImpl();
	private UserPresentation userPresentation = new UserPresentationImpl();

	private PresentationProvider() {
	}

	public static PresentationProvider getInstance() {
		return instance;
	}

	public BookPresentation getBookPresentation() {
		return bookPresentation;
	}

	public UserPresentation getUserPresentation() {
		return userPresentation;
	}
}
