package com.java0tutor.class_aggregation.task4.entity;

import java.util.List;

public class Client {
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private Passport numberOfPassport;
	private String secretWord;
	private String address;
	private List<Account> accounts;

	public Client() {

	}

	public Client(int id, String surname, String name, String patronymic, Passport numberOfPassport, String secretWord,
			String address, List<Account> accounts) {
		super();
		if (id > 0 && id < Integer.MAX_VALUE)
			this.id = id;
		else
			this.id = 0;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.numberOfPassport = numberOfPassport;
		this.secretWord = secretWord;
		this.address = address;
		this.accounts = accounts;
	}

	public void addAccount(Account newAccount) {
		accounts.add(newAccount);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public Passport getNumberOfPassport() {
		return numberOfPassport;
	}

	public void setNumberOfPassport(Passport numberOfPassport) {
		this.numberOfPassport = numberOfPassport;
	}

	public String getSecretWord() {
		return secretWord;
	}

	public void setSecretWord(String secretWord) {
		this.secretWord = secretWord;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((numberOfPassport == null) ? 0 : numberOfPassport.hashCode());
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((secretWord == null) ? 0 : secretWord.hashCode());
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
		Client other = (Client) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfPassport == null) {
			if (other.numberOfPassport != null)
				return false;
		} else if (!numberOfPassport.equals(other.numberOfPassport))
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (secretWord == null) {
			if (other.secretWord != null)
				return false;
		} else if (!secretWord.equals(other.secretWord))
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
		return "Client [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", numberOfPassport=" + numberOfPassport + ", secretWord=" + secretWord + ", address=" + address
				+ ", accounts=" + accounts + "]";
	}

}
