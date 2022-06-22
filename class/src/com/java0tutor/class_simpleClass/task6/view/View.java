package com.java0tutor.class_simpleClass.task6.view;

import java.util.Scanner;

import com.java0tutor.class_simpleClass.task6.entity.Time;

public class View {

	public void printCurrentTime(Time time) {
		if (time.getHour() < 10)
			System.out.print("Текущее время: 0" + time.getHour());
		else
			System.out.print("Текущее время: " + time.getHour());
		if (time.getMin() < 10)
			System.out.print(":0" + time.getMin());
		else
			System.out.print(":" + time.getMin());
		if (time.getSec() < 10)
			System.out.println(":0" + time.getSec());
		else
			System.out.println(":" + time.getSec());
	}

	public int inputTime(String s) {
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

}
