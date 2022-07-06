package com.java0tutor.oop.task5.main;

import com.java0tutor.oop.task5.bean.Gift;
import com.java0tutor.oop.task5.logic.GiftLogic;
import com.java0tutor.oop.task5.logic.builder.GiftCreator;
import com.java0tutor.oop.task5.view.View;

//Basics of OOP. Задание 5:
//Создать консольное приложение, удовлетворяющее следующим требованиям:
//•Корректно спроектируйте и реализуйте предметную область задачи.
//•Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов
//проектирования.
//•Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
//•для проверки корректности переданных данных можно применить регулярные выражения.
//•Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
//•Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
//Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
//(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются цветы
//и упаковка.
//Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий собой
//подарок). Составляющими целого подарка являются сладости и упаковка.

public class Main {

	public static void main(String[] args) {

		View view = new View();
		Gift gift;

		// первый способ

		GiftLogic logic = new GiftLogic();

		gift = logic.createGift("chocolate", "box");
		view.printGift(gift);

		// второй способ

		GiftCreator giftCreator = new GiftCreator();

		giftCreator.setGiftBuilder("chocolate", "box");
		gift = giftCreator.buildGift();
		view.printGift(gift);

	}

}
