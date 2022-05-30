package com.java0tutor.simpleClass.task8;

public class Main {

	public static void main(String[] args) {
		ListOfCustomers list = new ListOfCustomers();
		list.add(new Customer(1, "Иванов", "Иван", "Иванович", "Москва", "8888888888888888", "40817810000000000001"));
		list.add(new Customer(2, "Иванов", "Петр", "Петрович", "Москва", "5555555555555555", "40817810000000000002"));
		list.add(new Customer(3, "Иванов", "Иван", "И.", "Москва", "6666666666666666", "40817810000000000003"));
		list.add(new Customer(4, "Андреев", "Андрей", "А.", "Москва", "4444444444444444", "40817810000000000004"));
		list.add(new Customer(5, "Федотов", "И.", "Л.", "Москва", "1111222233334444", "40817810000000000005"));

		System.out.println("Список покупателей в алфавитном порядке:");
		list.sortBySurname();
		list.printAllCustomers();

		System.out.println("Список покупателей, у которых номер кредитной карточки находится в заданном интервале:");
		list.printDiapasonOfCardNumbers("1111222222221111", "5555555555555555");
	}

}
