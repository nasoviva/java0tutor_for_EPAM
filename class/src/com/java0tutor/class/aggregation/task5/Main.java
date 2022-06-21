package com.java0tutor.aggregation.task5;

import java.util.ArrayList;
import java.util.List;

import com.java0tutor.aggregation.task5.entity.NameOfCity;
import com.java0tutor.aggregation.task5.entity.NumOfDays;
import com.java0tutor.aggregation.task5.entity.TravelAgency;
import com.java0tutor.aggregation.task5.entity.TravelVoucher;
import com.java0tutor.aggregation.task5.entity.TypeOfFood;
import com.java0tutor.aggregation.task5.entity.TypeOfHotel;
import com.java0tutor.aggregation.task5.entity.TypeOfTransport;
import com.java0tutor.aggregation.task5.entity.TypeOfTravel;
import com.java0tutor.aggregation.task5.logic.TravelAgencyLogic;
import com.java0tutor.aggregation.task5.view.View;

//Programming with classes. Агрегация и композиция. Задание 5:
//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки
//различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. 
//Учитывать возможность выбора транспорта, питания и числа дней. 
//Реализовать выбор и сортировку путевок.

public class Main {

	public static void main(String[] args) {
		View view = new View();
		TravelAgencyLogic logic = new TravelAgencyLogic();

		TravelVoucher voucher1 = new TravelVoucher(NameOfCity.MEXICO, TypeOfHotel.FIVE_STARS, TypeOfTravel.EXCURSION,
				TypeOfTransport.AVIA, TypeOfFood.BREAKFAST_DINNER, NumOfDays.ELEVEN, 700);
		TravelVoucher voucher2 = new TravelVoucher(NameOfCity.CANCUN, TypeOfHotel.APPARTAMENTS, TypeOfTravel.REST,
				TypeOfTransport.TRAIN, TypeOfFood.ALLINCLUSIVE, NumOfDays.ONE, 400);
		TravelVoucher voucher3 = new TravelVoucher(NameOfCity.MEXICO, TypeOfHotel.FOUR_STARS, TypeOfTravel.REST,
				TypeOfTransport.TRAIN, TypeOfFood.BREAKFAST, NumOfDays.FIVE, 300);

		List<TravelVoucher> vouchers = new ArrayList<TravelVoucher>();
		vouchers.add(voucher1);
		vouchers.add(voucher2);
		vouchers.add(voucher3);
		TravelAgency agency = new TravelAgency(vouchers);

		System.out.println("Список туров:");
		view.printVouchers(agency);

		System.out.println("\nСортировка туров по названию города:");
		logic.sortByNameOfCity(agency);
		view.printVouchers(agency);

		System.out.println("\nСортировка туров по их продолжительности:");
		logic.sortByDuration(agency);
		view.printVouchers(agency);

		System.out.println("\nСортировка туров по типу транспорта:");
		logic.sortByTransport(agency);
		view.printVouchers(agency);

		System.out.println("\nПоиск туров по названию города:");
		view.printVouchers(logic.findVoucherOfNameOfCity(agency, NameOfCity.MEXICO));

		System.out.println("\nПоиск туров по типу:");
		view.printVouchers(logic.findVoucherOfTypeOfTravel(agency, TypeOfTravel.REST));
	}

}
