package com.java0tutor.final_task.task1.dao;

import com.java0tutor.final_task.task1.dao.impl.FileBookDao;
import com.java0tutor.final_task.task1.dao.impl.FileUserDao;

public class DaoProvider {
	private static final DaoProvider instance = new DaoProvider();
	private BookDao bookDao = new FileBookDao();
	private UserDao userDao = new FileUserDao();

	private DaoProvider() {
	}

	public static DaoProvider getInstance() {
		return instance;
	}

	public BookDao getBookDao() {
		return bookDao;
	}

	public UserDao getUserDao() {
		return userDao;
	}
}
