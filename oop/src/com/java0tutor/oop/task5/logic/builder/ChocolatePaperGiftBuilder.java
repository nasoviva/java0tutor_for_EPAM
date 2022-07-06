package com.java0tutor.oop.task5.logic.builder;

import com.java0tutor.oop.task5.bean.sweet.SweetType;
import com.java0tutor.oop.task5.bean.wrapping.WrappingType;

public class ChocolatePaperGiftBuilder extends GiftBuilder {

	@Override
	void buildSweet() {
		sweet.setType(SweetType.CHOCOLATE);
		gift.setSweet(sweet);

	}

	@Override
	void buildWrapping() {
		wrapping.setType(WrappingType.PAPER);
		gift.setWrapping(wrapping);
	}

}
