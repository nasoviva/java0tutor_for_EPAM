package com.java0tutor.class_aggregation.task2.entity;

import java.util.Arrays;
import java.util.Calendar;

public class Car {

	private Wheel[] wheels;
	private Motor motor;
	private String model;
	private int yearOfIssue;
	private double weight;
	private double fuelQuantity;
	private double mileage;
	private CarBoby typeOfcarBody;
	private boolean brake;

	public Car() {

	}

	public Car(Wheel[] wheels, Motor motor, String model, int yearOfIssue, double weight, double fuelQuantity,
			double mileage, CarBoby typeOfcarBody, boolean brake) {
		super();
		this.wheels = wheels;
		this.motor = motor;
		this.model = model;
		if (yearOfIssue > 0 && yearOfIssue < Calendar.getInstance().get(Calendar.YEAR))
			this.yearOfIssue = yearOfIssue;
		else
			this.yearOfIssue = 0;
		if (weight > 0 && weight < Double.MAX_VALUE)
			this.weight = weight;
		else
			this.weight = 0;
		if (fuelQuantity > 0 && fuelQuantity < Double.MAX_VALUE)
			this.fuelQuantity = fuelQuantity;
		else
			this.fuelQuantity = 0;
		if (mileage > 0 && mileage < Double.MAX_VALUE)
			this.mileage = mileage;
		else
			this.mileage = 0;
		this.typeOfcarBody = typeOfcarBody;
		this.brake = brake;
	}

	public void driveCar(double mile) {
		brake = true;
		while (fuelQuantity > 0 && mile > 0) {
			fuelQuantity = fuelQuantity - 0.05;
			mileage++;
			mile--;
		}
		if (fuelQuantity < 0)
			fuelQuantity = 0;
	}

	public void refuelCar(double quantity) {
		fuelQuantity = fuelQuantity + quantity;
	}

	public void changeWheel(Wheel wheel, double diameter, double widthOfTire, Season season) {
		wheel.setDiameter(diameter);
		wheel.setWidthOfTire(widthOfTire);
		wheel.setSeason(season);
	}

	public Wheel[] getWheels() {
		return wheels;
	}

	public void setWheels(Wheel[] wheels) {
		this.wheels = wheels;
	}

	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfIssue() {
		return yearOfIssue;
	}

	public void setYearOfIssue(int yearOfIssue) {
		if (yearOfIssue > 0 && yearOfIssue < Calendar.getInstance().get(Calendar.YEAR))
			this.yearOfIssue = yearOfIssue;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		if (weight > 0 && weight < Double.MAX_VALUE)
			this.weight = weight;
	}

	public double getFuelQuantity() {
		return fuelQuantity;
	}

	public void setFuelQuantity(double fuelQuantity) {
		if (fuelQuantity > 0 && fuelQuantity < Double.MAX_VALUE)
			this.fuelQuantity = fuelQuantity;
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		if (mileage > 0 && mileage < Double.MAX_VALUE)
			this.mileage = mileage;
	}

	public CarBoby getTypeOfcarBody() {
		return typeOfcarBody;
	}

	public void setTypeOfcarBody(CarBoby typeOfcarBody) {
		this.typeOfcarBody = typeOfcarBody;
	}

	public boolean isBrake() {
		return brake;
	}

	public void setBrake(boolean brake) {
		this.brake = brake;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (brake ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(fuelQuantity);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(mileage);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		result = prime * result + ((typeOfcarBody == null) ? 0 : typeOfcarBody.hashCode());
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + Arrays.hashCode(wheels);
		result = prime * result + yearOfIssue;
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
		Car other = (Car) obj;
		if (brake != other.brake)
			return false;
		if (Double.doubleToLongBits(fuelQuantity) != Double.doubleToLongBits(other.fuelQuantity))
			return false;
		if (Double.doubleToLongBits(mileage) != Double.doubleToLongBits(other.mileage))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (motor == null) {
			if (other.motor != null)
				return false;
		} else if (!motor.equals(other.motor))
			return false;
		if (typeOfcarBody != other.typeOfcarBody)
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		if (!Arrays.equals(wheels, other.wheels))
			return false;
		if (yearOfIssue != other.yearOfIssue)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [wheels=" + Arrays.toString(wheels) + ", motor=" + motor + ", model=" + model + ", yearOfIssue="
				+ yearOfIssue + ", weight=" + weight + ", fuelQuantity=" + fuelQuantity + ", mileage=" + mileage
				+ ", typeOfcarBody=" + typeOfcarBody + ", brake=" + brake + "]";
	}

}
