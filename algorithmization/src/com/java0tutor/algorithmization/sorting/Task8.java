package com.java0tutor.algorithmization.sorting;

public class Task8 {
	// Одномерные массивы. Сортировки. Задание 8:
	// Даны дроби p1/q1 , p2/q2 ,..., pn/qn (pi , qi - натуральные). Составить
	// программу, которая приводит эти дроби к общему
	// знаменателю и упорядочивает их в порядке возрастания.

	public void task() {
		int[] numerator;
		int[] denominator;
		int n;
		int count;
		int tmp1;
		int tmp2;

		// инициализируем массив
		n = 5;
		numerator = new int[n];
		for (int i = 0; i < numerator.length; i++) {
			numerator[i] = 1 + (int) (Math.random() * (10));
		}

		denominator = new int[n];
		for (int i = 0; i < denominator.length; i++) {
			denominator[i] = 1 + (int) (Math.random() * (10));
		}

		// выводим массив
		int max = denominator[0];
		System.out.print("array =");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + numerator[i] + "/" + denominator[i]);
			if (denominator[i] > denominator[0])
				max = denominator[i];
		}

		// приводим к общему знаменателю
		System.out.println("");
		for (int i = 0; i < n; i++) {

			if (max % denominator[i] != 0)
				max = max * denominator[i];
		}
		for (int i = 0; i < n; i++) {
			numerator[i] = (max / denominator[i]) * numerator[i];
			denominator[i] = max;
		}

		// выводим промежуточный результат
		System.out.print("\ncurrent array =");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + numerator[i] + "/" + denominator[i]);
		}

		// cортировка вставками
		for (int i = 1; i < n; i++) {
			count = i - 1;
			tmp1 = numerator[i];
			tmp2 = denominator[i];
			while (count >= 0 && tmp1 < numerator[count]) {
				numerator[count + 1] = numerator[count];
				denominator[count + 1] = denominator[count];
				count--;
			}
			numerator[count + 1] = tmp1;
			denominator[count + 1] = tmp2;
		}

		// выводим результат
		System.out.print("\n\nfinal array =");
		for (int i = 0; i < n; i++) {
			System.out.print(" " + numerator[i] + "/" + denominator[i]);
		}
	}

	public static void main(String[] args) {
		Task8 task = new Task8();
		task.task();

	}

}
