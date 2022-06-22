package com.java0tutor.oop.task2.logic;

import com.java0tutor.oop.task2.entity.Payment;

public class PaymentLogic {
	public double finalSumOfProducts(Payment payment) {
		double sum;

		sum = 0;
		for (int i = 0; i < payment.getListOfProducts().size(); i++) {
			sum = sum + payment.getListOfProducts().get(i).getPrice();
		}
		return sum;
	}
}
