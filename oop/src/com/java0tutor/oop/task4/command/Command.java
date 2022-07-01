package com.java0tutor.oop.task4.command;

import com.java0tutor.oop.task4.service.ServiceException;

public interface Command {
	void execute(String request) throws ServiceException;
}
