package com.java0tutor.aggregation.task4.view;

import com.java0tutor.aggregation.task4.entity.Account;
import com.java0tutor.aggregation.task4.entity.Client;

public class View {
	public void printAccountsOfClient(Client client) {
		for (int i = 0; i < client.getAccounts().size(); i++) {
			System.out.println("Номер счета: " + client.getAccounts().get(i).getAccount());
			if (client.getAccounts().get(i).getOpenDate().getDay() < 10)
				System.out.print("Дата открытия: 0" + client.getAccounts().get(i).getOpenDate().getDay());
			else
				System.out.print("Дата открытия: " + client.getAccounts().get(i).getOpenDate().getDay());
			if (client.getAccounts().get(i).getOpenDate().getMes() < 10)
				System.out.print(".0" + client.getAccounts().get(i).getOpenDate().getMes());
			else
				System.out.print("." + client.getAccounts().get(i).getOpenDate().getMes());
			System.out.println("." + client.getAccounts().get(i).getOpenDate().getYear());
			System.out.println("Валюта: " + client.getAccounts().get(i).getCurrency());
			System.out.println("Баланс: " + client.getAccounts().get(i).getBalance() + " "
					+ client.getAccounts().get(i).getCurrency());
			if (client.getAccounts().get(i).isStatus() == true)
				System.out.println("Статус: активен\n");
			else
				System.out.println("Статус: заблокирован\n");
		}
	}

	public void printAccount(Account account) {
		if (account != null) {
			System.out.println("Номер счета: " + account.getAccount());
			if (account.getOpenDate().getDay() < 10)
				System.out.print("Дата открытия: 0" + account.getOpenDate().getDay());
			else
				System.out.print("Дата открытия: " + account.getOpenDate().getDay());
			if (account.getOpenDate().getMes() < 10)
				System.out.print(".0" + account.getOpenDate().getMes());
			else
				System.out.print("." + account.getOpenDate().getMes());
			System.out.println("." + account.getOpenDate().getYear());
			System.out.println("Валюта: " + account.getCurrency());
			System.out.println("Баланс: " + account.getBalance() + " " + account.getCurrency());
			if (account.isStatus() == true)
				System.out.println("Статус: активен\n");
			else
				System.out.println("Статус: заблокирован\n");

		} else
			System.out.println("Счет не найден");
	}
}
