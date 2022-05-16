package com.java0tutor.algorithmization.decomposition;

public class Task17 {
	// Декомпозиция с использованием методов. Задание 16:
	// Из заданного числа вычли сумму его цифр.
	// Из результата вновь вычли сумму его цифр и т.д. Сколько таких
	// действий надо произвести, чтобы получился нуль?

	private long n;

	public Task17() {

	}

	public Task17(long n) {
		super();
		this.n = n;
	}

	public long getN() {
		return n;
	}

	public void setN(long n) {
		this.n = n;
	}

	public void result() {
		System.out.println("Число: " + n + ", количество вычитаний: " + countOfSubtraction());
	}

	public int countOfSubtraction() {
		int count;

		count = 0;
		while (n > 0) {
			n = n - countsumOfDigits();
			if (n > 0)
				count++;
		}
		return count;
	}

	public int countsumOfDigits() {
		int sum;
		String str;

		sum = 0;
		str = Long.toString(n);
		for (int i = 0; i < str.length(); i++) {
			sum = sum + (str.charAt(i) - '0');
		}
		return sum;
	}

	public static void main(String[] args) {
		Task17 task = new Task17(444);
		task.result();
	}

}
