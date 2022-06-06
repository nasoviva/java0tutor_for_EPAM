package com.java0tutor.simpleClass.task10.logic;

import com.java0tutor.simpleClass.task10.entity.Airport;
import com.java0tutor.simpleClass.task10.entity.Time;
import com.java0tutor.simpleClass.task10.entity.Week;

public class AirportLogic {

	public Airport findFlightByDestination(Airport a, String destination) {
		Airport newList = new Airport();

		for (int i = 0; i < a.getAirline().size(); i++) {
			if (a.getAirline().get(i).getDestination().equals(destination)) {
				newList.addAirline(a.getAirline().get(i));
			}
		}
		return newList;
	}

	public Airport findFlightByDayOfWeek(Airport a, Week day) {
		Airport newList = new Airport();

		for (int i = 0; i < a.getAirline().size(); i++) {
			if (a.getAirline().get(i).getDayOfWeek().equals(day)) {
				newList.addAirline(a.getAirline().get(i));
			}
		}
		return newList;
	}

	public Airport findFlightByDayOfWeekAfterTime(Airport a, Week day, Time time) {
		Airport newList = new Airport();

		for (int i = 0; i < a.getAirline().size(); i++) {
			if (a.getAirline().get(i).getDayOfWeek().equals(day)) {
				if (a.getAirline().get(i).getTimeOfDeparture().getHour() >= time.getHour()) {
					if (a.getAirline().get(i).getTimeOfDeparture().getMin() >= time.getMin())
						newList.addAirline(a.getAirline().get(i));
				}
			}
		}
		return newList;
	}
}
