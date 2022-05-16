package com.java0tutor.algorithmization.array;

public class Task2 {
	// Одномерные массивы. Задание 2:
	// Дана последовательность действительных чисел а 1 ,а 2 ,..., а п .
	// Заменить все ее члены, большие данного Z, этим числом.
	// Подсчитать количество замен.

	public void task(double z) {
		int num;
		double[] array;

		// инициализируем массив
		array = new double[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = Math.random() * (101);// ( Math.random() * (b-a+1) ) + a, [0;100]
		}
		// выводим массив
		System.out.print("Z = " + z + ", array =");
		for (int i = 0; i < array.length; i++) {
			System.out.format("%.1f ", array[i]);
		}
		// делаем замены
		num = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > z) {
				array[i] = z;
				num++;
			}
		}

		// выводим результат
		System.out.print("\n\nКоличество замен: " + num + "\narray =");
		for (int i = 0; i < array.length; i++) {
			System.out.format("%.1f ", array[i]);
		}
	}

	public static void main(String[] args) {
		Task2 task = new Task2();
		task.task(50);
	}
}
