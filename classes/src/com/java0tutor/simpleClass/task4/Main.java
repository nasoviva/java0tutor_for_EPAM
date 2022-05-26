package com.java0tutor.simpleClass.task4;

public class Main {

	public static void main(String[] args) {
		Depo depo = new Depo();
		depo.add(new Train("Санкт-Петербург", 2, new Time(12, 04)));
		depo.add(new Train("Москва", 234, new Time(21, 50)));
		depo.add(new Train("Москва", 252, new Time(01, 00)));
		depo.add(new Train("Астрахань", 23, new Time(2, 52)));
		depo.add(new Train("Минск", 12, new Time(14, 15)));

		System.out.println("Список поездов:");
		depo.printAllTrains();

		depo.sortByNumOfTrain();
		System.out.println("Список поездов после сортировки по номеру поезда:");
		depo.printAllTrains();

		depo.sortByDestination();
		System.out.println("Список поездов после сортировки по пункту назначения:");
		depo.printAllTrains();

		System.out.println("Информация о поезде по номеру:");
		int num = depo.inputNumOfTrain();
		depo.findInfoAboutTrain(num);

	}
}
