package com.java0tutor.class_simpleClass.task8.entity;

import java.util.Arrays;

public class ListOfCustomers {
	private int length;
	private int count;
	private Customer[] customer;

	public ListOfCustomers(int length) {
		if (length > 0) {
			customer = new Customer[length];
			count = 0;
		} else {
			customer = null;
			count = 0;
			length = 0;
		}

	}

	public void add(Customer newCustomer) {
		if (count < customer.length) {
			customer[count] = newCustomer;
			count++;
		}
	}

	public int getLength() {
		return length;
	}

	public Customer[] getCustomer() {
		return customer;
	}

	public void setCustomer(Customer[] customer) {
		this.customer = customer;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + Arrays.hashCode(customer);
		result = prime * result + length;
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
		ListOfCustomers other = (ListOfCustomers) obj;
		if (count != other.count)
			return false;
		if (!Arrays.equals(customer, other.customer))
			return false;
		if (length != other.length)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListOfCustomers [length=" + length + ", count=" + count + ", customer=" + Arrays.toString(customer)
				+ "]";
	}

}
