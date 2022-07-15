package com.java0tutor.final_task.task1.service;

import com.java0tutor.final_task.task1.bean.Book;

public interface UserService {

	boolean registration(String data) throws ServiceException;

	boolean logInUser(String data) throws ServiceException;

	boolean logInAdmin(String data) throws ServiceException;

	boolean logOut(String data) throws ServiceException;

	boolean blockUser(String data) throws ServiceException;

	boolean unBlockUser(String data) throws ServiceException;

	boolean changeUserInfo(String data) throws ServiceException;

	boolean closeSystem() throws ServiceException;

	boolean sendMail(Book book) throws ServiceException;

	boolean sendMailAdmin(Book book) throws ServiceException;
}
