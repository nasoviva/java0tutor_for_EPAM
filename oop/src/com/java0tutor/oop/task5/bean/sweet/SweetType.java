package com.java0tutor.oop.task5.bean.sweet;

public enum SweetType {
	CHOCOLATE(50), BUBBLEGUM(30), LOLLIPOP(25);

	int sweetPrice;

	SweetType(int price) {
		sweetPrice = price;
	}

	int getSweetPrice() {
		return sweetPrice;
	}
}
