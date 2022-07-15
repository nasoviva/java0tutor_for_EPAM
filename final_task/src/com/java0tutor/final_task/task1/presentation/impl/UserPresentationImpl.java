package com.java0tutor.final_task.task1.presentation.impl;

import java.util.List;

import com.java0tutor.final_task.task1.bean.User;
import com.java0tutor.final_task.task1.presentation.UserPresentation;
import com.java0tutor.final_task.task1.service.ServiceException;

public class UserPresentationImpl implements UserPresentation {

	@Override
	public void printAllUsers(List<User> list) {
		if (list.size() == 0)
			System.out.println("пользователи не найдены");
		for (int i = 0; i < list.size(); i++) {
			printUserInfo(list.get(i));
		}
	}

	@Override
	public void printUserInfo(User user) {
		System.out.println("Логин: " + user.getLogin());
		System.out.println("Логин: " + user.getPassword());
		System.out.println("Имя: " + user.getName());
		System.out.println("Фамилия: " + user.getSurname());
		System.out.println("Email: " + user.getEmail());
		if (user.isAdmin())
			System.out.println("Роль: администратор");
		else
			System.out.println("Роль: пользователь");
		if (user.isBlockedAccount())
			System.out.println("Состояние: заблокирован");
		else
			System.out.println("Состояние: не заблокирован");

	}

	@Override
	public void printError(ServiceException e) {
		System.err.println(e);
	}

	@Override
	public boolean printResultOfCommand(boolean result) {
		if (result)
			System.out.println("успешно");
		else
			System.out.println("не удалось выполнить действие, попробуйте снова");
		return result;

	}

}
