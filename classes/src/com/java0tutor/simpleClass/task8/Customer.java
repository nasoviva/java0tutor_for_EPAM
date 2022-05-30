package com.java0tutor.simpleClass.task8;

//Programming with classes. Простейшие классы и объекты. Задание 8:
//Создать класс Customer, спецификация которого приведена ниже. 
//Определить конструкторы, set- и get- методы и метод toString(). 
//Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
//и методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

public class Customer {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private String cardNumber;
	private String account;
	private int lengthCardNumber = 16;
	private int lengthAccount = 20;

	public Customer() {
	}

	public Customer(int id, String surname, String name, String patronymic, String address, String cardNumber,
			String account) {
		super();
		if (id > 0 && id < Integer.MAX_VALUE)
			this.id = id;
		else
			this.id = 0;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		if (cardNumber.length() == lengthCardNumber) {
			for (int i = 0; i < cardNumber.length(); i++) {
				if (cardNumber.charAt(i) < '0' || cardNumber.charAt(i) > '9')
					this.cardNumber = null;
			}
			this.cardNumber = cardNumber;
		}
		if (account.length() == lengthAccount) {
			for (int i = 0; i < account.length(); i++) {
				if (account.charAt(i) < '0' || account.charAt(i) > '9')
					this.account = null;
			}
			this.account = account;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0 && id < Integer.MAX_VALUE)
			this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		if (cardNumber.length() == lengthCardNumber) {
			for (int i = 0; i < cardNumber.length(); i++) {
				if (cardNumber.charAt(i) < '0' || cardNumber.charAt(i) > '9')
					return;
			}
			this.cardNumber = cardNumber;
		}
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		if (account.length() == lengthAccount) {
			for (int i = 0; i < account.length(); i++) {
				if (account.charAt(i) < '0' || account.charAt(i) > '9')
					return;
			}
			this.account = account;
		}
	}

	public int getLengthCardNumber() {
		return lengthCardNumber;
	}

	public int getLengthAccount() {
		return lengthAccount;
	}

	@Override
	public String toString() {
		return "[id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic + ", address="
				+ address + ", cardNumber=" + cardNumber + ", account=" + account + ", lengthCardNumber="
				+ lengthCardNumber + ", lengthAccount=" + lengthAccount + "]";
	}

}
