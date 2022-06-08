package com.java0tutor.aggregation.task2;

import com.java0tutor.aggregation.task2.entity.Car;
import com.java0tutor.aggregation.task2.entity.CarBoby;
import com.java0tutor.aggregation.task2.entity.Motor;
import com.java0tutor.aggregation.task2.entity.MotorType;
import com.java0tutor.aggregation.task2.entity.Season;
import com.java0tutor.aggregation.task2.entity.Wheel;
import com.java0tutor.aggregation.task2.view.View;

//Programming with classes. Агрегация и композиция. Задание 2:
//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. 
//Методы: ехать, заправляться, менять колесо, вывести на консоль марку автомобиля.

public class Main {

	public static void main(String[] args) {
		View view = new View();

		Wheel[] wheel = new Wheel[4];
		wheel[0] = new Wheel(17, 7, Season.UNIVERSAL);
		wheel[1] = new Wheel(17, 7, Season.UNIVERSAL);
		wheel[2] = new Wheel(17, 7, Season.UNIVERSAL);
		wheel[3] = new Wheel(17, 7, Season.UNIVERSAL);

		Motor motor = new Motor(MotorType.PETROL, 4, 1.8);

		Car car = new Car(wheel, motor, "BMW", 1980, 65, 70, 200, CarBoby.MINIVAN, false);

		System.out.println("Текущий километраж: " + car.getMileage());
		car.driveCar(30);
		System.out.println("Текущий километраж после езды: " + car.getMileage());

		System.out.println("\nКоличество топлива: " + car.getFuelQuantity());
		car.refuelCar(15);
		System.out.println("Количество топлива после заправки: " + car.getFuelQuantity());

		System.out.println("\nДанные о колесе: " + car.getWheels()[0].toString());
		car.changeWheel(wheel[0], 17, 18, Season.WINTER);
		System.out.println("Данные о колесе после замены: " + car.getWheels()[0].toString() + "\n");

		view.printModelCar(car);
	}

}
