package com.java0tutor.simpleClass.task3.entity;

import java.util.Arrays;

public class Student {
	private String surnameAndInitials;
	private int groupNumber;
	private int[] rating = new int[5];

	public Student() {

	}

	public Student(String surnameAndInitials, int groupNumber, int[] rating) {
		super();
		this.surnameAndInitials = surnameAndInitials;
		if (groupNumber > 0 && groupNumber < Integer.MAX_VALUE)
			this.groupNumber = groupNumber;
		else
			this.groupNumber = 1;
		this.rating = rating;
	}

	public String getSurnameAndInitials() {
		return surnameAndInitials;
	}

	public void setSurnameAndInitials(String surnameAndInitials) {
		this.surnameAndInitials = surnameAndInitials;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		if (groupNumber > 0 && groupNumber < Integer.MAX_VALUE)
			this.groupNumber = groupNumber;
		else
			this.groupNumber = 1;
	}

	public int[] getRating() {
		return rating;
	}

	public void setRating(int[] rating) {
		this.rating = rating;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + groupNumber;
		result = prime * result + Arrays.hashCode(rating);
		result = prime * result + ((surnameAndInitials == null) ? 0 : surnameAndInitials.hashCode());
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
		Student other = (Student) obj;
		if (groupNumber != other.groupNumber)
			return false;
		if (!Arrays.equals(rating, other.rating))
			return false;
		if (surnameAndInitials == null) {
			if (other.surnameAndInitials != null)
				return false;
		} else if (!surnameAndInitials.equals(other.surnameAndInitials))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [surnameAndInitials=" + surnameAndInitials + ", groupNumber=" + groupNumber + ", rating="
				+ Arrays.toString(rating) + "]";
	}

}
