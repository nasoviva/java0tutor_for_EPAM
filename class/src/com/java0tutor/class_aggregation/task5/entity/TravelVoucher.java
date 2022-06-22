package com.java0tutor.class_aggregation.task5.entity;

public class TravelVoucher {
	private NameOfCity nameOfCity;
	private TypeOfHotel typeOfHotel;
	private TypeOfTravel typeOfTravel;
	private TypeOfTransport typeOfTransport;
	private TypeOfFood typeOfFood;
	private NumOfDays duration;
	private double price;

	public TravelVoucher() {

	}

	public TravelVoucher(NameOfCity nameOfCity, TypeOfHotel typeOfHotel, TypeOfTravel typeOfTravel,
			TypeOfTransport typeOfTransport, TypeOfFood typeOfFood, NumOfDays duration, double price) {
		super();
		this.nameOfCity = nameOfCity;
		this.typeOfHotel = typeOfHotel;
		this.typeOfTravel = typeOfTravel;
		this.typeOfTransport = typeOfTransport;
		this.typeOfFood = typeOfFood;
		this.duration = duration;
		if (price > 0 && price < Double.MAX_VALUE)
			this.price = price;
		else
			this.price = 0;
	}

	public NameOfCity getNameOfCity() {
		return nameOfCity;
	}

	public void setNameOfCity(NameOfCity nameOfCity) {
		this.nameOfCity = nameOfCity;
	}

	public TypeOfHotel getTypeOfHotel() {
		return typeOfHotel;
	}

	public void setTypeOfHotel(TypeOfHotel typeOfHotel) {
		this.typeOfHotel = typeOfHotel;
	}

	public TypeOfTravel getTypeOfTravel() {
		return typeOfTravel;
	}

	public void setTypeOfTravel(TypeOfTravel typeOfTravel) {
		this.typeOfTravel = typeOfTravel;
	}

	public TypeOfTransport getTypeOfTransport() {
		return typeOfTransport;
	}

	public void setTypeOfTransport(TypeOfTransport typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}

	public TypeOfFood getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(TypeOfFood typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public NumOfDays getDuration() {
		return duration;
	}

	public void setDuration(NumOfDays duration) {
		this.duration = duration;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0 && price < Double.MAX_VALUE)
			this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((duration == null) ? 0 : duration.hashCode());
		result = prime * result + ((nameOfCity == null) ? 0 : nameOfCity.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((typeOfFood == null) ? 0 : typeOfFood.hashCode());
		result = prime * result + ((typeOfHotel == null) ? 0 : typeOfHotel.hashCode());
		result = prime * result + ((typeOfTransport == null) ? 0 : typeOfTransport.hashCode());
		result = prime * result + ((typeOfTravel == null) ? 0 : typeOfTravel.hashCode());
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
		TravelVoucher other = (TravelVoucher) obj;
		if (duration != other.duration)
			return false;
		if (nameOfCity != other.nameOfCity)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (typeOfFood != other.typeOfFood)
			return false;
		if (typeOfHotel != other.typeOfHotel)
			return false;
		if (typeOfTransport != other.typeOfTransport)
			return false;
		if (typeOfTravel != other.typeOfTravel)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TravelVoucher [nameOfCity=" + nameOfCity + ", typeOfHotel=" + typeOfHotel + ", typeOfTravel="
				+ typeOfTravel + ", typeOfTransport=" + typeOfTransport + ", typeOfFood=" + typeOfFood + ", duration="
				+ duration + ", price=" + price + "]";
	}

}
