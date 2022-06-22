package com.java0tutor.class_simpleClass.task4.view;

import java.util.Scanner;

import com.java0tutor.class_simpleClass.task4.entity.Depo;
import com.java0tutor.class_simpleClass.task4.entity.Train;

public class View {

	public void printAllTrains(Depo depo) {
		for (int i = 0; i < depo.getTrain().length; i++) {
			System.out.println("Пункт назначения: " + depo.getTrain()[i].getDestination());
			System.out.println("Номер поезда: " + depo.getTrain()[i].getNumOfTrain());
			if (depo.getTrain()[i].getTimeOfDeparture().getHour() < 10)
				System.out.print("Время отправления: 0" + depo.getTrain()[i].getTimeOfDeparture().getHour() + ":");
			else
				System.out.print("Время отправления: " + depo.getTrain()[i].getTimeOfDeparture().getHour() + ":");
			if (depo.getTrain()[i].getTimeOfDeparture().getMin() < 10)
				System.out.println("0" + depo.getTrain()[i].getTimeOfDeparture().getMin() + "\n");
			else
				System.out.println(depo.getTrain()[i].getTimeOfDeparture().getMin() + "\n");
		}
	}

	public int inputNumOfTrain() {
		int number;

		number = 0;
		while (number <= 0 || number > Integer.MAX_VALUE) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("\nВведите номер поезда: ");
			if (scanner.hasNextInt())
				number = scanner.nextInt();
		}
		return number;
	}

	public void printInfoAboutTrain(Train train) {
		if (train == null) {
			System.out.println("Поезд с таким номером не найден");
			return;
		}
		System.out.println("\nПункт назначения: " + train.getDestination());
		if (train.getTimeOfDeparture().getHour() < 10)
			System.out.print("Время отправления: 0" + train.getTimeOfDeparture().getHour() + ":");
		else
			System.out.print("Время отправления: " + train.getTimeOfDeparture().getHour() + ":");
		if (train.getTimeOfDeparture().getMin() < 10)
			System.out.println("0" + train.getTimeOfDeparture().getMin() + "\n");
		else
			System.out.println(train.getTimeOfDeparture().getMin() + "\n");
	}

}
