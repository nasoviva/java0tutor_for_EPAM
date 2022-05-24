package com.java0tutor.simpleClass.task1;

//	Programming with classes. Простейшие классы и объекты. Задание 1:
//	Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//	переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//	наибольшее значение из этих двух переменных.

public class Test1 {

	private int a;
	private int b;

	public void print() {
		System.out.println(a + ", " + b);
	}

	public int sum() {
		return a + b;
	}

	public int max() {
		if (a >= b)
			return a;
		else
			return b;
	}

	public Test1() {
	}

	public Test1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

}
