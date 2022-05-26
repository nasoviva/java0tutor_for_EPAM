package com.java0tutor.simpleClass.task5;

//Programming with classes. Простейшие классы и объекты. Задание 5:
//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class DecimalCounter {
	private int count;
	private int min;
	private int max;

	public DecimalCounter() {
		count = 0;
		min = 0;
		max = 9;
	}

	public DecimalCounter(int count) {
		super();
		if (count >= 0 && count <= 9)
			this.count = count;
		else
			this.count = 0;
		this.min = 0;
		this.max = 9;
	}

	public void increaseCount() {
		if (count >= 0 && count < 9)
			count++;
	}

	public void decreaseCount() {
		if (count > 0 && count <= 9)
			count--;
	}

	public int currentCount() {
		return count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		if (count >= 0 && count <= 9)
			this.count = count;
		else
			this.count = 0;
	}

	public int getMin() {
		return min;
	}

	public int getMax() {
		return max;
	}

}
