package com.java0tutor.final_task.task1.presentation;

import java.util.List;

import com.java0tutor.final_task.task1.bean.User;
import com.java0tutor.final_task.task1.service.ServiceException;

public interface UserPresentation {

	public void printAllUsers(List<User> list);

	public void printUserInfo(User user);

	public void printError(ServiceException e);

	public boolean printResultOfCommand(boolean result);

}
