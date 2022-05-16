package com.java0tutor.basic.linear;

public class Task4 {
	// Линейный программы. Задание 4:
	// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
	// целой частях). Поменять местами дробную и целую части числа и вывести
	// полученное значение числа.

	public void task(double r) {
		double result;
		String str;

		if (r >= 100 && r <= 999.9990) {
			str = String.format("%.3f", r);
			System.out.println("str = " + str);
			r = Double.parseDouble(str);
			result = (r * 1000) % 1000 + (int) r / 1000.0;
			System.out.println("R = " + r);
			System.out.println("result = " + result);
		} else
			System.out.println("R is error");
	}

	public static void main(String[] args) {
		Task4 task = new Task4();
		task.task(111.999);
	}
}
