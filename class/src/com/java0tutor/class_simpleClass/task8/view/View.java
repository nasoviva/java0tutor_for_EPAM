package com.java0tutor.class_simpleClass.task8.view;

import com.java0tutor.class_simpleClass.task8.entity.ListOfCustomers;
import com.java0tutor.class_simpleClass.task8.logic.CustomersLogic;

public class View {

	CustomersLogic logic = new CustomersLogic();

	public void printAllCustomers(ListOfCustomers customer) {
		for (int i = 0; i < customer.getCustomer().length; i++) {
			System.out.println("ID: " + customer.getCustomer()[i].getId());
			System.out.println("Фамилия: " + customer.getCustomer()[i].getSurname());
			System.out.println("Имя: " + customer.getCustomer()[i].getName());
			System.out.println("Отчество: " + customer.getCustomer()[i].getPatronymic());
			System.out.println("Адрес: " + customer.getCustomer()[i].getAddress());
			System.out.println("Номер карты: " + customer.getCustomer()[i].getCardNumber());
			System.out.println("Номер счета: " + customer.getCustomer()[i].getAccount());
			System.out.println();
		}
	}

	public void printCustomersOfId(ListOfCustomers customer, int id) {
		for (int i = 0; i < customer.getCustomer().length; i++) {
			if (id == customer.getCustomer()[i].getId()) {
				System.out.println("ID: " + customer.getCustomer()[i].getId());
				System.out.println("Фамилия: " + customer.getCustomer()[i].getSurname());
				System.out.println("Имя: " + customer.getCustomer()[i].getName());
				System.out.println("Отчество: " + customer.getCustomer()[i].getPatronymic());
				System.out.println("Адрес: " + customer.getCustomer()[i].getAddress());
				System.out.println("Номер карты: " + customer.getCustomer()[i].getCardNumber());
				System.out.println("Номер счета: " + customer.getCustomer()[i].getAccount());
				System.out.println();
			}
		}
	}

	public void printCustomersOfCardNumber(ListOfCustomers customer, String cardNumber) {
		int flag;

		flag = 0;
		for (int i = 0; i < customer.getCustomer().length; i++) {
			if (logic.compareStrings(cardNumber, customer.getCustomer()[i].getCardNumber()) == 0
					&& customer.getCustomer()[i].getCardNumber().length() == cardNumber.length()) {
				System.out.println("ID: " + customer.getCustomer()[i].getId());
				System.out.println("Фамилия: " + customer.getCustomer()[i].getSurname());
				System.out.println("Имя: " + customer.getCustomer()[i].getName());
				System.out.println("Отчество: " + customer.getCustomer()[i].getPatronymic());
				System.out.println("Адрес: " + customer.getCustomer()[i].getAddress());
				System.out.println("Номер карты: " + customer.getCustomer()[i].getCardNumber());
				System.out.println("Номер счета: " + customer.getCustomer()[i].getAccount());
				flag = 1;
			}
		}
		if (flag == 0)
			System.out.println("Клиент с номером карты " + cardNumber + " не найден");
		System.out.println();
	}

	public void printDiapasonOfCardNumbers(ListOfCustomers customer, String from, String to) {
		for (int i = 0; i < customer.getCustomer().length; i++) {
			if (logic.compareStrings(customer.getCustomer()[i].getCardNumber(), from) >= 0
					&& logic.compareStrings(customer.getCustomer()[i].getCardNumber(), to) <= 0) {
				System.out.println("ID: " + customer.getCustomer()[i].getId());
				System.out.println("Фамилия: " + customer.getCustomer()[i].getSurname());
				System.out.println("Имя: " + customer.getCustomer()[i].getName());
				System.out.println("Отчество: " + customer.getCustomer()[i].getPatronymic());
				System.out.println("Адрес: " + customer.getCustomer()[i].getAddress());
				System.out.println("Номер карты: " + customer.getCustomer()[i].getCardNumber());
				System.out.println("Номер счета: " + customer.getCustomer()[i].getAccount());
				System.out.println();
			}
		}
	}

}
