package com.java0tutor.final_task.task1.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.java0tutor.final_task.task1.bean.Book;
import com.java0tutor.final_task.task1.bean.TypeOfBook;
import com.java0tutor.final_task.task1.dao.BookDao;
import com.java0tutor.final_task.task1.dao.DaoException;
import com.java0tutor.final_task.task1.service.util.Validator;

public class FileBookDao implements BookDao {

	private static final File CATALOG_SOURCE = new File("./src/com/java0tutor/final_task/task1/source/catalog.txt");

	@Override
	public List<Book> getCatalog() throws DaoException {
		List<Book> catalog = new ArrayList<>();
		int id;
		String type;
		String title;
		String author;
		String description;
		String tmp;
		BufferedReader reader;
		FileReader fileReader;

		try {
			fileReader = new FileReader(CATALOG_SOURCE);
			reader = new BufferedReader(fileReader);
			while (reader.ready()) {
				tmp = reader.readLine();
				if (Validator.isValidFile(tmp)) {
					id = Integer.valueOf(tmp.split(Validator.separator)[0]);
					type = tmp.split(Validator.separator)[1];
					title = tmp.split(Validator.separator)[2];
					author = tmp.split(Validator.separator)[3];
					description = tmp.split(Validator.separator)[4];
					catalog.add(new Book(id, TypeOfBook.valueOf(type.toUpperCase()), title, author, description));
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} catch (IOException e) {
			throw new DaoException(e);
		}
		return catalog;
	}

	public void setCatalog(List<Book> catalog) throws DaoException {
		BufferedWriter writer;
		FileWriter fileWriter;

		try {
			fileWriter = new FileWriter(CATALOG_SOURCE);
			writer = new BufferedWriter(fileWriter);

			for (int i = 0; i < catalog.size(); i++) {
				writer.write(catalog.get(i).getId() + "; ");
				writer.write(catalog.get(i).getType() + "; ");
				writer.write(catalog.get(i).getTitle() + "; ");
				writer.write(catalog.get(i).getAuthor() + "; ");
				writer.write(catalog.get(i).getDescription() + "; ");
				writer.newLine();
			}
			writer.close();
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} catch (IOException e) {
			throw new DaoException(e);
		}

	}

	@Override
	public void removeBookFromCatalog(int idForRemove) throws DaoException {
		List<Book> book = getCatalog();
		FileWriter fileWriter;
		BufferedWriter writer;
		try {
			fileWriter = new FileWriter(CATALOG_SOURCE);
			writer = new BufferedWriter(fileWriter);
			for (int i = 0; i < book.size(); i++) {
				if (book.get(i).getId() != idForRemove) {
					writer.write(book.get(i).getId() + "; ");
					writer.write(book.get(i).getType() + "; ");
					writer.write(book.get(i).getTitle() + "; ");
					writer.write(book.get(i).getAuthor() + "; ");
					writer.write(book.get(i).getDescription() + "; ");
					writer.newLine();
				}
			}
			writer.close();
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} catch (IOException e) {
			throw new DaoException(e);
		}

	}

	@Override
	public void addBookInCatalog(Book book) throws DaoException {
		BufferedWriter writer;
		FileWriter fileWriter;

		try {
			fileWriter = new FileWriter(CATALOG_SOURCE, true);
			writer = new BufferedWriter(fileWriter);

			writer.write(book.getId() + "; ");
			writer.write(book.getType() + "; ");
			writer.write(book.getTitle() + "; ");
			writer.write(book.getAuthor() + "; ");
			writer.write(book.getDescription() + "; ");
			writer.newLine();
			writer.close();
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} catch (IOException e) {
			throw new DaoException(e);
		}

	}
}
