package com.java0tutor.algorithmization.decomposition;

public class Task8 {

	// Декомпозиция с использованием методов. Задание 8:
	// Задан массив D. Определить следующие суммы:
	// D[1] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
	// Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
	// расположенных элементов массива с номерами от k до m.

	private int[] d;

	public Task8() {

	}

	public Task8(int[] d) {
		super();
		this.d = d;
	}

	public int[] getD() {
		return d;
	}

	public void setD(int[] d) {
		this.d = d;
	}

	public void result() {

		d = initArray();
		System.out.println("\nD[1] + D[2] + D[3] = " + countSumOfElements(d, 1, 3));
		System.out.println("D[3] + D[4] + D[5] = " + countSumOfElements(d, 3, 5));
		System.out.println("D[4] + D[5] + D[6] = " + countSumOfElements(d, 4, 6));
	}

	public int[] initArray() {
		d = new int[10];
		System.out.print("D =");
		for (int i = 0; i < d.length; i++) {
			d[i] = (int) (Math.random() * (10));
			System.out.print(" " + d[i]);
		}
		return d;
	}

	public int countSumOfElements(int[] array, int k, int m) {
		int sum;
		int i;

		if (k < 0 || m >= array.length) {
			System.out.println("Параметры некорректны");
			return -1;
		}
		i = k;
		sum = 0;
		while (i <= m) {
			sum = sum + array[i];
			i++;
		}
		return sum;
	}

	public static void main(String[] args) {
		Task8 task = new Task8();
		task.result();
	}

}
