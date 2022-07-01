package com.java0tutor.oop.task4.dao;

public class DaoException extends Exception {

	private static final long serialVersionUID = 1L;

	public DaoException() {

	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Exception e) {
		super(e);
	}

	public DaoException(String message, Exception e) {
		super(message, e);
	}

}
