package com.java0tutor.aggregation.task3.entity;

import java.util.List;

public class Region {
	private String name;
	private City capital;
	private double square;
	private int numberOfResidents;
	private List<City> cities;

	public Region() {

	}

	public Region(String name, City capital, double square, int numberOfResidents, List<City> cities) {
		super();
		this.name = name;
		this.capital = capital;
		if (square > 0 && square < 510100000)
			this.square = square;
		else
			this.square = 0;
		if (numberOfResidents > 0 && numberOfResidents < Integer.MAX_VALUE)
			this.numberOfResidents = numberOfResidents;
		else
			this.numberOfResidents = 0;
		this.cities = cities;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public void setCapital(City capital) {
		this.capital = capital;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		if (square > 0 && square < 510100000)
			this.square = square;
	}

	public int getNumberOfResidents() {
		return numberOfResidents;
	}

	public void setNumberOfResidents(int numberOfResidents) {
		if (numberOfResidents > 0 && numberOfResidents < Integer.MAX_VALUE)
			this.numberOfResidents = numberOfResidents;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfResidents;
		long temp;
		temp = Double.doubleToLongBits(square);
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
		Region other = (Region) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfResidents != other.numberOfResidents)
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", capital=" + capital + ", square=" + square + ", numberOfResidents="
				+ numberOfResidents + ", cities=" + cities + "]";
	}

}
