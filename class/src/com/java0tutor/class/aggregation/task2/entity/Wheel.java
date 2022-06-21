package com.java0tutor.aggregation.task2.entity;

public class Wheel {

	private double diameter;
	private double widthOfTire;
	private Season season;

	public Wheel() {

	}

	public Wheel(double diameter, double widthOfTire, Season season) {
		super();
		if (diameter > 0)
			this.diameter = diameter;
		else
			this.diameter = 0;
		if (widthOfTire > 0)
			this.widthOfTire = widthOfTire;
		else
			this.widthOfTire = 0;
		this.season = season;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		if (diameter > 0)
			this.diameter = diameter;
	}

	public double getWidthOfTire() {
		return widthOfTire;
	}

	public void setWidthOfTire(double widthOfTire) {
		if (widthOfTire > 0)
			this.widthOfTire = widthOfTire;
	}

	public Season getSeason() {
		return season;
	}

	public void setSeason(Season season) {
		this.season = season;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(diameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((season == null) ? 0 : season.hashCode());
		temp = Double.doubleToLongBits(widthOfTire);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Wheel other = (Wheel) obj;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		if (season != other.season)
			return false;
		if (Double.doubleToLongBits(widthOfTire) != Double.doubleToLongBits(other.widthOfTire))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wheel [diameter=" + diameter + ", widthOfTire=" + widthOfTire + ", season=" + season + "]";
	}

}
