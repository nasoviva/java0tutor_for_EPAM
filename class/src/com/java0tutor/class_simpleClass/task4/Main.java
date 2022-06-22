package com.java0tutor.class_simpleClass.task4;

import com.java0tutor.class_simpleClass.task4.entity.Depo;
import com.java0tutor.class_simpleClass.task4.entity.Time;
import com.java0tutor.class_simpleClass.task4.entity.Train;
import com.java0tutor.class_simpleClass.task4.logic.DepoLogic;
import com.java0tutor.class_simpleClass.task4.view.View;

public class Main {

	public static void main(String[] args) {
		Depo depo = new Depo(5);
		DepoLogic depoLogic = new DepoLogic();
		View view = new View();

		depo.add(new Train("Санкт-Петербург", 2, new Time(12, 04)));
		depo.add(new Train("Москва", 234, new Time(21, 50)));
		depo.add(new Train("Москва", 252, new Time(01, 00)));
		depo.add(new Train("Астрахань", 23, new Time(2, 52)));
		depo.add(new Train("Минск", 12, new Time(14, 15)));

		System.out.println("Список поездов:");
		view.printAllTrains(depo);

		depoLogic.sortByNumOfTrain(depo);
		System.out.println("Список поездов после сортировки по номеру поезда:");
		view.printAllTrains(depo);

		depoLogic.sortByDestination(depo);
		System.out.println("Список поездов после сортировки по пункту назначения:");
		view.printAllTrains(depo);

		System.out.println("Информация о поезде по номеру:");
		int num = view.inputNumOfTrain();
		view.printInfoAboutTrain(depoLogic.findInfoAboutTrain(depo, num));

	}
}
