package com.java0tutor.algorithmization.decomposition;

public class Task2 {

	// Декомпозиция с использованием методов. Задание 2:
	// Написать метод(методы) для нахождения наибольшего общего делителя четырех
	// натуральных чисел.

	private int a;
	private int b;
	private int c;
	private int d;

	public Task2() {

	}

	public Task2(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	// Наибольшим общим делителем (НОД) для двух целых чисел называется наибольший
	// из их общих делителей
	public int nod(int a, int b, int c, int d) {
		int i;

		if (a <= b && a <= c && a <= d)
			i = a;
		else if (b <= a && b <= c && b <= d)
			i = b;
		else if (c <= a && c <= b && c <= d)
			i = c;
		else
			i = d;
		while (i > 1) {
			if (a % i == 0 && b % i == 0 && c % i == 0 && d % i == 0)
				break;
			else
				i--;
		}
		return i;
	}

	public static void main(String[] args) {
		Task2 task = new Task2(20, 500, 50, 200);

		int nod;

		if (task.getA() < 1 || task.getB() < 1 || task.getC() < 1 || task.getD() < 1) {
			System.out.println("Введите четыре натуральных числа");
			return;
		}
		nod = task.nod(task.getA(), task.getB(), task.getC(), task.getD());
		System.out.print("НОД (" + task.getA() + ", " + task.getB());
		System.out.println(", " + task.getC() + ", " + task.getD() + ") = " + nod);

	}

}
