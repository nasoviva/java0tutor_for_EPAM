package com.java0tutor.oop.task5.exception;

public class GiftException extends Exception {

	private static final long serialVersionUID = -4829378062303719594L;

	public GiftException() {

	}

	public GiftException(String message) {
		super(message);
	}

	public GiftException(Exception e) {
		super(e);
	}

	public GiftException(String message, Exception e) {
		super(message, e);
	}
}
