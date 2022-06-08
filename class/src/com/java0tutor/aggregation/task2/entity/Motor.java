package com.java0tutor.aggregation.task2.entity;

public class Motor {

	private MotorType typeOfMotor;
	private int numberOfCylinders;
	private double capacity;

	public Motor() {

	}

	public Motor(MotorType typeOfMotor, int numberOfCylinders, double capacity) {
		super();
		this.typeOfMotor = typeOfMotor;
		if (numberOfCylinders > 0)
			this.numberOfCylinders = numberOfCylinders;
		else
			this.numberOfCylinders = 0;
		if (capacity > 0)
			this.capacity = capacity;
		else
			this.capacity = 0;
	}

	public MotorType getTypeOfMotor() {
		return typeOfMotor;
	}

	public void setTypeOfMotor(MotorType typeOfMotor) {
		this.typeOfMotor = typeOfMotor;
	}

	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}

	public void setNumberOfCylinders(int numberOfCylinders) {
		if (numberOfCylinders > 0)
			this.numberOfCylinders = numberOfCylinders;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		if (capacity > 0)
			this.capacity = capacity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(capacity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numberOfCylinders;
		result = prime * result + ((typeOfMotor == null) ? 0 : typeOfMotor.hashCode());
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
		Motor other = (Motor) obj;
		if (Double.doubleToLongBits(capacity) != Double.doubleToLongBits(other.capacity))
			return false;
		if (numberOfCylinders != other.numberOfCylinders)
			return false;
		if (typeOfMotor != other.typeOfMotor)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Motor [typeOfMotor=" + typeOfMotor + ", numberOfCylinders=" + numberOfCylinders + ", capacity="
				+ capacity + "]";
	}

}
