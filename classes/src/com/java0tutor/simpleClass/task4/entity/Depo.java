package com.java0tutor.simpleClass.task4.entity;

import java.util.Arrays;

public class Depo {

	private Train[] train;
	private int length;
	private int count;

	public Depo(int length) {
		if (length > 0) {
			train = new Train[length];
			count = 0;
		} else {
			train = null;
			count = 0;
			length = 0;
		}
	}

	public void add(Train train_new) {
		if (count < train.length) {
			train[count] = train_new;
			count++;
		}
	}

	public int getLength() {
		return length;
	}

	public Train[] getTrain() {
		return train;
	}

	public void setTrain(Train[] train) {
		this.train = train;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + length;
		result = prime * result + Arrays.hashCode(train);
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
		Depo other = (Depo) obj;
		if (count != other.count)
			return false;
		if (length != other.length)
			return false;
		if (!Arrays.equals(train, other.train))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Depo [train=" + Arrays.toString(train) + ", length=" + length + ", count=" + count + "]";
	}

}
