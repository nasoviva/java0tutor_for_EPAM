package com.java0tutor.class_aggregation.task3.entity;

import java.util.List;

public class City {
	private String name;
	private double square;
	private int numberOfResidents;
	private List<Area> areas;

	public City() {

	}

	public City(String name, double square, int numberOfResidents, List<Area> areas) {
		super();
		this.name = name;
		if (square > 0 && square < 510100000)
			this.square = square;
		else
			this.square = 0;
		if (numberOfResidents > 0 && numberOfResidents < Integer.MAX_VALUE)
			this.numberOfResidents = numberOfResidents;
		else
			this.numberOfResidents = 0;
		this.areas = areas;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((areas == null) ? 0 : areas.hashCode());
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
		City other = (City) obj;
		if (areas == null) {
			if (other.areas != null)
				return false;
		} else if (!areas.equals(other.areas))
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
		return "City [name=" + name + ", square=" + square + ", numberOfResidents=" + numberOfResidents + ", areas="
				+ areas + "]";
	}

}
