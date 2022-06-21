package com.java0tutor.simpleClass.task10.entity;

public class Airline {
	private String destination;
	private String numOfFlight;
	private AirType typeOfAirline;
	private Time timeOfDeparture;
	private Week dayOfWeek;

	public Airline() {
	}

	public Airline(String destination, String numOfFlight, AirType typeOfAirline, Time timeOfDeparture,
			Week dayOfWeek) {
		super();
		this.destination = destination;
		this.numOfFlight = numOfFlight;
		this.typeOfAirline = typeOfAirline;
		this.timeOfDeparture = timeOfDeparture;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getNumOfFlight() {
		return numOfFlight;
	}

	public void setNumOfFlight(String numOfFlight) {
		this.numOfFlight = numOfFlight;
	}

	public AirType getTypeOfAirline() {
		return typeOfAirline;
	}

	public void setTypeOfAirline(AirType typeOfAirline) {
		this.typeOfAirline = typeOfAirline;
	}

	public Time getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(Time timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	public Week getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(Week dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dayOfWeek == null) ? 0 : dayOfWeek.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((numOfFlight == null) ? 0 : numOfFlight.hashCode());
		result = prime * result + ((timeOfDeparture == null) ? 0 : timeOfDeparture.hashCode());
		result = prime * result + ((typeOfAirline == null) ? 0 : typeOfAirline.hashCode());
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
		Airline other = (Airline) obj;
		if (dayOfWeek != other.dayOfWeek)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numOfFlight == null) {
			if (other.numOfFlight != null)
				return false;
		} else if (!numOfFlight.equals(other.numOfFlight))
			return false;
		if (timeOfDeparture == null) {
			if (other.timeOfDeparture != null)
				return false;
		} else if (!timeOfDeparture.equals(other.timeOfDeparture))
			return false;
		if (typeOfAirline != other.typeOfAirline)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [destination=" + destination + ", numOfFlight=" + numOfFlight + ", typeOfAirline="
				+ typeOfAirline + ", timeOfDeparture=" + timeOfDeparture + ", dayOfWeek=" + dayOfWeek + "]";
	}

}
