package com.java0tutor.simpleClass.task4;

import java.util.Scanner;

public class Depo {
	private int length;
	private int count;
	private Train[] train;

	public Depo() {
		length = 5;
		count = 0;
		train = new Train[length];
	}

	public Train[] add(Train train_new) {
		train[count] = train_new;
		count++;
		return train;
	}

	public void printAllTrains() {
		for (int i = 0; i < train.length; i++) {
			System.out.println("Пункт назначения: " + train[i].getDestination());
			System.out.println("Номер поезда: " + train[i].getNumOfTrain());
			if (train[i].getTimeOfDeparture().getHour() < 10)
				System.out.print("Время отправления: 0" + train[i].getTimeOfDeparture().getHour() + ":");
			else
				System.out.print("Время отправления: " + train[i].getTimeOfDeparture().getHour() + ":");
			if (train[i].getTimeOfDeparture().getMin() < 10)
				System.out.println("0" + train[i].getTimeOfDeparture().getMin() + "\n");
			else
				System.out.println(train[i].getTimeOfDeparture().getMin() + "\n");
		}
	}

	public void sortByNumOfTrain() {
		int tmp_num;
		String tmp_destination;
		Time tmp_time;

		for (int i = 0; i < train.length; i++) {
			for (int j = 0; j < train.length - 1; j++) {
				if (train[j].getNumOfTrain() > train[j + 1].getNumOfTrain()) {
					tmp_num = train[j].getNumOfTrain();
					tmp_destination = train[j].getDestination();
					tmp_time = train[j].getTimeOfDeparture();

					train[j].setNumOfTrain(train[j + 1].getNumOfTrain());
					train[j].setDestination(train[j + 1].getDestination());
					train[j].setTimeOfDeparture(train[j + 1].getTimeOfDeparture());

					train[j + 1].setNumOfTrain(tmp_num);
					train[j + 1].setDestination(tmp_destination);
					train[j + 1].setTimeOfDeparture(tmp_time);
				}
			}
		}
	}

	public void sortByDestination() {
		int tmp_num;
		String tmp_destination;
		Time tmp_time;

		for (int i = 0; i < train.length; i++) {
			for (int j = 0; j < train.length - 1; j++) {
				if (compareDestination(train[j].getDestination(), train[j + 1].getDestination()) > 0) {
					tmp_num = train[j].getNumOfTrain();
					tmp_destination = train[j].getDestination();
					tmp_time = train[j].getTimeOfDeparture();

					train[j].setNumOfTrain(train[j + 1].getNumOfTrain());
					train[j].setDestination(train[j + 1].getDestination());
					train[j].setTimeOfDeparture(train[j + 1].getTimeOfDeparture());

					train[j + 1].setNumOfTrain(tmp_num);
					train[j + 1].setDestination(tmp_destination);
					train[j + 1].setTimeOfDeparture(tmp_time);
				} else if (compareDestination(train[j].getDestination(), train[j + 1].getDestination()) == 0)
					sortByTimeOfDeparture(train, j, j + 1);
			}
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

	public void findInfoAboutTrain(int number) {
		int flag;

		flag = 0;
		for (int i = 0; i < train.length; i++) {
			if (train[i].getNumOfTrain() == number) {
				printInfoAboutTrain(train[i]);
				flag++;
			}
		}
		if (flag == 0)
			System.out.println("Поезд с таким номером не найден");
	}

	private int compareDestination(String s1, String s2) {
		for (int i = 0; i < s1.length(); i++) {
			if (i < s2.length() && s1.charAt(i) - s2.charAt(i) > 0)
				return 1;
			else if (i < s2.length() && s1.charAt(i) - s2.charAt(i) < 0)
				return -1;
		}
		return 0;
	}

	private void sortByTimeOfDeparture(Train[] train, int a, int b) {
		int tmp_num;
		String tmp_destination;
		Time tmp_time;

		for (int i = a; i <= b; i++) {
			for (int j = a; j <= b - 1; j++) {
				if (train[j].getTimeOfDeparture().getHour() > train[j + 1].getTimeOfDeparture().getHour()) {
					tmp_num = train[j].getNumOfTrain();
					tmp_destination = train[j].getDestination();
					tmp_time = train[j].getTimeOfDeparture();

					train[j].setNumOfTrain(train[j + 1].getNumOfTrain());
					train[j].setDestination(train[j + 1].getDestination());
					train[j].setTimeOfDeparture(train[j + 1].getTimeOfDeparture());

					train[j + 1].setNumOfTrain(tmp_num);
					train[j + 1].setDestination(tmp_destination);
					train[j + 1].setTimeOfDeparture(tmp_time);
				} else if (train[j].getTimeOfDeparture().getHour() == train[j + 1].getTimeOfDeparture().getHour()) {
					if (train[j].getTimeOfDeparture().getMin() > train[j + 1].getTimeOfDeparture().getMin()) {
						tmp_num = train[j].getNumOfTrain();
						tmp_destination = train[j].getDestination();
						tmp_time = train[j].getTimeOfDeparture();

						train[j].setNumOfTrain(train[j + 1].getNumOfTrain());
						train[j].setDestination(train[j + 1].getDestination());
						train[j].setTimeOfDeparture(train[j + 1].getTimeOfDeparture());

						train[j + 1].setNumOfTrain(tmp_num);
						train[j + 1].setDestination(tmp_destination);
						train[j + 1].setTimeOfDeparture(tmp_time);
					}
				}
			}
		}
	}

	private void printInfoAboutTrain(Train train) {
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
