package com.java0tutor.oop.task5.view;

import com.java0tutor.oop.task5.bean.Gift;
import com.java0tutor.oop.task5.logic.GiftLogic;

public class View {

	GiftLogic logic = new GiftLogic();

	public void printGift(Gift gift) {
		if (gift != null && gift.getSweet().getType() != null && gift.getWrapping().getType() != null) {
			System.out.print("\nСладости: " + gift.getSweet().getType());
			System.out.println("\nТип упаковки: " + gift.getWrapping().getType());
			System.out.println("Общая стоимость подарка: " + logic.findPriceOfGift(gift));
		} else
			System.err.println("нет такого подарка");
	}
}
