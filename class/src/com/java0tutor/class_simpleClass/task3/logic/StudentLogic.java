package com.java0tutor.class_simpleClass.task3.logic;

import com.java0tutor.class_simpleClass.task3.entity.Student;

public class StudentLogic {

	public boolean listOfBestStudents(Student student) {
		for (int i = 0; i < student.getRating().length; i++) {
			if (student.getRating()[i] != 9 && student.getRating()[i] != 10)
				return false;
		}
		return true;
	}

}
