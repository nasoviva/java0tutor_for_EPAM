package com.java0tutor.simpleClass.task3;

//Programming with classes. Простейшие классы и объекты. Задание 3:
//Создайте класс с именем Student, содержащий поля: 
//фамилия и инициалы, номер группы, успеваемость (массив из пяти элементов). 
//Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
//номеров групп студентов, имеющих оценки, равные только 9 или 10.

import com.java0tutor.simpleClass.task3.entity.GroupOfStudents;
import com.java0tutor.simpleClass.task3.entity.Student;
import com.java0tutor.simpleClass.task3.view.View;

public class Main {

	public static void main(String[] args) {
		GroupOfStudents student = new GroupOfStudents(10);
		View view = new View();

		student.addStudent(new Student("Иванов", 2, new int[] { 10, 10, 8, 10, 8 }));
		student.addStudent(new Student("Петров", 3, new int[] { 9, 10, 8, 10, 8 }));
		student.addStudent(new Student("Александров", 4, new int[] { 8, 9, 8, 8, 9 }));
		student.addStudent(new Student("Бабанов", 1, new int[] { 10, 10, 8, 10, 8 }));
		student.addStudent(new Student("Каков", 1, new int[] { 9, 9, 9, 10, 10 }));
		student.addStudent(new Student("Приветов", 2, new int[] { 9, 8, 9, 8, 9 }));
		student.addStudent(new Student("Ивкин", 5, new int[] { 9, 10, 8, 10 }));
		student.addStudent(new Student("Федоров", 2, new int[] { 9, 10, 9, 10, 9 }));
		student.addStudent(new Student("Калин", 3, new int[] { 10, 10, 9, 10, 7 }));
		student.addStudent(new Student("Бойцов", 4, new int[] { 10, 10, 8, 10, 10 }));

		view.printAllStudents(student);
		view.printBestStudents(student);
	}
}
