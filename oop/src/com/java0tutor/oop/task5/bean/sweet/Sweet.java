package com.java0tutor.oop.task5.bean.sweet;

import com.java0tutor.oop.task5.exception.GiftException;

public class Sweet {

	private SweetType type;
	private double price;

	public Sweet() {

	}

	public Sweet(SweetType type) {
		super();
		this.type = type;
		this.price = type.getSweetPrice();
	}

	public Sweet(String sweetType) throws GiftException {
		try {
			this.type = SweetType.valueOf(sweetType.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new GiftException("нет таких сладостей");
		}
	}

	public SweetType getType() {
		return type;
	}

	public void setType(SweetType type) {
		this.type = type;
		this.price = type.getSweetPrice();
	}

	public double getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Sweet other = (Sweet) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sweet [type=" + type + ", price=" + price + "]";
	}

}
