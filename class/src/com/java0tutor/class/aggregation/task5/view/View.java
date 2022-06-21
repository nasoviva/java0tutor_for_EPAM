package com.java0tutor.aggregation.task5.view;

import com.java0tutor.aggregation.task5.entity.TravelAgency;

public class View {
	public void printVouchers(TravelAgency agency) {
		if (agency == null) {
			System.out.println("Список пуст");
			return;
		}
		for (int i = 0; i < agency.getVouchers().size(); i++) {
			System.out.println("Название города: " + agency.getVouchers().get(i).getNameOfCity());
			System.out.println("Тип отеля: " + agency.getVouchers().get(i).getTypeOfHotel());
			System.out.println("Тип питания: " + agency.getVouchers().get(i).getTypeOfFood());
			System.out.println("Тип путешествия: " + agency.getVouchers().get(i).getTypeOfTravel());
			System.out.println("Тип транспорта: " + agency.getVouchers().get(i).getTypeOfTransport());
			System.out.println("Кол-во дней: " + agency.getVouchers().get(i).getDuration());
			System.out.println("Цена: " + agency.getVouchers().get(i).getPrice() + " долл.\n");
		}
	}
}
