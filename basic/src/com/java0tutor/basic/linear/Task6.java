package com.java0tutor.basic.linear;

public class Task6 {
	// Линейный программы. Задание 6:
	// Для данной области составить линейную программу, которая печатает true,
	// если точка с координатами (х, у) принадлежит закрашенной области, и false — в
	// противном случае.

	public void task(int x, int y) {

		boolean result;
		if ((x <= 2 && x >= -2) && (y <= 4 && y >= -3))
			result = true;
		else if ((x <= 4 && x >= -4) && (y < 0 && y >= -3))
			result = true;
		else
			result = false;

		System.out.println("x = " + x + ", y = " + y);
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {
		Task6 task = new Task6();
		task.task(3, -1);
	}
}
