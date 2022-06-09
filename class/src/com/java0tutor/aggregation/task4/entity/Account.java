package com.java0tutor.aggregation.task4.entity;

public class Account {
	private String account;
	private Date openDate;
	private int lengthAccount = 20;
	private Currency currency;
	private double balance;
	private boolean status;

	public Account() {

	}

	public Account(String account, Date openDate, Currency currency, double balance, boolean status) {
		if (account.length() == lengthAccount) {
			for (int i = 0; i < account.length(); i++) {
				if (account.charAt(i) < '0' || account.charAt(i) > '9')
					this.account = null;
			}
			this.account = account;
		}
		this.openDate = openDate;
		this.currency = currency;
		this.balance = balance;
		this.status = status;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		if (account.length() == lengthAccount) {
			for (int i = 0; i < account.length(); i++) {
				if (account.charAt(i) < '0' || account.charAt(i) > '9')
					this.account = null;
			}
			this.account = account;
		}
	}

	public Date getOpenDate() {
		return openDate;
	}

	public void setOpenDate(Date openDate) {
		this.openDate = openDate;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public int getLengthAccount() {
		return lengthAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((currency == null) ? 0 : currency.hashCode());
		result = prime * result + lengthAccount;
		result = prime * result + ((openDate == null) ? 0 : openDate.hashCode());
		result = prime * result + (status ? 1231 : 1237);
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
		Account other = (Account) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (currency != other.currency)
			return false;
		if (lengthAccount != other.lengthAccount)
			return false;
		if (openDate == null) {
			if (other.openDate != null)
				return false;
		} else if (!openDate.equals(other.openDate))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [account=" + account + ", openDate=" + openDate + ", lengthAccount=" + lengthAccount
				+ ", currency=" + currency + ", balance=" + balance + ", status=" + status + "]";
	}

}
