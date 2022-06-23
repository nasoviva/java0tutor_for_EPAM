package com.java0tutor.oop.task3.logic;

import java.util.GregorianCalendar;

import com.java0tutor.oop.task3.entity.Calendar;
import com.java0tutor.oop.task3.entity.Calendar.Year;
import com.java0tutor.oop.task3.entity.Calendar.Year.Month;
import com.java0tutor.oop.task3.entity.Calendar.Year.Month.Day;

public class CalendarLogic {

	public void createYear(Calendar calendar, Year year) {
		calendar.addYear(createMonthsOfYear(year));
	}

	public void makeDayHoliday(Year year, int month, int day, String title) {
		year.getMonths().get(month - 1).getDays().get(day - 1).setHoliday(true);
		year.getMonths().get(month - 1).getDays().get(day - 1).setTitle(title);
	}

	private Year createMonthsOfYear(Year year) {
		for (int i = 1; i <= 12; i++) {
			year.addMonth(createDaysOfMonth(year, year.new Month(i)));
		}
		return year;
	}

	private Month createDaysOfMonth(Year year, Month month) {
		if (month.getMonth() == 4 || month.getMonth() == 6 || month.getMonth() == 9 || month.getMonth() == 11) {
			for (int i = 1; i <= 30; i++) {
				month.addDay(createDayOfWeek(year, month, month.new Day(i)));
			}
		} else if (month.getMonth() == 2 && visocosnyYear(year) == true) {
			for (int i = 1; i <= 29; i++) {
				month.addDay(createDayOfWeek(year, month, month.new Day(i)));
			}
		} else if (month.getMonth() == 2 && visocosnyYear(year) == false) {
			for (int i = 1; i <= 28; i++) {
				month.addDay(createDayOfWeek(year, month, month.new Day(i)));
			}
		} else {
			for (int i = 1; i <= 31; i++) {
				month.addDay(createDayOfWeek(year, month, month.new Day(i)));
			}
		}
		return month;
	}

	private Day createDayOfWeek(Year year, Month month, Day day) {
		int dayOfWeek;

		GregorianCalendar c = new GregorianCalendar(year.getYear(), month.getMonth() - 1, day.getDay() - 1);

		dayOfWeek = c.get(java.util.GregorianCalendar.DAY_OF_WEEK);
		day.setDayOfWeek(dayOfWeek);
		if (dayOfWeek > 5) {
			day.setWeekend(true);
		}
		return day;
	}

	private boolean visocosnyYear(Year year) {
		if (year.getYear() % 400 == 0)
			return true;
		else if (year.getYear() % 100 == 0)
			return false;
		if (year.getYear() % 4 == 0)
			return true;
		else
			return false;
	}

}
