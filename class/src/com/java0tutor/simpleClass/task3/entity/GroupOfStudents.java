package com.java0tutor.simpleClass.task3.entity;

import java.util.Arrays;

public class GroupOfStudents {

	private Student[] students;
	private int groupSize;
	private int count;

	public GroupOfStudents(int groupSize) {
		students = new Student[groupSize];
		count = 0;
	}

	public void addStudent(Student newStudent) {
		if (count < students.length) {
			students[count] = newStudent;
			count++;
		}
	}

	public Student[] getStudents() {
		return students;
	}

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public int getGroupSize() {
		return groupSize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + groupSize;
		result = prime * result + Arrays.hashCode(students);
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
		GroupOfStudents other = (GroupOfStudents) obj;
		if (count != other.count)
			return false;
		if (groupSize != other.groupSize)
			return false;
		if (!Arrays.equals(students, other.students))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "GroupOfStudents [students=" + Arrays.toString(students) + ", groupSize=" + groupSize + ", count="
				+ count + "]";
	}

}
