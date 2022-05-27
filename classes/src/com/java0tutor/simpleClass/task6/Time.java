package com.java0tutor.simpleClass.task6;

import java.util.Scanner;

//Programming with classes. Простейшие классы и объекты. Задание 6:
//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
//В случае недопустимых значений полей поле устанавливается в значение 0. 
//Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Time {

	private int hour;
	private int min;
	private int sec;

	public Time() {

	}

	public Time(int hour, int min, int sec) {
		super();
		if (hour >= 0 && hour < 24)
			this.hour = hour;
		else
			this.hour = 0;

		if (min >= 0 && min < 60)
			this.min = min;
		else
			this.min = 0;
		if (sec >= 0 && sec < 60)
			this.sec = sec;
		else
			this.sec = 0;
	}

	public void printCurrentTime() {
		if (hour < 10)
			System.out.print("Текущее время: 0" + hour);
		else
			System.out.print("Текущее время: " + hour);
		if (min < 10)
			System.out.print(":0" + min);
		else
			System.out.print(":" + min);
		if (sec < 10)
			System.out.println(":0" + sec);
		else
			System.out.println(":" + sec);
	}

	public void increaseCurrentTime() {
		int increaseByHour;
		int increaseByMin;
		int increaseBySec;

		increaseByHour = inputTime("На сколько часов увеличить текущее время? Введите число: ");
		increaseByMin = inputTime("На сколько минут увеличить текущее время? Введите число: ");
		increaseBySec = inputTime("На сколько секунд увеличить текущее время? Введите число: ");

		if (hour + increaseByHour < 24)
			hour = hour + increaseByHour;
		else {
			while (hour + increaseByHour >= 24) {
				increaseByHour = increaseByHour - 24;
			}
			hour = hour + increaseByHour;
		}
		if (min + increaseByMin < 60)
			min = min + increaseByMin;
		else {
			while (min + increaseByMin >= 60) {
				increaseByMin = increaseByMin - 60;
				if (hour + 1 < 24)
					hour = hour + 1;
				else
					hour = hour - 23;
			}
			min = min + increaseByMin;
		}
		if (sec + increaseBySec < 60)
			sec = sec + increaseBySec;
		else {
			while (sec + increaseBySec >= 60) {
				increaseBySec = increaseBySec - 60;
				if (min + 1 < 60)
					min = min + 1;
				else {
					min = min - 59;
					if (hour + 1 < 24)
						hour = hour + 1;
					else
						hour = hour - 23;
				}
			}
			sec = sec + increaseBySec;
		}
	}

	public void decreaseCurrentTime() {
		int decreaseByHour;
		int decreaseByMin;
		int decreaseBySec;

		decreaseByHour = inputTime("На сколько часов уменьшить текущее время? Введите число: ");
		decreaseByMin = inputTime("На сколько минут уменьшить текущее время? Введите число: ");
		decreaseBySec = inputTime("На сколько секунд уменьшить текущее время? Введите число: ");

		if (hour - decreaseByHour >= 0)
			hour = hour - decreaseByHour;
		else {
			while (hour - decreaseByHour < 0) {
				decreaseByHour = decreaseByHour - 24;
			}
			hour = hour - decreaseByHour;
		}
		if (min - decreaseByMin >= 0)
			min = min - decreaseByMin;
		else {
			while (min - decreaseByMin < 0) {
				decreaseByMin = decreaseByMin - 60;
				if (hour - 1 >= 0) {
					hour = hour - 1;
				} else
					hour = 23 - hour;
			}
			min = min - decreaseByMin;
		}
		if (sec - decreaseBySec >= 0)
			sec = sec - decreaseBySec;
		else {
			while (sec - decreaseBySec < 0) {
				decreaseBySec = decreaseBySec - 60;
				if (min - 1 >= 0)
					min = min - 1;
				else {
					min = 59 - min;
					if (hour - 1 >= 0)
						hour = hour - 1;
					else
						hour = 23 - hour;
				}
			}
			sec = sec - decreaseBySec;
		}
	}

	private int inputTime(String s) {
		int t;

		t = 0;
		while (t <= 0 || t > Integer.MAX_VALUE) {
			Scanner scanner = new Scanner(System.in);
			System.out.print(s);
			if (scanner.hasNextInt()) {
				t = scanner.nextInt();
				break;
			} else
				System.out.println("Попробуйте снова");
		}
		return t;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 0 && hour < 24)
			this.hour = hour;
		else
			this.hour = 0;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		if (min >= 0 && min < 60)
			this.min = min;
		else
			this.min = 0;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		if (sec >= 0 && sec < 60)
			this.sec = sec;
		else
			this.sec = 0;
	}

}
