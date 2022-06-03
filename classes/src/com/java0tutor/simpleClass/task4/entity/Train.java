package com.java0tutor.simpleClass.task4.entity;

public class Train {

	private String destination;
	private int numOfTrain;
	private Time timeOfDeparture;

	public Train() {
	}

	public Train(String destination, int numOfTrain, Time timeOfDeparture) {
		super();
		this.destination = destination;
		if (numOfTrain >= 0)
			this.numOfTrain = numOfTrain;
		else
			this.numOfTrain = 0;
		this.timeOfDeparture = timeOfDeparture;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumOfTrain() {
		return numOfTrain;
	}

	public void setNumOfTrain(int numOfTrain) {
		if (numOfTrain >= 0)
			this.numOfTrain = numOfTrain;
		else
			this.numOfTrain = 0;
	}

	public Time getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(Time timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + numOfTrain;
		result = prime * result + ((timeOfDeparture == null) ? 0 : timeOfDeparture.hashCode());
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
		Train other = (Train) obj;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (numOfTrain != other.numOfTrain)
			return false;
		if (timeOfDeparture == null) {
			if (other.timeOfDeparture != null)
				return false;
		} else if (!timeOfDeparture.equals(other.timeOfDeparture))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destination=" + destination + ", numOfTrain=" + numOfTrain + ", timeOfDeparture="
				+ timeOfDeparture + "]";
	}

}
