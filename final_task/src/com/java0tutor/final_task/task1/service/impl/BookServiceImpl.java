package com.java0tutor.final_task.task1.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.java0tutor.final_task.task1.bean.AuthorComparator;
import com.java0tutor.final_task.task1.bean.Book;
import com.java0tutor.final_task.task1.bean.TypeOfBook;
import com.java0tutor.final_task.task1.dao.BookDao;
import com.java0tutor.final_task.task1.dao.DaoException;
import com.java0tutor.final_task.task1.dao.DaoProvider;
import com.java0tutor.final_task.task1.service.BookService;
import com.java0tutor.final_task.task1.service.ServiceException;
import com.java0tutor.final_task.task1.service.util.Validator;

public class BookServiceImpl implements BookService {

	private static final DaoProvider provider = DaoProvider.getInstance();

	@Override
	public List<Book> getCatalog() throws ServiceException {
		List<Book> catalog;
		BookDao bookDao;

		bookDao = provider.getBookDao();
		try {
			catalog = bookDao.getCatalog();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		return catalog;
	}

	@Override
	public boolean sortBooksByAuthor() throws ServiceException {
		List<Book> catalog;
		BookDao bookDao;
		boolean result = false;

		bookDao = provider.getBookDao();
		try {
			catalog = bookDao.getCatalog();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		Comparator<Book> authorComparator = new AuthorComparator();
		Collections.sort(catalog, authorComparator);
		try {
			bookDao.setCatalog(catalog);
			result = true;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		return result;
	}

	@Override
	public boolean sortBooksById() throws ServiceException {
		List<Book> catalog;
		BookDao bookDao;
		boolean result = false;

		bookDao = provider.getBookDao();
		try {
			catalog = bookDao.getCatalog();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		Collections.sort(catalog);

		try {
			bookDao.setCatalog(catalog);
			result = true;
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		return result;
	}

	@Override
	public boolean removeBookFromCatalog(String str) throws ServiceException {
		boolean result = false;
		BookDao bookDao;

		bookDao = provider.getBookDao();
		if (Validator.isValidId(str)) {
			try {
				bookDao = provider.getBookDao();
				bookDao.removeBookFromCatalog(Integer.parseInt(str));
				result = true;
			} catch (DaoException e) {
				throw new ServiceException(e);
			}
		}
		return result;
	}

	@Override
	public boolean addBookInCatalog(String str) throws ServiceException {
		Book book;
		BookDao bookDao;
		boolean result = false;
		int id;
		String type;
		String title;
		String author;
		String description;

		if (Validator.isValidFile(str)) {
			id = Integer.valueOf(str.split(Validator.separator)[0]);
			type = str.split(Validator.separator)[1];
			title = str.split(Validator.separator)[2];
			author = str.split(Validator.separator)[3];
			description = str.split(Validator.separator)[4];
			book = new Book(id, TypeOfBook.valueOf(type.toUpperCase()), title, author, description);
			try {
				bookDao = provider.getBookDao();
				bookDao.addBookInCatalog(book);
				result = true;

			} catch (NumberFormatException e) {
				throw new ServiceException(e);
			} catch (DaoException e) {
				throw new ServiceException(e);
			}
		}
		return result;
	}

	@Override
	public List<Book> searchBooksByTitle(String str) throws ServiceException {
		List<Book> newCatalog;
		List<Book> catalog;
		BookDao bookDao;

		bookDao = provider.getBookDao();
		try {
			catalog = bookDao.getCatalog();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		newCatalog = new ArrayList<>();
		Collections.sort(catalog);
		for (int i = 0; i < catalog.size(); i++) {
			if (catalog.get(i).getTitle().toLowerCase().indexOf(str.toLowerCase()) >= 0) {
				newCatalog.add(catalog.get(i));
			}
		}
		return newCatalog;

	}

	@Override
	public List<Book> searchBooksByAuthor(String str) throws ServiceException {
		List<Book> newCatalog;
		List<Book> catalog;
		BookDao bookDao;

		bookDao = provider.getBookDao();
		try {
			catalog = bookDao.getCatalog();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		newCatalog = new ArrayList<>();
		Collections.sort(catalog);
		for (int i = 0; i < catalog.size(); i++) {
			if (catalog.get(i).getAuthor().toLowerCase().indexOf(str.toLowerCase()) >= 0) {
				newCatalog.add(catalog.get(i));
			}
		}
		return newCatalog;
	}

	@Override
	public List<Book> searchBooksByDescription(String str) throws ServiceException {
		List<Book> newCatalog;
		List<Book> catalog;
		BookDao bookDao;

		bookDao = provider.getBookDao();
		try {
			catalog = bookDao.getCatalog();
		} catch (DaoException e) {
			throw new ServiceException(e);
		}
		newCatalog = new ArrayList<>();
		Collections.sort(catalog);
		for (int i = 0; i < catalog.size(); i++) {
			if (catalog.get(i).getDescription().toLowerCase().indexOf(str.toLowerCase()) >= 0) {
				newCatalog.add(catalog.get(i));
			}
		}
		return newCatalog;
	}

	@Override
	public Book suggestAddBookInCatalog(String str) throws ServiceException {
		Book book = null;
		int id;
		String type;
		String title;
		String author;
		String description;

		if (Validator.isValidFile(str)) {
			id = Integer.valueOf(str.split(Validator.separator)[0]);
			System.out.println(id);
			type = str.split(Validator.separator)[1];
			title = str.split(Validator.separator)[2];
			author = str.split(Validator.separator)[3];
			description = str.split(Validator.separator)[4];
			book = new Book(id, TypeOfBook.valueOf(type.toUpperCase()), title, author, description);
		}
		return book;
	}

}
