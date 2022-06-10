package com.java0tutor.aggregation.task4;

import java.util.ArrayList;
import java.util.List;

import com.java0tutor.aggregation.task4.entity.Account;
import com.java0tutor.aggregation.task4.entity.Client;
import com.java0tutor.aggregation.task4.entity.Currency;
import com.java0tutor.aggregation.task4.entity.Date;
import com.java0tutor.aggregation.task4.entity.Passport;
import com.java0tutor.aggregation.task4.logic.AccountsLogic;
import com.java0tutor.aggregation.task4.view.View;

//Programming with classes. Агрегация и композиция. Задание 4:
//Счета. Клиент может иметь несколько счетов в банке. 
//Учитывать возможность блокировки/разблокировки счета. 
//Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. 
//Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.

public class Main {

	public static void main(String[] args) {
		View view = new View();
		AccountsLogic logic = new AccountsLogic();
		List<Account> accounts = new ArrayList<Account>();

		Account account1 = new Account("40840410000000000001", new Date(1, 1, 2021), Currency.RUB, 30000, true);
		Account account2 = new Account("40810110000000000002", new Date(1, 1, 2021), Currency.USD, 2000, true);
		Account account3 = new Account("40879810000000000003", new Date(1, 1, 2021), Currency.EURO, -100, true);
		accounts.add(account1);
		accounts.add(account2);
		accounts.add(account3);
		Client client = new Client(1, "Petrov", "Ivan", "Semenovich",
				new Passport("6000", "569622", new Date(16, 12, 2002), "OVD"), "secret", "Moscow", accounts);

		logic.isBlockStatusOfAccount(client, account2);
		logic.isActiveStatusOfAccount(client, client.getAccounts().get(0));

		System.out.println("\nСортировка счетов по номеру");
		logic.sortByNumberOfAccounts(client);
		view.printAccountsOfClient(client);
		System.out.println("\nСортировка счетов по балансу");
		logic.sortByBalanceOfAccounts(client);
		view.printAccountsOfClient(client);

		System.out.println("Поиск счета");
		view.printAccount(logic.searchAccount(client, "40840410000000000001"));

		System.out.println("Баланс на всех счетах: " + logic.sumOfAllAccountsInRub(client));
		System.out.println("Баланс на счетах с положительным остатком: " + logic.sumOfPositiveAccountsInRub(client));
		System.out.println("Баланс на счетах с отрицательным остатком: " + logic.sumOfNegativeAccountsInRub(client));
		System.out.println("Баланс на активных счетах: " + logic.sumOfActiveAccountsInRub(client));
		System.out.println("Баланс на заблокированных счетах: " + logic.sumOfBlockAccountsInRub(client));

	}

}
