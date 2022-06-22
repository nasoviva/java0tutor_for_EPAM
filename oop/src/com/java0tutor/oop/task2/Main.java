package com.java0tutor.oop.task2;

import com.java0tutor.oop.task2.entity.Payment;
import com.java0tutor.oop.task2.view.View;

//Basics of OOP. Задание 2:
//Создать класс Payment с внутренним классом, 
//с помощью объектов которого можно сформировать покупку из нескольких товаров.

public class Main {

	public static void main(String[] args) {
		Payment payment = new Payment();
		View view = new View();

		payment.addProduct("tel", 100);
		payment.addProduct("comp", 1000);
		payment.addProduct("table", 10);
		payment.deleteProduct("table");

		view.printListOfProducts(payment);
		System.out.println();
		view.printfinalSumOfProducts(payment);
	}

}
