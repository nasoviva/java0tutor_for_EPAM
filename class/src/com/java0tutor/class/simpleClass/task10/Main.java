package com.java0tutor.simpleClass.task10;

//Programming with classes. Простейшие классы и объекты. Задание 10:
//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
//и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import com.java0tutor.simpleClass.task10.entity.AirType;
import com.java0tutor.simpleClass.task10.entity.Airline;
import com.java0tutor.simpleClass.task10.entity.Airport;
import com.java0tutor.simpleClass.task10.entity.Time;
import com.java0tutor.simpleClass.task10.entity.Week;
import com.java0tutor.simpleClass.task10.logic.AirportLogic;
import com.java0tutor.simpleClass.task10.view.View;

public class Main {

	public static void main(String[] args) {
		AirportLogic logic = new AirportLogic();
		View view = new View();
		Airport svo = new Airport();

		svo.addAirline(new Airline("Paris", "134B", AirType.Boeing, new Time(12, 34), Week.MONDAY));
		svo.addAirline(new Airline("New York", "13", AirType.IL, new Time(2, 3), Week.FRIDAY));
		svo.addAirline(new Airline("London", "14RK", AirType.TU, new Time(10, 5), Week.MONDAY));
		svo.addAirline(new Airline("Paris", "3L", AirType.SukhoiSuperJet, new Time(1, 15), Week.THURSDAY));
		svo.addAirline(new Airline("Minsk", "1534", AirType.AerobusAirbus, new Time(22, 52), Week.MONDAY));

		System.out.println("Список рейсов для заданного пункта назначения:");
		view.printAirlines(logic.findFlightByDestination(svo, "Paris"));

		System.out.println("Список рейсов для заданного дня недели:");
		view.printAirlines(logic.findFlightByDayOfWeek(svo, Week.MONDAY));

		System.out.println("Список рейсов для заданного дня недели, время вылета для которых больше заданного:");
		view.printAirlines(logic.findFlightByDayOfWeekAfterTime(svo, Week.MONDAY, new Time(22, 50)));
	}

}
