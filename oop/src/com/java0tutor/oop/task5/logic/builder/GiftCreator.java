package com.java0tutor.oop.task5.logic.builder;

import com.java0tutor.oop.task5.bean.Gift;
import com.java0tutor.oop.task5.exception.GiftException;
import com.java0tutor.oop.task5.logic.GiftLogic;

public class GiftCreator {
	GiftBuilder giftBuilder;
	GiftLogic logic = new GiftLogic();

	public void setGiftBuilder(String sweet, String wrapping) {
		try {
			this.giftBuilder = chooseGiftBuilder(sweet, wrapping);
		} catch (GiftException e) {
			e.printStackTrace();
		}
	}

	public GiftBuilder chooseGiftBuilder(String sweet, String wrapping) throws GiftException {
		if (sweet.equalsIgnoreCase("lollipop") && wrapping.equalsIgnoreCase("box"))
			return new LollipopBoxGiftBuilder();
		else if (sweet.equalsIgnoreCase("lollipop") && wrapping.equalsIgnoreCase("paper"))
			return new LollipopPaperGiftBuilder();
		else if (sweet.equalsIgnoreCase("chocolate") && wrapping.equalsIgnoreCase("box"))
			return new ChocolateBoxGiftBuilder();
		else if (sweet.equalsIgnoreCase("chocolate") && wrapping.equalsIgnoreCase("paper"))
			return new ChocolatePaperGiftBuilder();
		else if (sweet.equalsIgnoreCase("bubblegum") && wrapping.equalsIgnoreCase("box"))
			return new BubblegumBoxrGiftBuilder();
		else if (sweet.equalsIgnoreCase("bubblegum") && wrapping.equalsIgnoreCase("paper"))
			return new BubblegumPaperGiftBuilder();
		else {
			throw new GiftException(sweet + " + " + wrapping + " - нет такого подарка");
		}
	}

	public Gift buildGift() {
		if (giftBuilder != null) {
			giftBuilder.createGift();
			giftBuilder.buildSweet();
			giftBuilder.buildWrapping();
			return giftBuilder.getGift();
		}
		return null;
	}
}
