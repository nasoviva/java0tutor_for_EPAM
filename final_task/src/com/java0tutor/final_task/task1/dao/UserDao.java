package com.java0tutor.final_task.task1.dao;

import java.util.List;

import com.java0tutor.final_task.task1.bean.Book;
import com.java0tutor.final_task.task1.bean.User;

public interface UserDao {

	List<User> getUsers() throws DaoException;

	void addUser(User user) throws DaoException;

	boolean registration(User user) throws DaoException;

	boolean logInUser(String login, String password) throws DaoException;

	boolean logInAdmin(String login, String password) throws DaoException;

	boolean logOut(String login, String password) throws DaoException;

	boolean blockUser(String login) throws DaoException;

	boolean unBlockUser(String login) throws DaoException;

	boolean changeUserInfo(String login, String new_name, String new_surname, String new_email) throws DaoException;

	boolean logoutAllUsers() throws DaoException;

	boolean sendMail(Book book) throws DaoException;

	boolean sendMailAdmin(Book book) throws DaoException;
}
