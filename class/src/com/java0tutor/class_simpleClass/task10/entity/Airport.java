package com.java0tutor.class_simpleClass.task10.entity;

import java.util.ArrayList;

public class Airport {
	private ArrayList<Airline> airline;

	public Airport() {
		airline = new ArrayList<>();

	}

	public Airport(ArrayList<Airline> airline) {
		super();
		this.airline = airline;
	}

	public void addAirline(Airline newAirline) {
		airline.add(newAirline);
	}

	public ArrayList<Airline> getAirline() {
		return airline;
	}

	public void setAirline(ArrayList<Airline> airline) {
		this.airline = airline;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airline == null) ? 0 : airline.hashCode());
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
		Airport other = (Airport) obj;
		if (airline == null) {
			if (other.airline != null)
				return false;
		} else if (!airline.equals(other.airline))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airport [airline=" + airline + "]";
	}

}
