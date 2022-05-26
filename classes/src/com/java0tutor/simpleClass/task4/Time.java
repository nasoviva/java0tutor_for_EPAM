package com.java0tutor.simpleClass.task4;

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

}
