package com.java0tutor.class_simpleClass.task5;

//Programming with classes. Простейшие классы и объекты. Задание 5:
//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Main {

	public static void main(String[] args) {
		// инициализация счетчика значениями по умолчанию
		DecimalCounter d = new DecimalCounter();
		System.out.println("инициализация счетчика значениями по умолчанию: " + d.currentCount());

		// инициализация счетчика произвольными значениями
		d = new DecimalCounter(3, 0, 9);
		System.out.println("инициализация счетчика произвольными значениями: " + d.currentCount());

		System.out.println("текущее состояние счетчика: " + d.currentCount());
		System.out.println("метод увеличения состояния: ");
		while (d.getCount() < d.getMax()) {
			d.increaseCount();
			System.out.print(d.currentCount() + " ");
		}

		System.out.println("\nтекущее состояние счетчика: " + d.currentCount());
		System.out.println("метод уменьшения состояния: ");
		while (d.getCount() > d.getMin()) {
			d.decreaseCount();
			System.out.print(d.currentCount() + " ");
		}
	}

}
