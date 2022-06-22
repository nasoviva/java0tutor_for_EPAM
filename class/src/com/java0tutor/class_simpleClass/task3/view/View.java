package com.java0tutor.class_simpleClass.task3.view;

import com.java0tutor.class_simpleClass.task3.entity.GroupOfStudents;
import com.java0tutor.class_simpleClass.task3.logic.StudentLogic;

public class View {

	public void printAllStudents(GroupOfStudents student) {
		System.out.println("Список студентов:");
		for (int i = 0; i < student.getStudents().length; i++) {
			System.out.print("студент[" + i + "] = " + student.getStudents()[i].getSurnameAndInitials() + ", группа: "
					+ student.getStudents()[i].getGroupNumber() + ", оценки: ");
			for (int j = 0; j < student.getStudents()[i].getRating().length; j++) {
				System.out.print(student.getStudents()[i].getRating()[j] + " ");
			}
			System.out.println();
		}
	}

	public void printBestStudents(GroupOfStudents student) {
		StudentLogic students = new StudentLogic();
		System.out.println("\nСписок лучших студентов:");
		for (int i = 0; i < student.getStudents().length; i++) {
			if (students.listOfBestStudents(student.getStudents()[i]) == true) {
				System.out.println(student.getStudents()[i].getSurnameAndInitials() + ", группа "
						+ student.getStudents()[i].getGroupNumber());
			}
		}

	}

}
