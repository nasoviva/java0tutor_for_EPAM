package com.java0tutor.final_task.task1.service.impl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.java0tutor.final_task.task1.bean.Book;
import com.java0tutor.final_task.task1.bean.User;
import com.java0tutor.final_task.task1.dao.DaoException;
import com.java0tutor.final_task.task1.dao.DaoProvider;
import com.java0tutor.final_task.task1.dao.UserDao;
import com.java0tutor.final_task.task1.service.ServiceException;
import com.java0tutor.final_task.task1.service.UserService;
import com.java0tutor.final_task.task1.service.util.Validator;

public class UserServiceImpl implements UserService {

	private static final DaoProvider provider = DaoProvider.getInstance();

	@Override
	public boolean registration(String data) throws ServiceException {
		User user;
		UserDao userDao;
		boolean result;

		result = false;
		try {
			if (Validator.isValidUser(data)) {
				user = createUser(data);
				userDao = provider.getUserDao();
				result = userDao.registration(user);
				return result;
			}
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}

	}

	private User createUser(String data) {
		User user;
		boolean admin;
		String login;
		String password;
		String name;
		String surname;
		String email;
		boolean online;
		boolean blockedAccount;

		if (data.split(Validator.separator)[0].equalsIgnoreCase("true")) {
			admin = true;
		} else {
			admin = false;
		}
		login = data.split(Validator.separator)[1].trim();
		password = data.split(Validator.separator)[2].trim();
		name = data.split(Validator.separator)[3].trim();
		surname = data.split(Validator.separator)[4].trim();
		email = data.split(Validator.separator)[5].trim();
		if (data.split(Validator.separator)[6].trim().equalsIgnoreCase("true")) {
			online = true;
		} else {
			online = false;
		}
		if (data.split(Validator.separator)[7].trim().equalsIgnoreCase("true")) {
			blockedAccount = true;
		} else {
			blockedAccount = false;
		}
		user = new User(admin, login, password, name, surname, email, online, blockedAccount);
		return user;
	}

	@Override
	public boolean logInUser(String data) throws ServiceException {
		String login;
		String password;
		UserDao userDao;
		boolean result;

		result = false;
		try {
			if (Validator.isValidLoginPassword(data)) {
				login = data.split(Validator.separator)[0].trim();
				password = data.split(Validator.separator)[1].trim();
				userDao = provider.getUserDao();
				result = userDao.logInUser(login, password);
			}
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean logInAdmin(String data) throws ServiceException {
		String login;
		String password;
		UserDao userDao;
		boolean result;

		result = false;
		try {
			if (Validator.isValidLoginPassword(data)) {
				login = data.split(Validator.separator)[0].trim();
				password = data.split(Validator.separator)[1].trim();
				userDao = provider.getUserDao();
				result = userDao.logInAdmin(login, password);
			}
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean logOut(String data) throws ServiceException {
		String login;
		String password;
		UserDao userDao;
		boolean result;

		result = false;
		try {
			if (Validator.isValidLoginPassword(data)) {
				login = data.split(Validator.separator)[0].trim();
				password = data.split(Validator.separator)[1].trim();
				userDao = provider.getUserDao();
				result = userDao.logOut(login, password);
			}
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean blockUser(String data) throws ServiceException {
		String login;
		UserDao userDao;
		boolean result;

		result = false;
		try {
			if (Validator.isValidData(data)) {
				login = data.split(Validator.separator)[0].trim();
				userDao = provider.getUserDao();
				result = userDao.blockUser(login);
			}
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean unBlockUser(String data) throws ServiceException {
		String login;
		UserDao userDao;
		boolean result;

		result = false;
		try {
			if (Validator.isValidData(data)) {
				login = data.split(Validator.separator)[0].trim();
				userDao = provider.getUserDao();
				result = userDao.unBlockUser(login);
			}
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean changeUserInfo(String data) throws ServiceException {
		Pattern pattern;
		Matcher matcher;
		String login;
		String new_name;
		String new_surname;
		String new_email;
		UserDao userDao;
		boolean result;

		result = false;
		new_name = "";
		new_surname = "";
		new_email = "";
		try {
			if (Validator.isValidData(data)) {
				login = data.split(Validator.separator)[0].trim();
				if (data.split(Validator.separator).length > 1) {
					if (Validator.isValidData(data.split(Validator.separator)[1].trim())) {
						new_name = data.split(Validator.separator)[1].trim();
					}
				}
				if (data.split(Validator.separator).length > 2) {
					if (Validator.isValidData(data.split(Validator.separator)[2].trim())) {
						new_surname = data.split(Validator.separator)[2].trim();
					}
				}
				if (data.split(Validator.separator).length > 3) {
					pattern = Pattern.compile("\\w{1,20}@\\w{2,20}\\.[a-zA-Z]{2,3}");
					matcher = pattern.matcher(data.split(Validator.separator)[3].trim());
					if (matcher.find()) {
						new_email = matcher.group();
					}
				}
				userDao = provider.getUserDao();
				result = userDao.changeUserInfo(login, new_name, new_surname, new_email);
			}
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean closeSystem() throws ServiceException {
		UserDao userDao;
		boolean result;

		result = false;
		try {
			userDao = provider.getUserDao();
			result = userDao.logoutAllUsers();
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean sendMail(Book book) throws ServiceException {
		UserDao userDao;
		boolean result;

		result = false;
		try {
			userDao = provider.getUserDao();
			result = userDao.sendMail(book);
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

	@Override
	public boolean sendMailAdmin(Book book) throws ServiceException {
		UserDao userDao;
		boolean result;

		result = false;
		try {
			userDao = provider.getUserDao();
			result = userDao.sendMailAdmin(book);
			return result;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
	}

}
