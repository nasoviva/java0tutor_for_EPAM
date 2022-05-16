package com.java0tutor.algorithmization.decomposition;

public class Task1 {

	// Декомпозиция с использованием методов. Задание 1:
	// Написать метод(методы) для нахождения наибольшего общего делителя и
	// наименьшего общего кратного двух натуральных чисел:
	// НОК ( А , В ) = (A * B) / НОД (А , В)

	private int a;
	private int b;

	public Task1() {

	}

	public Task1(int a, int b) {
		super();
		this.a = a;
		this.b = b;
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

	public void checkResult(int nok, int a, int b) {
		if (nok == a * b / nod(a, b))
			System.out.println("Ответ верный");
		else
			System.out.println("Ошибка в расчетах");
	}

	// Наибольшим общим делителем (НОД) для двух целых чисел называется наибольший
	// из их общих делителей
	public int nod(int a, int b) {
		int i;

		if (a >= b)
			i = b;
		else
			i = a;
		while (i > 1) {
			if (a % i == 0 && b % i == 0)
				break;
			else
				i--;
		}
		return i;
	}

	// Наименьшее общее кратное для нескольких чисел — это наименьшее натуральное
	// число, которое делится на каждое из этих чисел.
	public int nok(int a, int b) {
		int i;

		if (a <= b)
			i = b;
		else
			i = a;
		while (i < a * b) {
			if (i % a == 0 && i % b == 0)
				break;
			else
				i++;
		}
		return i;
	}

	public static void main(String[] args) {
		Task1 task = new Task1(10, 55);

		int nod;
		int nok;

		if (task.getA() < 1 || task.getB() < 1) {
			System.out.println("Введите два натуральных числа");
			return;
		}
		nod = task.nod(task.getA(), task.getB());
		nok = task.nok(task.getA(), task.getB());
		System.out.print("НОК (" + task.getA() + ", " + task.getB() + ") = " + nok);
		System.out.println(", НОД (" + task.getA() + ", " + task.getB() + ") = " + nod);
		task.checkResult(nok, task.getA(), task.getB());
	}

}
