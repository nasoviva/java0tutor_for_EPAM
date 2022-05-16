package com.java0tutor.basic.cycle;

import java.math.BigInteger;

public class Task4 {
	// Циклы. Задание 4:
	// Составить программу нахождения произведения квадратов первых двухсот чисел.

	public void task() {
		BigInteger result = BigInteger.valueOf(1);// возвращает объект BigDecimal
		for (int i = 1; i <= 200; i++) {
			// multiply возвращает произведение двух чисел result * (i^2)
			result = result.multiply(BigInteger.valueOf((int) Math.pow(i, 2)));
		}
		System.out.println("result = " + result);
	}

	public static void main(String[] args) {
		Task4 task = new Task4();
		task.task();
	}
}