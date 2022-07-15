package com.java0tutor.final_task.task1.menu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.java0tutor.final_task.task1.controller.impl.ControllerImpl;

public class ConsolMenu {
	private List<String> menu = new ArrayList<>();
	private Reader inputStreamReader = new InputStreamReader(System.in);
	private BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
	private ControllerImpl c = new ControllerImpl();

	public void getMenu() {
		int num;
		String str;
		boolean result;

		createMenu();
		num = -1;
		str = "";
		while (num != 0) {
			System.out.println(("\nMеню:"));
			System.out.println(("1. Регистрация нового пользователя"));
			System.out.println(("2. Авторизация пользователя"));
			System.out.println(("3. Авторизация администратора"));
			System.out.println(("0. Выход"));
			System.out.print(("\nВыберите пункт меню: "));
			try {
				viewCommandResult(16);
				str = bufferedReader.readLine();
				num = Integer.parseInt(str);
				if (num == 1) {
					result = viewCommandResult(num);
					continue;
				} else if (num == 0) {
					System.out.println(("До новых встреч!"));
					viewCommandResult(16);
					break;
				} else if (num == 2) {
					result = viewCommandResult(num);
					if (result) {
						num = menuForUser();
					}
				} else if (num == 3) {
					result = viewCommandResult(num);
					if (result) {
						num = menuForAdmin();
					}
				}
			} catch (IOException | NumberFormatException e) {
				System.err.println("ошибка");
			}
		}
	}

	private int menuForAdmin() {
		int num;
		String str;

		str = "";
		num = -1;
		while (num != 0) {
			System.out.println(("\nMеню работы с пользователями:"));
			System.out.println(("0. Выход из программы"));
			System.out.println(("4. Выйти из учетной записи"));
			System.out.println(("5. Заблокировать пользователя"));
			System.out.println(("6. Разблокировать пользователя"));
			System.out.println(("7. Изменить информацию о пользователе"));
			System.out.println(("\nMеню работы с каталогом книг:"));
			System.out.println(("8. Просмотр каталога"));
			System.out.println(("9. Сортировать книги по ID"));
			System.out.println(("10. Сортировать книги по автору"));
			System.out.println(("11. Поиск книги по названию"));
			System.out.println(("12. Поиск книги по автору"));
			System.out.println(("13. Поиск книги по описанию"));
			System.out.println(("14. Добавить книгу в каталог"));
			System.out.println(("15. Удалить книгу из каталога"));
			System.out.print(("\nВыберите пункт меню: "));
			try {
				str = bufferedReader.readLine();
				num = Integer.parseInt(str);
				if (num == 4) {
					viewCommandResult(4);
					break;
				} else if (num == 0) {
					System.out.println(("До новых встреч!"));
					viewCommandResult(16);
					break;
				} else if (num >= 5 && num <= 15)
					viewCommandResult(num);
			} catch (IOException | NumberFormatException e) {
				System.err.println("ошибка");
			}
		}
		return num;
	}

	private int menuForUser() {
		int num;
		String str;

		str = "";
		num = -1;
		while (num != 0) {
			System.out.println(("\nMеню:"));
			System.out.println(("8. Просмотр каталога"));
			System.out.println(("11. Поиск книги по названию"));
			System.out.println(("12. Поиск книги по автору"));
			System.out.println(("13. Поиск книги по описанию"));
			System.out.println(("17. Предложить администратору добавить книгу в каталог"));
			System.out.println(("4. Выйти из учетной записи"));
			System.out.println(("0. Выход из программы"));
			System.out.print(("\nВыберите пункт меню: "));
			try {
				str = bufferedReader.readLine();
				num = Integer.parseInt(str);
				if (num == 4) {
					viewCommandResult(num);
					break;
				} else if (num == 0) {
					System.out.println(("До новых встреч!"));
					viewCommandResult(16);
					break;
				} else if (num >= 8 || num >= 11 && num <= 13)
					viewCommandResult(num);
			} catch (IOException | NumberFormatException e) {
				System.err.println("ошибка");
			}
		}
		return num;
	}

	private List<String> createMenu() {
		menu.add("registration");// 1
		menu.add("login user");// 2
		menu.add("login admin");// 3
		menu.add("logout");// 4
		menu.add("block user");// 5
		menu.add("unblock user");// 6
		menu.add("change info about user");// 7
		menu.add("view catalog");// 8
		menu.add("sort books by id");// 9
		menu.add("sort books by author");// 10
		menu.add("search book by title");// 11
		menu.add("search book by author");// 12
		menu.add("search book by description");// 13
		menu.add("add book in catalog");// 14
		menu.add("remove book from catalog by id");// 15
		menu.add("close system");// 16
		menu.add("suggest add book in catalog");// 17
		return menu;
	}

	private boolean viewCommandResult(int button) {
		boolean result = false;

		if (button == 1) {
			result = registration(button);
		} else if (button == 2 || button == 3) {
			result = logIn(button);
		} else if (button == 4) {
			result = logOut(button);
		} else if (button == 5) {
			result = block(button);
		} else if (button == 6) {
			result = unBlock(button);
		} else if (button == 7) {
			result = changeUser(button);
		} else if (button == 11 || button == 12 || button == 13) {
			result = searchBook(button);
		} else if (button == 14) {
			result = addBook(button);
		} else if (button == 15) {
			result = removeBook(button);
		} else if (button == 17) {
			result = suggestAddBook(button);
		} else if (button > 0 && button <= menu.size()) {
			result = c.doAction(menu.get(button - 1));
		}
		return result;
	}

	private boolean registration(int button) {
		boolean result = false;
		String res = "";
		String admin = "false";
		String login;
		String password;
		String name;
		String surname;
		String email;
		String online = "false";
		String blockedAccount = "false";

		System.out.println("\nВведите данные для регистрации нового пользователя");
		System.out.print("\nЛогин (только буквы латинского алфавита или цифры, до 20 символов): ");
		try {
			login = bufferedReader.readLine();
			res = admin + "; " + login + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nПароль (от 4 до 10 символов): ");
		try {
			password = bufferedReader.readLine();
			res = res + password + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nИмя (до 20 символов): ");
		try {
			name = bufferedReader.readLine();
			res = res + name + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nФамилия (до 20 символов): ");
		try {
			surname = bufferedReader.readLine();
			res = res + surname + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nEmail (не менее *@**.** букв латинского алфавита или цифр, до 20 символов): ");
		try {
			email = bufferedReader.readLine();
			res = res + email + "; " + online + "; " + blockedAccount + ";";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		result = c.doAction(menu.get(button - 1) + "," + res);
		return result;
	}

	private boolean logIn(int button) {
		boolean result = false;
		String res = "";
		String login;
		String password;

		System.out.println("\nВведите данные для авторизации");
		System.out.print("\nЛогин: ");
		try {
			login = bufferedReader.readLine();
			res = login + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nПароль: ");
		try {
			password = bufferedReader.readLine();
			res = res + password + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		result = c.doAction(menu.get(button - 1) + "," + res);
		return result;
	}

	private boolean logOut(int button) {
		boolean result = false;
		String res = "";
		String login;
		String password;

		System.out.println("\nВведите данные для выхода из учетной записи");
		System.out.print("\nЛогин: ");
		try {
			login = bufferedReader.readLine();
			res = login + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nПароль: ");
		try {
			password = bufferedReader.readLine();
			res = res + password + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		result = c.doAction(menu.get(button - 1) + "," + res);
		return result;
	}

	private boolean block(int button) {
		boolean result = false;
		String res = "";
		String login;

		System.out.println("\nВведите данные для блокировки пользователя");
		System.out.print("\nЛогин: ");
		try {
			login = bufferedReader.readLine();
			res = login + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		result = c.doAction(menu.get(button - 1) + "," + res);
		return result;
	}

	private boolean unBlock(int button) {
		boolean result = false;
		String res = "";
		String login;

		System.out.println("\nВведите данные для разблокировки пользователя");
		System.out.print("\nЛогин: ");
		try {
			login = bufferedReader.readLine();
			res = login + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		result = c.doAction(menu.get(button - 1) + "," + res);
		return result;
	}

	private boolean changeUser(int button) {
		boolean result = false;
		String res = "";
		String login;
		String new_name;
		String new_surname;
		String new_email;

		System.out.print("\nВведите логин пользователя, который нужно измененить: ");
		try {
			login = bufferedReader.readLine();
			res = login + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.println("\nЕсли необходимо изменить имя, введите новое имя или нажмите Enter");
		System.out.print("(до 20 символов): ");
		try {
			new_name = bufferedReader.readLine();
			res = res + new_name + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.println("\nЕсли необходимо изменить фамилию, введите новую фамилию или нажмите Enter");
		System.out.print("(до 20 символов): ");
		try {
			new_surname = bufferedReader.readLine();
			res = res + new_surname + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.println("\nЕсли необходимо изменить email, введите новый email или нажмите Enter");
		System.out.print("не менее *@**.** букв латинского алфавита или цифр, до 20 символов): ");
		try {
			new_email = bufferedReader.readLine();
			res = res + new_email + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		result = c.doAction(menu.get(button - 1) + "," + res);
		return result;
	}

	private boolean searchBook(int button) {
		boolean result = false;
		System.out.print("\nВведите данные для поиска книги: ");
		try {
			String res = bufferedReader.readLine();
			c.doAction(menu.get(button - 1) + "," + res);
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		return result;
	}

	private boolean addBook(int button) {
		boolean result = false;
		String res = "";
		String id;
		String type;
		String title;
		String author;
		String description;
		System.out.print("\nВведите id новой книги: ");
		try {
			id = bufferedReader.readLine();
			res = id + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nВведите тип книги (ebook или paperbook): ");
		try {
			type = bufferedReader.readLine();
			res = res + type + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nВведите название книги: ");
		try {
			title = bufferedReader.readLine();
			res = res + title + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nВведите фамилию и инициалы автора книги: ");
		try {
			author = bufferedReader.readLine();
			res = res + author + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nВведите описание книги: ");
		try {
			description = bufferedReader.readLine();
			res = res + description + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		result = c.doAction(menu.get(button - 1) + "," + res);
		return result;
	}

	private boolean suggestAddBook(int button) {
		boolean result = false;
		String res = "";
		String id;
		String type;
		String title;
		String author;
		String description;

		id = "0";
		res = id + "; ";
		System.out.print("\nВведите тип книги (ebook или paperbook): ");
		try {
			type = bufferedReader.readLine();
			res = res + type + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nВведите название книги: ");
		try {
			title = bufferedReader.readLine();
			res = res + title + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nВведите фамилию и инициалы автора книги: ");
		try {
			author = bufferedReader.readLine();
			res = res + author + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		System.out.print("\nВведите описание книги: ");
		try {
			description = bufferedReader.readLine();
			res = res + description + "; ";
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		result = c.doAction(menu.get(button - 1) + "," + res);
		return result;
	}

	private boolean removeBook(int button) {
		boolean result = false;
		System.out.print("\nВведите id для удаления книги: ");
		try {
			String res = bufferedReader.readLine();
			result = c.doAction(menu.get(button - 1) + "," + res);
		} catch (IOException e) {
			System.err.println("ошибка");
		}
		return result;
	}
}
