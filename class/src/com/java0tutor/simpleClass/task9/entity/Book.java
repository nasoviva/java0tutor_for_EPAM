package com.java0tutor.simpleClass.task9.entity;

import java.util.Calendar;

public class Book {

	private int id;
	private String title;
	private String author;
	private String publishingHouse;
	private int yearOfPublishing;
	private int numberOfPages;
	private double price;
	private TypeOfCover coverType;

	public Book() {

	}

	public Book(int id, String title, String author, String publishingHouse, int yearOfPublishing, int numberOfPages,
			double price, TypeOfCover coverType) {
		super();
		if (id > 0 && id < Integer.MAX_VALUE)
			this.id = id;
		else
			this.id = 0;
		this.title = title;
		this.author = author;
		this.publishingHouse = publishingHouse;
		if (yearOfPublishing > 0 && yearOfPublishing < Calendar.getInstance().get(Calendar.YEAR))
			this.yearOfPublishing = yearOfPublishing;
		else
			this.yearOfPublishing = 0;
		if (numberOfPages > 0 && id < Integer.MAX_VALUE)
			this.numberOfPages = numberOfPages;
		else
			this.numberOfPages = 0;
		if (price > 0 && price < Double.MAX_VALUE)
			this.price = price;
		else
			this.price = 0;
		this.coverType = coverType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0 && id < Integer.MAX_VALUE)
			this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishingHouse() {
		return publishingHouse;
	}

	public void setPublishingHouse(String publishingHouse) {
		this.publishingHouse = publishingHouse;
	}

	public int getYearOfPublishing() {
		return yearOfPublishing;
	}

	public void setYearOfPublishing(int yearOfPublishing) {
		if (yearOfPublishing > 0 && yearOfPublishing < Calendar.getInstance().get(Calendar.YEAR))
			this.yearOfPublishing = yearOfPublishing;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		if (numberOfPages > 0 && id < Integer.MAX_VALUE)
			this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0 && price < Double.MAX_VALUE)
			this.price = price;
	}

	public TypeOfCover getCoverType() {
		return coverType;
	}

	public void setCoverType(TypeOfCover coverType) {
		this.coverType = coverType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((coverType == null) ? 0 : coverType.hashCode());
		result = prime * result + id;
		result = prime * result + numberOfPages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((publishingHouse == null) ? 0 : publishingHouse.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + yearOfPublishing;
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (coverType != other.coverType)
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publishingHouse == null) {
			if (other.publishingHouse != null)
				return false;
		} else if (!publishingHouse.equals(other.publishingHouse))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (yearOfPublishing != other.yearOfPublishing)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", publishingHouse=" + publishingHouse
				+ ", yearOfPublishing=" + yearOfPublishing + ", numberOfPages=" + numberOfPages + ", price=" + price
				+ ", coverType=" + coverType + "]";
	}

}
