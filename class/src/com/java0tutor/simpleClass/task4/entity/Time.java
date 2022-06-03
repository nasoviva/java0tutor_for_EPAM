package com.java0tutor.simpleClass.task4.entity;

public class Time {

	private int hour;
	private int min;

	public Time(int hour, int min) {
		super();
		if (hour >= 0 && hour < 24)
			this.hour = hour;
		else
			this.hour = 0;

		if (min >= 0 && min < 60)
			this.min = min;
		else
			this.min = 0;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour < 24)
			this.hour = hour;
		else
			this.hour = 0;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min >= 0 && min < 60)
			this.min = min;
		else
			this.min = 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hour;
		result = prime * result + min;
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
		Time other = (Time) obj;
		if (hour != other.hour)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Time [hour=" + hour + ", min=" + min + "]";
	}

}
