package com.java0tutor.simpleClass.task8.entity;

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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
		result = prime * result + id;
		result = prime * result + lengthAccount;
		result = prime * result + lengthCardNumber;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		if (id != other.id)
			return false;
		if (lengthAccount != other.lengthAccount)
			return false;
		if (lengthCardNumber != other.lengthCardNumber)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", cardNumber=" + cardNumber + ", account=" + account + ", lengthCardNumber="
				+ lengthCardNumber + ", lengthAccount=" + lengthAccount + "]";
	}

}
