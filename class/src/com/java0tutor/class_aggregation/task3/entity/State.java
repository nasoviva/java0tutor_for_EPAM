package com.java0tutor.class_aggregation.task3.entity;

import java.util.List;

public class State {
	private String name;
	private City capital;
	private double square;
	private int numberOfResidents;
	private List<Region> regions;

	public State() {

	}

	public State(String name, City capital, double square, int numberOfResidents, List<Region> regions) {
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
		this.regions = regions;
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

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberOfResidents;
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		State other = (State) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberOfResidents != other.numberOfResidents)
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "State [name=" + name + ", capital=" + capital + ", square=" + square + ", numberOfResidents="
				+ numberOfResidents + ", regions=" + regions + "]";
	}

}
