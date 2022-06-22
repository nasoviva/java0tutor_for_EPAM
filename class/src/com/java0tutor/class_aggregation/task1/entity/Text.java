package com.java0tutor.class_aggregation.task1.entity;

import java.util.ArrayList;
import java.util.List;

public class Text {
	private List<Sentence> text;
	private String header;

	public Text() {
		text = new ArrayList<Sentence>();
	}

	public Text(List<Sentence> text, String header) {
		super();
		this.text = text;
		this.header = header;
	}

	public void addText(Sentence newtext) {
		text.add(newtext);

	}

	public List<Sentence> getText() {
		return text;
	}

	public void setText(List<Sentence> text) {
		this.text = text;
	}

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((header == null) ? 0 : header.hashCode());
		result = prime * result + ((text == null) ? 0 : text.hashCode());
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
		Text other = (Text) obj;
		if (header == null) {
			if (other.header != null)
				return false;
		} else if (!header.equals(other.header))
			return false;
		if (text == null) {
			if (other.text != null)
				return false;
		} else if (!text.equals(other.text))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Text [text=" + text + ", header=" + header + "]";
	}

}
