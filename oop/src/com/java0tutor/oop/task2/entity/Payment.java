package com.java0tutor.oop.task2.entity;

import java.util.ArrayList;
import java.util.List;

public class Payment {
	private List<Product> listOfProducts;

	public Payment() {
		listOfProducts = new ArrayList<>();
	}

	public Payment(List<Product> listOfProducts) {
		super();
		this.listOfProducts = listOfProducts;
	}

	public void addProduct(String title, double price) {
		Product product = new Product(title, price);
		listOfProducts.add(product);
	}

	public void deleteProduct(String title) {
		for (int i = 0; i < listOfProducts.size(); i++) {
			if (listOfProducts.get(i).getTitle().equals(title)) {
				listOfProducts.remove(i);
			}
		}
	}

	public List<Product> getListOfProducts() {
		return listOfProducts;
	}

	public void setListOfProducts(List<Product> listOfProducts) {
		this.listOfProducts = listOfProducts;
	}

	public class Product {
		private String title;
		private double price;

		public Product() {
		}

		public Product(String title, double price) {
			super();
			this.title = title;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			long temp;
			temp = Double.doubleToLongBits(price);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((title == null) ? 0 : title.hashCode());
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
			Product other = (Product) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Product [title=" + title + ", price=" + price + "]";
		}

		private Payment getEnclosingInstance() {
			return Payment.this;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((listOfProducts == null) ? 0 : listOfProducts.hashCode());
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
		Payment other = (Payment) obj;
		if (listOfProducts == null) {
			if (other.listOfProducts != null)
				return false;
		} else if (!listOfProducts.equals(other.listOfProducts))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [listOfProducts=" + listOfProducts + "]";
	}

}
