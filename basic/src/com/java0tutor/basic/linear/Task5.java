package com.java0tutor.basic.linear;

public class Task5 {
	// Линейный программы. Задание 5:
	// Дано натуральное число Т, которое представляет длительность прошедшего
	// времени в секундах.
	// Вывести данное значение длительности в часах, минутах и секундах:
	// ННч ММмин SSc.

	public void task(int t) {
		int hours;
		int sec;
		int min;

		hours = t / 3600;
		sec = t % 3600;
		min = sec / 60;
		sec = sec % 60;

		System.out.println("T = " + t);
		System.out.println("result = " + hours + "ч " + min + "мин " + sec + "с");
	}

	public static void main(String[] args) {
		Task5 task = new Task5();
		task.task(8012222);
	}
}
