package com.java0tutor.oop.task5.bean.wrapping;

public enum WrappingType {
	BOX(100), PAPER(50);

	int wrappingPrice;

	WrappingType(int price) {
		wrappingPrice = price;
	}

	int getWrappingPrice() {
		return wrappingPrice;
	}
}
