package com.java0tutor.oop.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Calendar {

	private String title;
	private List<Year> years;

	public Calendar() {
		years = new ArrayList<>();
	}

	public Calendar(String title) {
		super();
		this.title = title;
		this.years = new ArrayList<>();
	}

	public Calendar(String title, List<Year> years) {
		super();
		this.title = title;
		this.years = years;
	}

	public void addYear(Year year) {
		years.add(year);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Year> getYears() {
		return years;
	}

	public void setYears(List<Year> years) {
		this.years = years;
	}

	public class Year {

		private int year;
		private List<Month> months;

		public Year() {
			year = java.time.YearMonth.now().getYear();
			months = new ArrayList<>();
		}

		public Year(int year) {
			super();
			if (year > 0 && year < Integer.MAX_VALUE)
				this.year = year;
			else
				this.year = java.time.YearMonth.now().getYear();
			this.months = new ArrayList<>();
		}

		public Year(int year, List<Month> months) {
			super();
			if (year > 0 && year < Integer.MAX_VALUE)
				this.year = year;
			else
				this.year = java.time.YearMonth.now().getYear();
			this.months = months;
		}

		public void addMonth(Month month) {
			months.add(month);
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			if (year > 0 && year < Integer.MAX_VALUE)
				this.year = year;
		}

		public List<Month> getMonths() {
			return months;
		}

		public void setMonths(List<Month> months) {
			this.months = months;
		}

		public class Month {

			private int month;
			private List<Day> days;

			public Month() {
				month = 1;
				days = new ArrayList<>();
			}

			public Month(int month) {
				super();
				if (month > 0 && month <= 12)
					this.month = month;
				else
					this.month = 1;
				days = new ArrayList<>();
			}

			public Month(int month, List<Day> days) {
				super();
				if (month > 0 && month <= 12)
					this.month = month;
				else
					this.month = 1;
				this.days = days;
			}

			public void addDay(Day day) {
				days.add(day);
			}

			public int getMonth() {
				return month;
			}

			public void setMonth(int month) {
				if (month > 0 && month <= 12)
					this.month = month;
			}

			public List<Day> getDays() {
				return days;
			}

			public void setDays(List<Day> days) {
				this.days = days;
			}

			public class Day {

				private int day;
				private int dayOfWeek;
				private boolean weekend;
				private boolean holiday;
				private String title;

				public Day() {
					day = 1;
					weekend = false;
					holiday = false;
					dayOfWeek = 1;
				}

				public Day(int day) {
					super();
					if (day > 0 && day <= 31)
						this.day = day;
					else
						this.day = 1;
					weekend = false;
					holiday = false;
					dayOfWeek = 1;
				}

				public Day(int day, int dayOfWeek) {
					super();
					if (day > 0 && day <= 31)
						this.day = day;
					else
						this.day = 1;
					if (dayOfWeek > 0 && dayOfWeek <= 7)
						this.dayOfWeek = dayOfWeek;
					else
						this.dayOfWeek = 1;
					weekend = false;
					holiday = false;
				}

				public Day(int day, int dayOfWeek, boolean weekend, boolean holiday, String title) {
					super();
					if (day > 0 && day <= 31)
						this.day = day;
					else
						this.day = 1;
					if (dayOfWeek > 0 && dayOfWeek <= 7)
						this.dayOfWeek = dayOfWeek;
					else
						this.dayOfWeek = 1;
					this.weekend = weekend;
					this.holiday = holiday;
					this.title = title;
				}

				public int getDay() {
					return day;
				}

				public void setDay(int day) {
					if (day > 0 && day <= 31)
						this.day = day;
				}

				public int getDayOfWeek() {
					return dayOfWeek;
				}

				public void setDayOfWeek(int dayOfWeek) {
					if (dayOfWeek > 0 && dayOfWeek <= 7)
						this.dayOfWeek = dayOfWeek;
				}

				public boolean isWeekend() {
					return weekend;
				}

				public void setWeekend(boolean weekend) {
					this.weekend = weekend;
				}

				public boolean isHoliday() {
					return holiday;
				}

				public void setHoliday(boolean holiday) {
					this.holiday = holiday;
				}

				public String getTitle() {
					return title;
				}

				public void setTitle(String title) {
					this.title = title;
				}

				@Override
				public int hashCode() {
					final int prime = 31;
					int result = 1;
					result = prime * result + getEnclosingInstance().hashCode();
					result = prime * result + day;
					result = prime * result + dayOfWeek;
					result = prime * result + (holiday ? 1231 : 1237);
					result = prime * result + ((title == null) ? 0 : title.hashCode());
					result = prime * result + (weekend ? 1231 : 1237);
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
					Day other = (Day) obj;
					if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
						return false;
					if (day != other.day)
						return false;
					if (dayOfWeek != other.dayOfWeek)
						return false;
					if (holiday != other.holiday)
						return false;
					if (title == null) {
						if (other.title != null)
							return false;
					} else if (!title.equals(other.title))
						return false;
					if (weekend != other.weekend)
						return false;
					return true;
				}

				private Month getEnclosingInstance() {
					return Month.this;
				}

				@Override
				public String toString() {
					return "Day [day=" + day + ", dayOfWeek=" + dayOfWeek + ", weekend=" + weekend + ", holiday="
							+ holiday + ", title=" + title + "]";
				}

			}

			@Override
			public int hashCode() {
				final int prime = 31;
				int result = 1;
				result = prime * result + getEnclosingInstance().hashCode();
				result = prime * result + ((days == null) ? 0 : days.hashCode());
				result = prime * result + month;
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
				Month other = (Month) obj;
				if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
					return false;
				if (days == null) {
					if (other.days != null)
						return false;
				} else if (!days.equals(other.days))
					return false;
				if (month != other.month)
					return false;
				return true;
			}

			private Year getEnclosingInstance() {
				return Year.this;
			}

			@Override
			public String toString() {
				return "Month [month=" + month + ", days=" + days + "]";
			}

		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + ((months == null) ? 0 : months.hashCode());
			result = prime * result + year;
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
			Year other = (Year) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (months == null) {
				if (other.months != null)
					return false;
			} else if (!months.equals(other.months))
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "Year [year=" + year + ", months=" + months + "]";
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((years == null) ? 0 : years.hashCode());
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
		Calendar other = (Calendar) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (years == null) {
			if (other.years != null)
				return false;
		} else if (!years.equals(other.years))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [title=" + title + ", years=" + years + "]";
	}

}
