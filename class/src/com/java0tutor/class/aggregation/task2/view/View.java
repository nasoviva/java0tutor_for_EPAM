package com.java0tutor.aggregation.task2.view;

import com.java0tutor.aggregation.task2.entity.Car;

public class View {

	public void printModelCar(Car car) {
		if (car.getModel() == null) {
			System.out.println("Данные о марке автомобиля отсутствуют\n");
			return;
		}
		System.out.println("Марка автомобиля: " + car.getModel());
	}
}
