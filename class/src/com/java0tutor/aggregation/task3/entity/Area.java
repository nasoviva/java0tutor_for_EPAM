package com.java0tutor.aggregation.task3.entity;

public class Area {
	private String name;
	private double square;
	private int numberOfResidents;

	public Area() {

	}

	public Area(String name, double square, int numberOfResidents) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		Area other = (Area) obj;
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
		return "Area [name=" + name + ", square=" + square + ", numberOfResidents=" + numberOfResidents + "]";
	}

}
