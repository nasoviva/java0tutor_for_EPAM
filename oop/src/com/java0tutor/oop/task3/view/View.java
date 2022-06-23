package com.java0tutor.oop.task3.view;

import com.java0tutor.oop.task3.entity.Calendar;
import com.java0tutor.oop.task3.entity.Calendar.Year;
import com.java0tutor.oop.task3.entity.Calendar.Year.Month;

public class View {

	public void printCalendar(Calendar calendar) {
		System.out.println(calendar.getTitle() + "\n");
		for (int i = 0; i < calendar.getYears().size(); i++) {
			printYear(calendar.getYears().get(i));
		}
	}

	public void printWeekends(Calendar calendar) {
		System.out.println("\nWeekends:");
		for (int i = 0; i < calendar.getYears().size(); i++) {
			for (int j = 0; j < calendar.getYears().get(i).getMonths().size(); j++) {
				System.out.print(
						" " + printMonthInTextFormat(calendar.getYears().get(i).getMonths().get(j).getMonth()) + ": ");
				for (int k = 0; k < calendar.getYears().get(i).getMonths().get(j).getDays().size(); k++) {
					if (calendar.getYears().get(i).getMonths().get(j).getDays().get(k).isWeekend() == true) {
						System.out
								.print(calendar.getYears().get(i).getMonths().get(j).getDays().get(k).getDay() + "; ");
					}
				}
				System.out.println();
			}
		}
	}

	private String printMonthInTextFormat(int i) {
		String str_month;
		if (i == 1)
			str_month = "January";
		else if (i == 2)
			str_month = "February";
		else if (i == 3)
			str_month = "March";
		else if (i == 4)
			str_month = "April";
		else if (i == 5)
			str_month = "May";
		else if (i == 6)
			str_month = "June";
		else if (i == 7)
			str_month = "July";
		else if (i == 8)
			str_month = "August";
		else if (i == 9)
			str_month = "September";
		else if (i == 10)
			str_month = "October";
		else if (i == 11)
			str_month = "November";
		else
			str_month = "December";
		return str_month;
	}

	public void printHolidays(Calendar calendar) {
		System.out.println("\nHolidays:");
		for (int i = 0; i < calendar.getYears().size(); i++) {
			for (int j = 0; j < calendar.getYears().get(i).getMonths().size(); j++) {
				for (int k = 0; k < calendar.getYears().get(i).getMonths().get(j).getDays().size(); k++) {
					if (calendar.getYears().get(i).getMonths().get(j).getDays().get(k).getTitle() != null) {
						System.out.print(calendar.getYears().get(i).getMonths().get(j).getDays().get(k).getDay());
						System.out.print(
								" " + printMonthInTextFormat(calendar.getYears().get(i).getMonths().get(j).getMonth()));
						System.out.print(" " + calendar.getYears().get(i).getYear());
						System.out.println(
								" - " + calendar.getYears().get(i).getMonths().get(j).getDays().get(k).getTitle());
					}
				}
			}
		}
		System.out.println();
	}

	private void printYear(Year year) {
		System.out.println(year.getYear() + " year");
		for (int i = 0; i < year.getMonths().size(); i++) {
			printMonth(year.getMonths().get(i));
		}

	}

	private void printMonth(Month month) {
		int j;

		System.out.println("\n" + printMonthInTextFormat(month.getMonth()));
		System.out.println("SU  MN  TU  WE  TH  FR  ST");
		j = month.getDays().get(0).getDayOfWeek();
		while (j > 0) {
			j--;
			System.out.print("    ");
		}
		for (int i = 0; i < month.getDays().size(); i++) {

			if ((i + month.getDays().get(0).getDayOfWeek()) % 7 == 0) {
				System.out.println();
			}
			if (i < 9) {
				System.out.print("0");
			}
			if (month.getDays().get(i).isHoliday() == true) {
				System.out.print(month.getDays().get(i).getDay() + "h ");
			} else if (month.getDays().get(i).isWeekend() == true) {
				System.out.print(month.getDays().get(i).getDay() + "w ");
			} else
				System.out.print(month.getDays().get(i).getDay() + "  ");
		}
		System.out.println();
	}
}
