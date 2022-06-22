package com.java0tutor.class_aggregation.task4.entity;

import java.util.Calendar;

public class Date {
	private int day;
	private int mes;
	private int year;

	public Date() {

	}

	public Date(int day, int mes, int year) {
		super();
		if (day > 0 && day <= 31)
			this.day = day;
		else
			this.day = 0;
		if (mes > 0 && mes <= 12)
			this.mes = mes;
		else
			this.mes = 0;
		if (year > 1900 && year <= Calendar.getInstance().get(Calendar.YEAR))
			this.year = year;
		else
			this.year = 0;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 0 && day <= 31)
			this.day = day;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		if (mes > 0 && mes <= 12)
			this.mes = mes;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1900 && year <= Calendar.getInstance().get(Calendar.YEAR))
			this.year = year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", mes=" + mes + ", year=" + year + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + day;
		result = prime * result + mes;
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		if (day != other.day)
			return false;
		if (mes != other.mes)
			return false;
		if (year != other.year)
			return false;
		return true;
	}

}
