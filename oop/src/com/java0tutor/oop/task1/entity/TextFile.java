package com.java0tutor.oop.task1.entity;

public class TextFile extends File {

	private String content;
	private String resolution = ".txt";

	public TextFile() {

	}

	public TextFile(String name, String content) {
		super(name);
		this.content = content;
	}

	public void addContent(String newContent) {
		content = content + newContent;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getResolution() {
		return resolution;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((content == null) ? 0 : content.hashCode());
		result = prime * result + ((resolution == null) ? 0 : resolution.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		TextFile other = (TextFile) obj;
		if (content == null) {
			if (other.content != null)
				return false;
		} else if (!content.equals(other.content))
			return false;
		if (resolution == null) {
			if (other.resolution != null)
				return false;
		} else if (!resolution.equals(other.resolution))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TextFile [content=" + content + ", resolution=" + resolution + "]";
	}

}
