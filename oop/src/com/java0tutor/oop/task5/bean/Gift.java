package com.java0tutor.oop.task5.bean;

import com.java0tutor.oop.task5.bean.sweet.Sweet;
import com.java0tutor.oop.task5.bean.wrapping.Wrapping;

public class Gift {

	private Sweet sweet;
	private Wrapping wrapping;

	public Gift() {
		sweet = new Sweet();
		wrapping = new Wrapping();
	}

	public Gift(Sweet sweet, Wrapping wrapping) {
		super();
		this.sweet = sweet;
		this.wrapping = wrapping;
	}

	public Sweet getSweet() {
		return sweet;
	}

	public void setSweet(Sweet sweet) {
		this.sweet = sweet;
	}

	public Wrapping getWrapping() {
		return wrapping;
	}

	public void setWrapping(Wrapping wrapping) {
		this.wrapping = wrapping;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sweet == null) ? 0 : sweet.hashCode());
		result = prime * result + ((wrapping == null) ? 0 : wrapping.hashCode());
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
		Gift other = (Gift) obj;
		if (sweet == null) {
			if (other.sweet != null)
				return false;
		} else if (!sweet.equals(other.sweet))
			return false;
		if (wrapping == null) {
			if (other.wrapping != null)
				return false;
		} else if (!wrapping.equals(other.wrapping))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Gift [sweet=" + sweet + ", wrapping=" + wrapping + "]";
	}

}
