package com.java0tutor.algorithmization.decomposition;

public class Task5 {

	// Декомпозиция с использованием методов. Задание 5:
	// Составить программу, которая в массиве A[N] находит второе по величине число
	// (вывести на печать число, которое меньше максимального элемента массива,
	// но больше всех других элементов).

	private int[] array;

	public Task5() {

	}

	public Task5(int[] array) {
		super();
		this.array = array;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	public int findSecondMax() {
		int max;
		int secondMax;

		max = findMmax();
		secondMax = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > secondMax && array[i] < max) {
				secondMax = array[i];
			}
		}
		return secondMax;
	}

	public int findMmax() {
		int max;

		max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] a;

		a = new int[10];
		System.out.print("A[" + 10 + "] =");
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * (10));
			System.out.print(" " + a[i]);
		}
		Task5 task = new Task5(a);

		System.out.println("\nВторое по величине число: " + task.findSecondMax());
	}

}
