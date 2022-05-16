package com.java0tutor.algorithmization.decomposition;

public class Task6 {

	// Декомпозиция с использованием методов. Задание 6:
	// Написать метод(методы), проверяющий, являются ли данные три числа взаимно
	// простыми.

	// Взаимно простые числа — целые числа, не имеющие никаких общих делителей,
	// кроме 1. Равносильное определение: целые числа взаимно просты, если их
	// наибольший общий делитель (НОД) равен 1.

	private int a;
	private int b;
	private int c;

	public Task6() {

	}

	public Task6(int a, int b, int c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
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

	public void setB(int ab) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void result() {

		if (nod() == 1)
			System.out.println("Числа " + a + ", " + b + ", " + c + " взаимно простые");
		else
			System.out.println("Числа " + a + ", " + b + ", " + c + " не являются взаимно простыми");

	}

	public int nod() {
		int i;

		if (a <= b && a <= c)
			i = a;
		else if (b <= a && b <= c)
			i = b;
		else
			i = c;
		while (i > 1) {
			if (a % i == 0 && b % i == 0 && c % i == 0)
				break;
			else
				i--;
		}
		return i;
	}

	public static void main(String[] args) {
		Task6 task = new Task6(35, 40, 7);
		task.result();
	}

}
