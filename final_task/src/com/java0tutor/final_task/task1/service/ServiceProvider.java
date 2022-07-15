package com.java0tutor.final_task.task1.service;

import com.java0tutor.final_task.task1.service.impl.BookServiceImpl;
import com.java0tutor.final_task.task1.service.impl.UserServiceImpl;

public class ServiceProvider {
	private static final ServiceProvider instance = new ServiceProvider();
	private BookService bookService = new BookServiceImpl();
	private UserService userService = new UserServiceImpl();

	private ServiceProvider() {
	}

	public static ServiceProvider getInstance() {
		return instance;
	}

	public BookService getBookService() {
		return bookService;
	}

	public UserService getUserService() {
		return userService;
	}
}
