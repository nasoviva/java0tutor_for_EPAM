package com.java0tutor.simpleClass.task5;

public class Main {

	public static void main(String[] args) {
		// инициализация счетчика значениями по умолчанию
		DecimalCounter d = new DecimalCounter();
		System.out.println("инициализация счетчика значениями по умолчанию: " + d.currentCount());

		// инициализация счетчика произвольными значениями
		d = new DecimalCounter(3);
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
