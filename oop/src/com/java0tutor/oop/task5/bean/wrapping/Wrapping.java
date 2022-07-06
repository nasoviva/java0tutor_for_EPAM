package com.java0tutor.oop.task5.bean.wrapping;

public class Wrapping {

	private WrappingType type;
	private double price;

	public Wrapping() {

	}

	public Wrapping(WrappingType type) {
		super();
		this.type = type;
		this.price = type.getWrappingPrice();
	}

	public WrappingType getType() {
		return type;
	}

	public void setType(WrappingType type) {
		this.type = type;
		this.price = type.getWrappingPrice();
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
		Wrapping other = (Wrapping) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Wrapping [type=" + type + ", price=" + price + "]";
	}

}
