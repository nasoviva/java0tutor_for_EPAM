package com.java0tutor.final_task.task1.dao.impl;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

import com.java0tutor.final_task.task1.bean.Book;
import com.java0tutor.final_task.task1.bean.User;
import com.java0tutor.final_task.task1.dao.DaoException;
import com.java0tutor.final_task.task1.dao.UserDao;
import com.java0tutor.final_task.task1.service.util.Validator;

public class FileUserDao implements UserDao {

	private static final File USERS_SOURCE = new File("./src/com/java0tutor/final_task/task1/source/users.txt");
	private String secret = "SecRetOfPassWoRd";

	@Override
	public List<User> getUsers() throws DaoException {
		List<User> catalog = new ArrayList<>();
		BufferedReader reader;
		FileReader fileReader;
		boolean admin;
		String login;
		String password;
		String name;
		String surname;
		String email;
		String tmp;
		boolean online;
		boolean blockedAccount;

		try {
			fileReader = new FileReader(USERS_SOURCE);
			reader = new BufferedReader(fileReader);
			while (reader.ready()) {
				tmp = reader.readLine();
				if (Validator.isValidUser(tmp)) {
					if (tmp.split(Validator.separator)[0].equalsIgnoreCase("true"))
						admin = true;
					else
						admin = false;
					login = tmp.split(Validator.separator)[1].trim();
					password = tmp.split(Validator.separator)[2].trim();
					name = tmp.split(Validator.separator)[3].trim();
					surname = tmp.split(Validator.separator)[4].trim();
					email = tmp.split(Validator.separator)[5].trim();
					if (tmp.split(Validator.separator)[6].equalsIgnoreCase("true"))
						online = true;
					else
						online = false;
					if (tmp.split(Validator.separator)[7].equalsIgnoreCase("true"))
						blockedAccount = true;
					else
						blockedAccount = false;
					catalog.add(new User(admin, login, password, name, surname, email, online, blockedAccount));
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

	@Override
	public void addUser(User user) throws DaoException {
		BufferedWriter writer;
		FileWriter fileWriter;

		try {
			fileWriter = new FileWriter(USERS_SOURCE, true);
			writer = new BufferedWriter(fileWriter);
			writer.write(user.isAdmin() + "; ");
			writer.write(user.getLogin() + ";");
			writer.write(encrypt(user.getPassword()) + "; ");
			writer.write(user.getName() + "; ");
			writer.write(user.getSurname() + "; ");
			writer.write(user.getEmail() + "; ");
			writer.write(user.isOnline() + "; ");
			writer.write(user.isBlockedAccount() + "; ");
			writer.newLine();
			writer.close();
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} catch (IOException e) {
			throw new DaoException(e);
		}
	}

	@Override
	public boolean registration(User user) throws DaoException {
		List<User> users = getUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLogin().equals(user.getLogin())) {
				return false;
			}
		}
		addUser(user);
		return true;
	}

	@Override
	public boolean logInUser(String login, String password) throws DaoException {
		List<User> users = getUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLogin().equals(login) && decrypt(users.get(i).getPassword()).equals(password)) {
				if (!users.get(i).isBlockedAccount()) {
					users.get(i).setOnline(true);
					setUsers(users);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean logInAdmin(String login, String password) throws DaoException {
		List<User> users = getUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLogin().equals(login) && decrypt(users.get(i).getPassword()).equals(password)) {
				if (!users.get(i).isBlockedAccount() && users.get(i).isAdmin()) {
					users.get(i).setOnline(true);
					setUsers(users);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean logOut(String login, String password) throws DaoException {
		List<User> users = getUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLogin().equals(login) && decrypt(users.get(i).getPassword()).equals(password)) {
				if (!users.get(i).isBlockedAccount()) {
					users.get(i).setOnline(false);
					setUsers(users);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean blockUser(String login) throws DaoException {
		List<User> users = getUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLogin().equals(login)) {
				if (!users.get(i).isBlockedAccount()) {
					users.get(i).setOnline(false);
					users.get(i).setBlockedAccount(true);
					setUsers(users);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean unBlockUser(String login) throws DaoException {
		List<User> users = getUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getLogin().equals(login)) {
				if (users.get(i).isBlockedAccount()) {
					users.get(i).setBlockedAccount(false);
					setUsers(users);
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean changeUserInfo(String login, String new_name, String new_surname, String new_email)
			throws DaoException {
		List<User> users;
		int i;
		boolean result;

		i = 0;
		result = false;
		users = getUsers();
		while (i < users.size()) {
			if (users.get(i).getLogin().equals(login)) {
				if (!new_name.equals("")) {
					users.get(i).setName(new_name);
					result = true;
				}
				if (!new_surname.equals("")) {
					users.get(i).setSurname(new_surname);
					result = true;
				}
				if (!new_email.equals("")) {
					users.get(i).setEmail(new_email);
					result = true;
				}
				break;
			}
			i++;
		}
		setUsers(users);
		return result;
	}

	@Override
	public boolean logoutAllUsers() throws DaoException {
		List<User> users = getUsers();
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).isOnline()) {
				users.get(i).setOnline(false);
			}
		}
		setUsers(users);
		return true;
	}

	@Override
	public boolean sendMail(Book book) throws DaoException {
		List<User> users = getUsers();
		Properties props = new Properties();
		String emailFrom = null;
		String passwordFrom = null;
		boolean result;

		result = false;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).isAdmin()) {
				emailFrom = users.get(i).getEmail();
				passwordFrom = decrypt(users.get(i).getPassword());
			}
		}
		try {
			props.load(new FileInputStream("./src/mail.properties"));
			Session session = Session.getInstance(props, null);
			MimeMessage msg = new MimeMessage(session);
			for (int i = 0; i < users.size(); i++) {
				msg.setFrom(emailFrom);
				msg.setRecipients(Message.RecipientType.TO, users.get(i).getEmail());
				msg.setSubject("Добавлена новая книга в каталог");
				msg.setText("Id: " + book.getId() + "\nТип: " + book.getType() + "\nНазвание: " + book.getTitle()
						+ "\nАвтор: " + book.getAuthor() + "\nОписание: " + book.getDescription());
				Transport.send(msg, emailFrom, passwordFrom);
				result = true;
			}
		} catch (IOException | MessagingException e) {
			throw new DaoException(e);
		}
		return result;

	}

	@Override
	public boolean sendMailAdmin(Book book) throws DaoException {
		List<User> users = getUsers();
		String emailFrom = null;
		String passwordFrom = null;
		boolean result;

		result = false;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).isOnline()) {
				emailFrom = users.get(i).getEmail();
				passwordFrom = decrypt(users.get(i).getPassword());
			}
		}
		try {
			Properties props = new Properties();
			props.load(new FileInputStream("./src/mail.properties"));
			Session session = Session.getInstance(props, null);
			MimeMessage msg = new MimeMessage(session);
			for (int i = 0; i < users.size(); i++) {
				if (users.get(i).isAdmin()) {
					msg.setFrom(emailFrom);
					msg.setRecipients(Message.RecipientType.TO, users.get(i).getEmail());
					msg.setSubject("Прошу добавить новую книгу в каталог");
					msg.setText("Тип: " + book.getType() + "\nНазвание: " + book.getTitle() + "\nАвтор: "
							+ book.getAuthor() + "\nОписание: " + book.getDescription());
					Transport.send(msg, emailFrom, passwordFrom);
					result = true;
				}
			}
		} catch (IOException | MessagingException e) {
			throw new DaoException(e);
		}
		return result;
	}

	private void setUsers(List<User> catalog) throws DaoException {
		try {
			FileWriter fileWriter = new FileWriter(USERS_SOURCE);
			BufferedWriter writer = new BufferedWriter(fileWriter);

			for (int i = 0; i < catalog.size(); i++) {
				writer.write(catalog.get(i).isAdmin() + "; ");
				writer.write(catalog.get(i).getLogin() + "; ");
				writer.write(catalog.get(i).getPassword() + "; ");
				writer.write(catalog.get(i).getName() + "; ");
				writer.write(catalog.get(i).getSurname() + "; ");
				writer.write(catalog.get(i).getEmail() + "; ");
				writer.write(catalog.get(i).isOnline() + "; ");
				writer.write(catalog.get(i).isBlockedAccount() + "; ");
				writer.newLine();
			}

			writer.close();
		} catch (IOException e) {
			throw new DaoException(e);
		}
	}

	private String encrypt(String password) {
		char[] s;
		int n;
		char[] p;
		int m;

		s = secret.toCharArray();
		n = s.length;
		p = password.toCharArray();
		m = p.length;
		for (int k = 0; k < m; k++) {
			int mima = p[k] + s[k / n]; // шифрование
			p[k] = (char) mima;
		}
		return new String(p);
	}

	private String decrypt(String password) {
		char[] s;
		int n;
		char[] p;
		int m;

		s = secret.toCharArray();
		n = s.length;
		p = password.toCharArray();
		m = p.length;
		for (int k = 0; k < m; k++) {
			int mima = p[k] - s[k / n]; // расшифровать
			p[k] = (char) mima;
		}
		return new String(p);
	}

}
