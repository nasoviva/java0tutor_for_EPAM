package com.java0tutor.class_simpleClass.task5;

public class DecimalCounter {
	private int count;
	private int min;
	private int max;

	public DecimalCounter() {
		count = 0;
		min = 0;
		max = 9;
	}

	public DecimalCounter(int count, int min, int max) {
		super();
		if (min < max) {
			this.min = min;
			this.max = max;
		} else {
			this.min = 0;
			this.max = 9;
		}
		if (count >= min && count <= max)
			this.count = count;
		else
			this.count = 0;
	}

	public void increaseCount() {
		if (count >= min && count < max)
			count++;
	}

	public void decreaseCount() {
		if (count > min && count <= max)
			count--;
	}

	public int currentCount() {
		return count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count >= min && count <= max)
			this.count = count;
		else
			this.count = 0;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min < max) {
			this.min = min;
		}
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		if (min < max) {
			this.max = max;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + max;
		result = prime * result + min;
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
		DecimalCounter other = (DecimalCounter) obj;
		if (count != other.count)
			return false;
		if (max != other.max)
			return false;
		if (min != other.min)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DecimalCounter [count=" + count + ", min=" + min + ", max=" + max + "]";
	}

}
