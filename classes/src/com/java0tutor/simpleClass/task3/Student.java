package com.java0tutor.simpleClass.task3;

// Programming with classes. Простейшие классы и объекты. Задание 3:
// Создайте класс с именем Student, содержащий поля: 
// фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
// Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
// номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Student {
	private String surnameAndInitials;
	private int groupNumber;
	private int gradeSystem;
	private int[] rating = new int[gradeSystem];

	public void listOfBestStudents() {
		for (int i = 0; i < rating.length; i++) {
			if (rating[i] != 9 && rating[i] != 10)
				return;
		}
		System.out.println(surnameAndInitials + ", группа " + groupNumber);
	}

	public Student() {
		gradeSystem = 5;
	}

	public Student(String surnameAndInitials, int groupNumber, int[] rating) {
		super();
		this.surnameAndInitials = surnameAndInitials;
		this.groupNumber = groupNumber;
		this.rating = rating;
	}

	public String getSurnameAndInitials() {
		return surnameAndInitials;
	}

	public void setSurnameAndInitials(String surnameAndInitials) {
		this.surnameAndInitials = surnameAndInitials;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public int[] getRating() {
		return rating;
	}

	public void setRating(int[] rating) {
		this.rating = rating;
	}

	public int getGradeSystem() {
		return gradeSystem;
	}

}
