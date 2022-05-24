package com.java0tutor.simpleClass.task3;

public class Main {

	public static void main(String[] args) {
		Student s = new Student();
		Student[] student = new Student[10];
		int[] rating;
		int group;

		// заполняем массив студентов
		for (int i = 0; i < student.length; i++) {
			rating = new int[s.getGradeSystem()];
			group = (int) (Math.random() * (3) + 1);
			for (int j = 0; j < rating.length; j++) {
				rating[j] = (int) (Math.random() * (3) + 8);
			}
			student[i] = new Student("Иванов И.И.", group, rating);
		}

		// выводим содержимое на печать
		System.out.println("Список студентов:");
		for (int i = 0; i < student.length; i++) {
			System.out.print("студент[" + i + "] = " + student[i].getSurnameAndInitials() + ", группа: "
					+ student[i].getGroupNumber() + ", оценки: ");
			for (int j = 0; j < student[i].getRating().length; j++) {
				System.out.print(student[i].getRating()[j] + " ");
			}
			System.out.println();
		}

		// выводим студентов с оценками 9 и 10
		System.out.println("\nСписок лучших студентов:");
		for (int i = 0; i < student.length; i++) {
			student[i].listOfBestStudents();
		}
	}

}
