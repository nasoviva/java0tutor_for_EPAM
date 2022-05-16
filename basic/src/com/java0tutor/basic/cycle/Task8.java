package com.java0tutor.basic.cycle;

public class Task8 {
	// Циклы. Задание 8:
	// Даны два числа.
	// Определить цифры, входящие в запись как первого так и второго числа.

	public void task(int a, int b) {
		String str_a;
		String str_b;
		int i;
		int j;

		System.out.println("a = " + a + ", b = " + b + "\n");
		str_a = Integer.toString(a);
		str_b = Integer.toString(b);
		i = 0;
		j = 0;
		while (i < str_a.length() && j < str_b.length()) {
			while (j < str_b.length()) {
				if (str_a.charAt(i) == str_b.charAt(j))
					System.out.println("цифрa, входящая в запись как первого так и второго числа = " + str_a.charAt(i));
				j++;
			}
			j = 0;
			i++;
		}
	}

	public static void main(String[] args) {
		Task8 task = new Task8();
		task.task(1254, 3415);
	}
}
