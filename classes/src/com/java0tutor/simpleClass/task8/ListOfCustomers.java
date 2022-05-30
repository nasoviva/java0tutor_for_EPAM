package com.java0tutor.simpleClass.task8;

public class ListOfCustomers {
	private int length;
	private int count;
	private Customer[] customer;

	public ListOfCustomers() {
		length = 5;
		count = 0;
		customer = new Customer[length];
	}

	public Customer[] add(Customer newCustomer) {
		if (count < length) {
			customer[count] = newCustomer;
			count++;
		}
		return customer;
	}

	public void printAllCustomers() {
		for (int i = 0; i < customer.length; i++) {
			System.out.println("ID: " + customer[i].getId());
			System.out.println("Фамилия: " + customer[i].getSurname());
			System.out.println("Имя: " + customer[i].getName());
			System.out.println("Отчество: " + customer[i].getPatronymic());
			System.out.println("Адрес: " + customer[i].getAddress());
			System.out.println("Номер карты: " + customer[i].getCardNumber());
			System.out.println("Номер счета: " + customer[i].getAccount());
			System.out.println();
		}
	}

	public void printCustomersOfId(int id) {
		for (int i = 0; i < customer.length; i++) {
			if (id == customer[i].getId()) {
				System.out.println("ID: " + customer[i].getId());
				System.out.println("Фамилия: " + customer[i].getSurname());
				System.out.println("Имя: " + customer[i].getName());
				System.out.println("Отчество: " + customer[i].getPatronymic());
				System.out.println("Адрес: " + customer[i].getAddress());
				System.out.println("Номер карты: " + customer[i].getCardNumber());
				System.out.println("Номер счета: " + customer[i].getAccount());
				System.out.println();
			}
		}
	}

	public void printCustomersOfCardNumber(String cardNumber) {
		int flag;

		flag = 0;
		for (int i = 0; i < customer.length; i++) {
			if (compareStrings(cardNumber, customer[i].getCardNumber()) == 0
					&& customer[i].getCardNumber().length() == cardNumber.length()) {
				System.out.println("ID: " + customer[i].getId());
				System.out.println("Фамилия: " + customer[i].getSurname());
				System.out.println("Имя: " + customer[i].getName());
				System.out.println("Отчество: " + customer[i].getPatronymic());
				System.out.println("Адрес: " + customer[i].getAddress());
				System.out.println("Номер карты: " + customer[i].getCardNumber());
				System.out.println("Номер счета: " + customer[i].getAccount());
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("Клиент с номером карты " + cardNumber + " не найден");
		System.out.println();
	}

	public void printDiapasonOfCardNumbers(String from, String to) {
		for (int i = 0; i < customer.length; i++) {
			if (compareStrings(customer[i].getCardNumber(), from) >= 0
					&& compareStrings(customer[i].getCardNumber(), to) <= 0) {
				System.out.println("ID: " + customer[i].getId());
				System.out.println("Фамилия: " + customer[i].getSurname());
				System.out.println("Имя: " + customer[i].getName());
				System.out.println("Отчество: " + customer[i].getPatronymic());
				System.out.println("Адрес: " + customer[i].getAddress());
				System.out.println("Номер карты: " + customer[i].getCardNumber());
				System.out.println("Номер счета: " + customer[i].getAccount());
				System.out.println();
			}
		}
	}

	public void sortBySurname() {
		int tmp_id;
		String tmp_surname;
		String tmp_name;
		String tmp_patronymic;
		String tmp_address;
		String tmp_cardNumber;
		String tmp_account;

		for (int i = 0; i < customer.length; i++) {
			for (int j = 0; j < customer.length - 1; j++) {
				if (compareStrings(customer[j].getSurname(), customer[j + 1].getSurname()) > 0) {
					tmp_id = customer[j].getId();
					tmp_surname = customer[j].getSurname();
					tmp_name = customer[j].getName();
					tmp_patronymic = customer[j].getPatronymic();
					tmp_address = customer[j].getAddress();
					tmp_cardNumber = customer[j].getCardNumber();
					tmp_account = customer[j].getAccount();
					customer[j].setId(customer[j + 1].getId());
					customer[j].setSurname(customer[j + 1].getSurname());
					customer[j].setName(customer[j + 1].getName());
					customer[j].setPatronymic(customer[j + 1].getPatronymic());
					customer[j].setAddress(customer[j + 1].getAddress());
					customer[j].setCardNumber(customer[j + 1].getCardNumber());
					customer[j].setAccount(customer[j + 1].getAccount());

					customer[j + 1].setId(tmp_id);
					customer[j + 1].setSurname(tmp_surname);
					customer[j + 1].setName(tmp_name);
					customer[j + 1].setPatronymic(tmp_patronymic);
					customer[j + 1].setAddress(tmp_address);
					customer[j + 1].setCardNumber(tmp_cardNumber);
					customer[j + 1].setAccount(tmp_account);
				} else if (compareStrings(customer[j].getSurname(), customer[j + 1].getSurname()) == 0)
					sortByName(customer, j, j + 1);
			}
		}
	}

	private void sortByName(Customer[] customer, int a, int b) {
		int tmp_id;
		String tmp_surname;
		String tmp_name;
		String tmp_patronymic;
		String tmp_address;
		String tmp_cardNumber;
		String tmp_account;

		for (int i = a; i < b; i++) {
			for (int j = a; j < b; j++) {
				if (compareStrings(customer[j].getName(), customer[j + 1].getName()) > 0) {
					tmp_id = customer[j].getId();
					tmp_surname = customer[j].getSurname();
					tmp_name = customer[j].getName();
					tmp_patronymic = customer[j].getPatronymic();
					tmp_address = customer[j].getAddress();
					tmp_cardNumber = customer[j].getCardNumber();
					tmp_account = customer[j].getAccount();
					customer[j].setId(customer[j + 1].getId());
					customer[j].setSurname(customer[j + 1].getSurname());
					customer[j].setName(customer[j + 1].getName());
					customer[j].setPatronymic(customer[j + 1].getPatronymic());
					customer[j].setAddress(customer[j + 1].getAddress());
					customer[j].setCardNumber(customer[j + 1].getCardNumber());
					customer[j].setAccount(customer[j + 1].getAccount());

					customer[j + 1].setId(tmp_id);
					customer[j + 1].setSurname(tmp_surname);
					customer[j + 1].setName(tmp_name);
					customer[j + 1].setPatronymic(tmp_patronymic);
					customer[j + 1].setAddress(tmp_address);
					customer[j + 1].setCardNumber(tmp_cardNumber);
					customer[j + 1].setAccount(tmp_account);
				} else if (compareStrings(customer[j].getName(), customer[j + 1].getName()) == 0)
					sortPatronymic(customer, j, j + 1);
			}
		}
	}

	private void sortPatronymic(Customer[] customer, int a, int b) {
		int tmp_id;
		String tmp_surname;
		String tmp_name;
		String tmp_patronymic;
		String tmp_address;
		String tmp_cardNumber;
		String tmp_account;

		for (int i = a; i < b; i++) {
			for (int j = a; j < b; j++) {
				if (compareStrings(customer[j].getPatronymic(), customer[j + 1].getPatronymic()) > 0) {
					tmp_id = customer[j].getId();
					tmp_surname = customer[j].getSurname();
					tmp_name = customer[j].getName();
					tmp_patronymic = customer[j].getPatronymic();
					tmp_address = customer[j].getAddress();
					tmp_cardNumber = customer[j].getCardNumber();
					tmp_account = customer[j].getAccount();
					customer[j].setId(customer[j + 1].getId());
					customer[j].setSurname(customer[j + 1].getSurname());
					customer[j].setName(customer[j + 1].getName());
					customer[j].setPatronymic(customer[j + 1].getPatronymic());
					customer[j].setAddress(customer[j + 1].getAddress());
					customer[j].setCardNumber(customer[j + 1].getCardNumber());
					customer[j].setAccount(customer[j + 1].getAccount());

					customer[j + 1].setId(tmp_id);
					customer[j + 1].setSurname(tmp_surname);
					customer[j + 1].setName(tmp_name);
					customer[j + 1].setPatronymic(tmp_patronymic);
					customer[j + 1].setAddress(tmp_address);
					customer[j + 1].setCardNumber(tmp_cardNumber);
					customer[j + 1].setAccount(tmp_account);
				}
			}
		}
	}

	private int compareStrings(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (i < s2.length() && s1.charAt(i) - s2.charAt(i) > 0)
				return 1;
			else if (i < s2.length() && s1.charAt(i) - s2.charAt(i) < 0)
				return -1;
		}
		return 0;
	}
}
