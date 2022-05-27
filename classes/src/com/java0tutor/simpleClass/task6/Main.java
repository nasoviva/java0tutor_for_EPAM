package com.java0tutor.simpleClass.task6;

public class Main {

	public static void main(String[] args) {
		Time time = new Time(3, 1, 3);
		time.printCurrentTime();
		time.setHour(3);
		time.setMin(23);
		time.setSec(33);
		time.printCurrentTime();
		time = new Time(2, 160, 3);
		time.printCurrentTime();
		time.increaseCurrentTime();
		time.printCurrentTime();
		time.decreaseCurrentTime();
		time.printCurrentTime();
	}

}
