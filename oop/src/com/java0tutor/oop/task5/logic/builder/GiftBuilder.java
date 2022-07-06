package com.java0tutor.oop.task5.logic.builder;

import com.java0tutor.oop.task5.bean.Gift;
import com.java0tutor.oop.task5.bean.sweet.Sweet;
import com.java0tutor.oop.task5.bean.wrapping.Wrapping;

public abstract class GiftBuilder {
	Gift gift;
	Sweet sweet;
	Wrapping wrapping;

	void createGift() {
		sweet = new Sweet();
		wrapping = new Wrapping();
		gift = new Gift();
	}

	abstract void buildSweet();

	abstract void buildWrapping();

	Gift getGift() {
		return gift;
	}
}
