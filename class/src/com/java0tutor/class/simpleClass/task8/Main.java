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

import com.java0tutor.simpleClass.task8.entity.Customer;
import com.java0tutor.simpleClass.task8.entity.ListOfCustomers;
import com.java0tutor.simpleClass.task8.logic.CustomersLogic;
import com.java0tutor.simpleClass.task8.view.View;

public class Main {

	public static void main(String[] args) {
		ListOfCustomers list = new ListOfCustomers(5);
		CustomersLogic sort = new CustomersLogic();
		View view = new View();
		list.add(new Customer(1, "Иванов", "Иван", "Иванович", "Москва", "8888888888888888", "40817810000000000001"));
		list.add(new Customer(2, "Иванов", "Петр", "Петрович", "Москва", "5555555555555555", "40817810000000000002"));
		list.add(new Customer(3, "Иванов", "Иван", "И.", "Москва", "6666666666666666", "40817810000000000003"));
		list.add(new Customer(4, "Андреев", "Андрей", "А.", "Москва", "4444444444444444", "40817810000000000004"));
		list.add(new Customer(5, "Федотов", "И.", "Л.", "Москва", "1111222233334444", "40817810000000000005"));

		System.out.println("Список покупателей в алфавитном порядке:");
		sort.sortBySurname(list);
		view.printAllCustomers(list);

		System.out.println("Поиск покупателей по id:");
		view.printCustomersOfId(list, 4);

		System.out.println("Поиск покупателей по номеру карты:");
		view.printCustomersOfCardNumber(list, "1111222233334444");

		System.out.println("Список покупателей, у которых номер кредитной карточки находится в заданном интервале:");
		view.printDiapasonOfCardNumbers(list, "1111111111111111", "5555555555555555");
	}

}
