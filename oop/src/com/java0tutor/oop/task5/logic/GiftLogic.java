package com.java0tutor.oop.task5.logic;

import com.java0tutor.oop.task5.bean.Gift;
import com.java0tutor.oop.task5.bean.sweet.Sweet;
import com.java0tutor.oop.task5.bean.sweet.SweetType;
import com.java0tutor.oop.task5.bean.wrapping.Wrapping;
import com.java0tutor.oop.task5.bean.wrapping.WrappingType;
import com.java0tutor.oop.task5.exception.GiftException;

public class GiftLogic {

	public Gift createGift(String sweetType, String wrappingType) {

		Gift gift = new Gift();
		Wrapping wrapping;
		Sweet sweet;
		try {
			sweet = createSweet(sweetType);
			wrapping = createWrapping(wrappingType);
			gift.setSweet(sweet);
			gift.setWrapping(wrapping);

		} catch (GiftException e) {
			e.printStackTrace();
		}
		return gift;
	}

	public double findPriceOfGift(Gift gift) {
		return gift.getWrapping().getPrice() + gift.getSweet().getPrice();
	}

	private Sweet createSweet(String sweetType) throws GiftException {
		Sweet sweet = new Sweet();
		try {
			sweet.setType(SweetType.valueOf(sweetType.toUpperCase()));

		} catch (IllegalArgumentException e) {
			throw new GiftException("нет таких сладостей");
		}
		return sweet;
	}

	private Wrapping createWrapping(String wrappingType) throws GiftException {
		Wrapping wrapping = new Wrapping();
		try {
			wrapping.setType(WrappingType.valueOf(wrappingType.toUpperCase()));
		} catch (IllegalArgumentException e) {
			throw new GiftException("нет такой упаковки");
		}
		return wrapping;
	}

}
