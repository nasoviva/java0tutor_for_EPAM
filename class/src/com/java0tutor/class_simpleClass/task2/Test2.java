package com.java0tutor.class_simpleClass.task2;

// Programming with classes. Простейшие классы и объекты. Задание 2:
// Создайте класс Test2 двумя переменными. Добавьте конструктор с входными
// параметрами. Добавьте конструктор, инициализирующий члены класса по умолчанию. 
// Добавьте set- и get-методы для полей экземпляра класса.

public class Test2 {

	private int a;
	private int b;

	public Test2() {
	}

	public Test2(int a, int b) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
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
		Test2 other = (Test2) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Test2 [a=" + a + ", b=" + b + "]";
	}

}
