package com.java0tutor.simpleClass.task4;

// Programming with classes. Простейшие классы и объекты. Задание 4:
// Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
// Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива
// по номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
// назначения должны быть упорядочены по времени отправления.

public class Train {

	private String destination;
	private int numOfTrain;
	private Time timeOfDeparture;

	public Train() {
	}

	public Train(String destination, int numOfTrain, Time timeOfDeparture) {
		super();
		this.destination = destination;
		this.numOfTrain = numOfTrain;
		this.timeOfDeparture = timeOfDeparture;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getNumOfTrain() {
		return numOfTrain;
	}

	public void setNumOfTrain(int numOfTrain) {
		this.numOfTrain = numOfTrain;
	}

	public Time getTimeOfDeparture() {
		return timeOfDeparture;
	}

	public void setTimeOfDeparture(Time timeOfDeparture) {
		this.timeOfDeparture = timeOfDeparture;
	}

}
