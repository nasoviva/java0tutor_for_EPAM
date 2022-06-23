package com.java0tutor.oop.task3;

import com.java0tutor.oop.task3.entity.Calendar;
import com.java0tutor.oop.task3.entity.Calendar.Year;
import com.java0tutor.oop.task3.logic.CalendarLogic;
import com.java0tutor.oop.task3.view.View;

//Basics of OOP. Задание 3:
//Создать класс Календарь с внутренним классом, 
//с помощью объектов которого можно хранить информацию о выходных и праздничных днях.

public class Main {

	public static void main(String[] args) {
		CalendarLogic logic = new CalendarLogic();
		View view = new View();
		Calendar cal = new Calendar("Calendar");
		Year year = cal.new Year(2022);
		logic.createYear(cal, year);
		logic.makeDayHoliday(year, 12, 31, "new year");
		logic.makeDayHoliday(year, 12, 27, "marry christmas");
		view.printCalendar(cal);
		view.printWeekends(cal);
		view.printHolidays(cal);
	}

}
