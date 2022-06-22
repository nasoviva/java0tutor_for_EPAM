package com.java0tutor.class_simpleClass.task8.logic;

import com.java0tutor.class_simpleClass.task8.entity.ListOfCustomers;

public class CustomersLogic {

	public void sortBySurname(ListOfCustomers customer) {
		int tmp_id;
		String tmp_surname;
		String tmp_name;
		String tmp_patronymic;
		String tmp_address;
		String tmp_cardNumber;
		String tmp_account;

		for (int i = 0; i < customer.getCustomer().length; i++) {
			for (int j = 0; j < customer.getCustomer().length - 1; j++) {
				if (compareStrings(customer.getCustomer()[j].getSurname(),
						customer.getCustomer()[j + 1].getSurname()) > 0) {
					tmp_id = customer.getCustomer()[j].getId();
					tmp_surname = customer.getCustomer()[j].getSurname();
					tmp_name = customer.getCustomer()[j].getName();
					tmp_patronymic = customer.getCustomer()[j].getPatronymic();
					tmp_address = customer.getCustomer()[j].getAddress();
					tmp_cardNumber = customer.getCustomer()[j].getCardNumber();
					tmp_account = customer.getCustomer()[j].getAccount();
					customer.getCustomer()[j].setId(customer.getCustomer()[j + 1].getId());
					customer.getCustomer()[j].setSurname(customer.getCustomer()[j + 1].getSurname());
					customer.getCustomer()[j].setName(customer.getCustomer()[j + 1].getName());
					customer.getCustomer()[j].setPatronymic(customer.getCustomer()[j + 1].getPatronymic());
					customer.getCustomer()[j].setAddress(customer.getCustomer()[j + 1].getAddress());
					customer.getCustomer()[j].setCardNumber(customer.getCustomer()[j + 1].getCardNumber());
					customer.getCustomer()[j].setAccount(customer.getCustomer()[j + 1].getAccount());

					customer.getCustomer()[j + 1].setId(tmp_id);
					customer.getCustomer()[j + 1].setSurname(tmp_surname);
					customer.getCustomer()[j + 1].setName(tmp_name);
					customer.getCustomer()[j + 1].setPatronymic(tmp_patronymic);
					customer.getCustomer()[j + 1].setAddress(tmp_address);
					customer.getCustomer()[j + 1].setCardNumber(tmp_cardNumber);
					customer.getCustomer()[j + 1].setAccount(tmp_account);
				} else if (compareStrings(customer.getCustomer()[j].getSurname(),
						customer.getCustomer()[j + 1].getSurname()) == 0)
					sortByName(customer, j, j + 1);
			}
		}
	}

	private void sortByName(ListOfCustomers customer, int a, int b) {
		int tmp_id;
		String tmp_surname;
		String tmp_name;
		String tmp_patronymic;
		String tmp_address;
		String tmp_cardNumber;
		String tmp_account;

		for (int i = a; i < b; i++) {
			for (int j = a; j < b; j++) {
				if (compareStrings(customer.getCustomer()[j].getName(), customer.getCustomer()[j + 1].getName()) > 0) {
					tmp_id = customer.getCustomer()[j].getId();
					tmp_surname = customer.getCustomer()[j].getSurname();
					tmp_name = customer.getCustomer()[j].getName();
					tmp_patronymic = customer.getCustomer()[j].getPatronymic();
					tmp_address = customer.getCustomer()[j].getAddress();
					tmp_cardNumber = customer.getCustomer()[j].getCardNumber();
					tmp_account = customer.getCustomer()[j].getAccount();
					customer.getCustomer()[j].setId(customer.getCustomer()[j + 1].getId());
					customer.getCustomer()[j].setSurname(customer.getCustomer()[j + 1].getSurname());
					customer.getCustomer()[j].setName(customer.getCustomer()[j + 1].getName());
					customer.getCustomer()[j].setPatronymic(customer.getCustomer()[j + 1].getPatronymic());
					customer.getCustomer()[j].setAddress(customer.getCustomer()[j + 1].getAddress());
					customer.getCustomer()[j].setCardNumber(customer.getCustomer()[j + 1].getCardNumber());
					customer.getCustomer()[j].setAccount(customer.getCustomer()[j + 1].getAccount());

					customer.getCustomer()[j + 1].setId(tmp_id);
					customer.getCustomer()[j + 1].setSurname(tmp_surname);
					customer.getCustomer()[j + 1].setName(tmp_name);
					customer.getCustomer()[j + 1].setPatronymic(tmp_patronymic);
					customer.getCustomer()[j + 1].setAddress(tmp_address);
					customer.getCustomer()[j + 1].setCardNumber(tmp_cardNumber);
					customer.getCustomer()[j + 1].setAccount(tmp_account);
				} else if (compareStrings(customer.getCustomer()[j].getName(),
						customer.getCustomer()[j + 1].getName()) == 0)
					sortPatronymic(customer, j, j + 1);
			}
		}
	}

	private void sortPatronymic(ListOfCustomers customer, int a, int b) {
		int tmp_id;
		String tmp_surname;
		String tmp_name;
		String tmp_patronymic;
		String tmp_address;
		String tmp_cardNumber;
		String tmp_account;

		for (int i = a; i < b; i++) {
			for (int j = a; j < b; j++) {
				if (compareStrings(customer.getCustomer()[j].getPatronymic(),
						customer.getCustomer()[j + 1].getPatronymic()) > 0) {
					tmp_id = customer.getCustomer()[j].getId();
					tmp_surname = customer.getCustomer()[j].getSurname();
					tmp_name = customer.getCustomer()[j].getName();
					tmp_patronymic = customer.getCustomer()[j].getPatronymic();
					tmp_address = customer.getCustomer()[j].getAddress();
					tmp_cardNumber = customer.getCustomer()[j].getCardNumber();
					tmp_account = customer.getCustomer()[j].getAccount();
					customer.getCustomer()[j].setId(customer.getCustomer()[j + 1].getId());
					customer.getCustomer()[j].setSurname(customer.getCustomer()[j + 1].getSurname());
					customer.getCustomer()[j].setName(customer.getCustomer()[j + 1].getName());
					customer.getCustomer()[j].setPatronymic(customer.getCustomer()[j + 1].getPatronymic());
					customer.getCustomer()[j].setAddress(customer.getCustomer()[j + 1].getAddress());
					customer.getCustomer()[j].setCardNumber(customer.getCustomer()[j + 1].getCardNumber());
					customer.getCustomer()[j].setAccount(customer.getCustomer()[j + 1].getAccount());

					customer.getCustomer()[j + 1].setId(tmp_id);
					customer.getCustomer()[j + 1].setSurname(tmp_surname);
					customer.getCustomer()[j + 1].setName(tmp_name);
					customer.getCustomer()[j + 1].setPatronymic(tmp_patronymic);
					customer.getCustomer()[j + 1].setAddress(tmp_address);
					customer.getCustomer()[j + 1].setCardNumber(tmp_cardNumber);
					customer.getCustomer()[j + 1].setAccount(tmp_account);
				}
			}
		}
	}

	public int compareStrings(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (i < s2.length() && s1.charAt(i) - s2.charAt(i) > 0)
				return 1;
			else if (i < s2.length() && s1.charAt(i) - s2.charAt(i) < 0)
				return -1;
		}
		return 0;
	}

}
