package com.java0tutor.class_aggregation.task4.entity;

public class Passport {
	private String series;
	private String number;
	private int lengthSeries = 4;
	private int lengthNumber = 6;
	private Date dateOfIssue;
	private String issuingAuthority;

	public Passport() {

	}

	public Passport(String series, String number, Date dateOfIssue, String issuingAuthority) {
		super();
		if (series.length() == lengthSeries) {
			for (int i = 0; i < series.length(); i++) {
				if (series.charAt(i) < '0' || series.charAt(i) > '9')
					this.series = null;
			}
			this.series = series;
		} else
			this.series = null;
		if (number.length() == lengthNumber) {
			for (int i = 0; i < number.length(); i++) {
				if (number.charAt(i) < '0' || number.charAt(i) > '9')
					this.number = null;
			}
			this.number = number;
		} else
			this.number = null;
		this.dateOfIssue = dateOfIssue;
		this.issuingAuthority = issuingAuthority;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		if (series.length() == lengthSeries) {
			for (int i = 0; i < series.length(); i++) {
				if (series.charAt(i) < '0' || series.charAt(i) > '9')
					this.series = null;
			}
			this.series = series;
		}
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		if (number.length() == lengthNumber) {
			for (int i = 0; i < number.length(); i++) {
				if (number.charAt(i) < '0' || number.charAt(i) > '9')
					this.number = null;
			}
			this.number = number;
		}
	}

	public int getLengthSeries() {
		return lengthSeries;
	}

	public int getLengthNumber() {
		return lengthNumber;
	}

	public Date getDateOfIssue() {
		return dateOfIssue;
	}

	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dateOfIssue == null) ? 0 : dateOfIssue.hashCode());
		result = prime * result + ((issuingAuthority == null) ? 0 : issuingAuthority.hashCode());
		result = prime * result + lengthNumber;
		result = prime * result + lengthSeries;
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		result = prime * result + ((series == null) ? 0 : series.hashCode());
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
		Passport other = (Passport) obj;
		if (dateOfIssue == null) {
			if (other.dateOfIssue != null)
				return false;
		} else if (!dateOfIssue.equals(other.dateOfIssue))
			return false;
		if (issuingAuthority == null) {
			if (other.issuingAuthority != null)
				return false;
		} else if (!issuingAuthority.equals(other.issuingAuthority))
			return false;
		if (lengthNumber != other.lengthNumber)
			return false;
		if (lengthSeries != other.lengthSeries)
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		if (series == null) {
			if (other.series != null)
				return false;
		} else if (!series.equals(other.series))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Passport [series=" + series + ", number=" + number + ", lengthSeries=" + lengthSeries
				+ ", lengthNumber=" + lengthNumber + ", dateOfIssue=" + dateOfIssue + ", issuingAuthority="
				+ issuingAuthority + "]";
	}

}
