package com.java0tutor.class_aggregation.task4.logic;

import com.java0tutor.class_aggregation.task4.entity.Account;
import com.java0tutor.class_aggregation.task4.entity.Client;
import com.java0tutor.class_aggregation.task4.entity.Currency;
import com.java0tutor.class_aggregation.task4.entity.Date;

public class AccountsLogic {

	public void isActiveStatusOfAccount(Client client, Account account) {
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getAccount().compareTo(account.getAccount()) == 0) {
				client.getAccounts().get(i).setStatus(true);
			}
		}
	}

	public void isBlockStatusOfAccount(Client client, Account account) {
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getAccount().compareTo(account.getAccount()) == 0) {
				client.getAccounts().get(i).setStatus(false);
			}
		}
	}

	public Account searchAccount(Client client, String account) {
		Account result = null;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getAccount().compareTo(account) == 0) {
				result = client.getAccounts().get(i);
			}
		}
		return result;
	}

	public void sortByNumberOfAccounts(Client client) {
		String tmp_account;
		Date tmp_openDate;
		Currency tmp_currency;
		double tmp_balance;
		boolean tmp_status;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			for (int j = 0; j < client.getAccounts().size() - 1; j++) {
				if (client.getAccounts().get(j).getAccount()
						.compareTo(client.getAccounts().get(j + 1).getAccount()) > 0) {
					tmp_account = client.getAccounts().get(j).getAccount();
					tmp_openDate = client.getAccounts().get(j).getOpenDate();
					tmp_currency = client.getAccounts().get(j).getCurrency();
					tmp_balance = client.getAccounts().get(j).getBalance();
					tmp_status = client.getAccounts().get(j).isStatus();
					client.getAccounts().get(j).setAccount(client.getAccounts().get(j + 1).getAccount());
					client.getAccounts().get(j).setOpenDate(client.getAccounts().get(j + 1).getOpenDate());
					client.getAccounts().get(j).setCurrency(client.getAccounts().get(j + 1).getCurrency());
					client.getAccounts().get(j).setBalance(client.getAccounts().get(j + 1).getBalance());
					client.getAccounts().get(j).setStatus(client.getAccounts().get(j + 1).isStatus());
					client.getAccounts().get(j + 1).setAccount(tmp_account);
					client.getAccounts().get(j + 1).setOpenDate(tmp_openDate);
					client.getAccounts().get(j + 1).setCurrency(tmp_currency);
					client.getAccounts().get(j + 1).setBalance(tmp_balance);
					client.getAccounts().get(j + 1).setStatus(tmp_status);
				}
			}
		}
	}

	public void sortByBalanceOfAccounts(Client client) {
		String tmp_account;
		Date tmp_openDate;
		Currency tmp_currency;
		double tmp_balance;
		boolean tmp_status;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			for (int j = 0; j < client.getAccounts().size() - 1; j++) {
				if (conversionCurrencyInRub(client.getAccounts().get(j)) > conversionCurrencyInRub(
						client.getAccounts().get(j + 1))) {
					tmp_account = client.getAccounts().get(j).getAccount();
					tmp_openDate = client.getAccounts().get(j).getOpenDate();
					tmp_currency = client.getAccounts().get(j).getCurrency();
					tmp_balance = client.getAccounts().get(j).getBalance();
					tmp_status = client.getAccounts().get(j).isStatus();
					client.getAccounts().get(j).setAccount(client.getAccounts().get(j + 1).getAccount());
					client.getAccounts().get(j).setOpenDate(client.getAccounts().get(j + 1).getOpenDate());
					client.getAccounts().get(j).setCurrency(client.getAccounts().get(j + 1).getCurrency());
					client.getAccounts().get(j).setBalance(client.getAccounts().get(j + 1).getBalance());
					client.getAccounts().get(j).setStatus(client.getAccounts().get(j + 1).isStatus());
					client.getAccounts().get(j + 1).setAccount(tmp_account);
					client.getAccounts().get(j + 1).setOpenDate(tmp_openDate);
					client.getAccounts().get(j + 1).setCurrency(tmp_currency);
					client.getAccounts().get(j + 1).setBalance(tmp_balance);
					client.getAccounts().get(j + 1).setStatus(tmp_status);
				}
			}
		}
	}

	public double sumOfAllAccountsInRub(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			sum = sum + conversionCurrencyInRub(client.getAccounts().get(i));
		}
		return sum;
	}

	public double sumOfPositiveAccountsInRub(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getBalance() > 0) {
				sum = sum + conversionCurrencyInRub(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfNegativeAccountsInRub(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getBalance() < 0) {
				sum = sum + conversionCurrencyInRub(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfActiveAccountsInRub(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).isStatus() == true) {
				sum = sum + conversionCurrencyInRub(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfBlockAccountsInRub(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).isStatus() == false) {
				sum = sum + conversionCurrencyInRub(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfAllAccountsInUsd(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			sum = sum + conversionCurrencyInUsd(client.getAccounts().get(i));
		}
		return sum;
	}

	public double sumOfPositiveAccountsInUsd(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getBalance() > 0) {
				sum = sum + conversionCurrencyInUsd(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfNegativeAccountsInUsd(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getBalance() < 0) {
				sum = sum + conversionCurrencyInUsd(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfActiveAccountsInUsd(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).isStatus() == true) {
				sum = sum + conversionCurrencyInUsd(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfBlockAccountsInUsd(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).isStatus() == false) {
				sum = sum + conversionCurrencyInUsd(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfAllAccountsInEuro(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			sum = sum + conversionCurrencyInEuro(client.getAccounts().get(i));
		}
		return sum;
	}

	public double sumOfPositiveAccountsInEuro(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getBalance() > 0) {
				sum = sum + conversionCurrencyInEuro(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfNegativeAccountsInEuro(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).getBalance() < 0) {
				sum = sum + conversionCurrencyInEuro(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfActiveAccountsInEuro(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).isStatus() == true) {
				sum = sum + conversionCurrencyInEuro(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	public double sumOfBlockAccountsInEuro(Client client) {
		double sum = 0;
		for (int i = 0; i < client.getAccounts().size(); i++) {
			if (client.getAccounts().get(i).isStatus() == false) {
				sum = sum + conversionCurrencyInEuro(client.getAccounts().get(i));
			}
		}
		return sum;
	}

	private double conversionCurrencyInRub(Account account) {
		double result;
		if (account.getCurrency() == Currency.EURO)
			result = account.getBalance() * 75;
		else if (account.getCurrency() == Currency.USD)
			result = account.getBalance() * 60;
		else
			result = account.getBalance();
		return result;
	}

	private double conversionCurrencyInUsd(Account account) {
		double result;
		if (account.getCurrency() == Currency.RUB)
			result = account.getBalance() * 0.017;
		else if (account.getCurrency() == Currency.EURO)
			result = account.getBalance() * 1.06;
		else
			result = account.getBalance();
		return result;
	}

	private double conversionCurrencyInEuro(Account account) {
		double result;
		if (account.getCurrency() == Currency.RUB)
			result = account.getBalance() * 0.016;
		else if (account.getCurrency() == Currency.USD)
			result = account.getBalance() * 0.94;
		else
			result = account.getBalance();
		return result;
	}

}
