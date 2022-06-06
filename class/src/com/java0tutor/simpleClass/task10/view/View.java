package com.java0tutor.simpleClass.task10.view;

import com.java0tutor.simpleClass.task10.entity.Airport;

public class View {
	public void printAirlines(Airport a) {
		if (a.getAirline().size() == 0) {
			System.out.println("Список пуст\n");
			return;
		}
		for (int i = 0; i < a.getAirline().size(); i++) {
			System.out.println("Пункт назначения: " + a.getAirline().get(i).getDestination());
			System.out.println("Номер рейса: " + a.getAirline().get(i).getNumOfFlight());
			System.out.println("Тип самолета: " + a.getAirline().get(i).getTypeOfAirline());
			if (a.getAirline().get(i).getTimeOfDeparture().getHour() < 10)
				System.out.print("Время вылета: 0" + a.getAirline().get(i).getTimeOfDeparture().getHour() + ":");
			else
				System.out.print("Время вылета: " + a.getAirline().get(i).getTimeOfDeparture().getHour() + ":");
			if (a.getAirline().get(i).getTimeOfDeparture().getMin() < 10)
				System.out.println("0" + a.getAirline().get(i).getTimeOfDeparture().getMin());
			else
				System.out.println(a.getAirline().get(i).getTimeOfDeparture().getMin());
			System.out.println("День недели: " + a.getAirline().get(i).getDayOfWeek() + "\n");
		}
	}
}
