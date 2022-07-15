package com.java0tutor.final_task.task1.bean;

public class Book implements Comparable<Book> {
	private int id;
	private TypeOfBook type;
	private String title;
	private String author;
	private String description;

	public Book() {

	}

	public Book(int id, TypeOfBook type, String title, String author, String description) {
		super();
		if (id > 0 && id < Integer.MAX_VALUE)
			this.id = id;
		else
			this.id = 0;
		this.type = type;
		this.title = title;
		this.author = author;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0 && id < Integer.MAX_VALUE)
			this.id = id;
	}

	public TypeOfBook getType() {
		return type;
	}

	public void setType(TypeOfBook type) {
		this.type = type;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + id;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (id != other.id)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", type=" + type + ", title=" + title + ", author=" + author + ", description="
				+ description + "]";
	}

	@Override
	public int compareTo(Book arg0) {
		if (this.id > arg0.id)
			return 1;
		else if (this.id < arg0.id)
			return -1;
		return 0;
	}

}
