package com.java0tutor.oop.task2.view;

import com.java0tutor.oop.task2.entity.Payment;
import com.java0tutor.oop.task2.logic.PaymentLogic;

public class View {

	PaymentLogic logic = new PaymentLogic();

	public void printListOfProducts(Payment payment) {
		System.out.println("Список товаров:");
		for (int i = 0; i < payment.getListOfProducts().size(); i++) {
			System.out.println("Название товара: " + payment.getListOfProducts().get(i).getTitle());
			System.out.println("Стоимость товара: " + payment.getListOfProducts().get(i).getPrice());
		}
	}

	public void printfinalSumOfProducts(Payment payment) {
		System.out.println("Общая стоимость товаров: " + logic.finalSumOfProducts(payment));
	}
}
