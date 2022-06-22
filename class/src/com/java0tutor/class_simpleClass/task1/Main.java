package com.java0tutor.class_simpleClass.task1;

public class Main {

	public static void main(String[] args) {
		Test1 test = new Test1(1, 2);
		test.print();
		test.setA(3);
		test.setB(7);
		test.print();
		System.out.println(test.sum());
		System.out.println(test.max());
	}
}
