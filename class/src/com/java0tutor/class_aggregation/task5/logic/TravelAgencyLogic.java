package com.java0tutor.class_aggregation.task5.logic;

import com.java0tutor.class_aggregation.task5.entity.NameOfCity;
import com.java0tutor.class_aggregation.task5.entity.NumOfDays;
import com.java0tutor.class_aggregation.task5.entity.TravelAgency;
import com.java0tutor.class_aggregation.task5.entity.TypeOfFood;
import com.java0tutor.class_aggregation.task5.entity.TypeOfHotel;
import com.java0tutor.class_aggregation.task5.entity.TypeOfTransport;
import com.java0tutor.class_aggregation.task5.entity.TypeOfTravel;

public class TravelAgencyLogic {

	public void sortByDuration(TravelAgency agency) {

		NameOfCity tmp_nameOfCity;
		TypeOfHotel tmp_typeOfHotel;
		TypeOfTravel tmp_typeOfTravel;
		TypeOfTransport tmp_typeOfTransport;
		TypeOfFood tmp_typeOfFood;
		NumOfDays tmp_duration;
		double tmp_price;

		for (int i = 0; i < agency.getVouchers().size(); i++) {
			for (int j = 0; j < agency.getVouchers().size() - 1; j++) {
				if (agency.getVouchers().get(j).getDuration()
						.compareTo(agency.getVouchers().get(j + 1).getDuration()) > 0) {
					tmp_nameOfCity = agency.getVouchers().get(j).getNameOfCity();
					tmp_typeOfHotel = agency.getVouchers().get(j).getTypeOfHotel();
					tmp_typeOfTravel = agency.getVouchers().get(j).getTypeOfTravel();
					tmp_typeOfTransport = agency.getVouchers().get(j).getTypeOfTransport();
					tmp_typeOfFood = agency.getVouchers().get(j).getTypeOfFood();
					tmp_duration = agency.getVouchers().get(j).getDuration();
					tmp_price = agency.getVouchers().get(j).getPrice();

					agency.getVouchers().get(j).setNameOfCity(agency.getVouchers().get(j + 1).getNameOfCity());
					agency.getVouchers().get(j).setTypeOfHotel(agency.getVouchers().get(j + 1).getTypeOfHotel());
					agency.getVouchers().get(j).setTypeOfTravel(agency.getVouchers().get(j + 1).getTypeOfTravel());
					agency.getVouchers().get(j)
							.setTypeOfTransport(agency.getVouchers().get(j + 1).getTypeOfTransport());
					agency.getVouchers().get(j).setTypeOfFood(agency.getVouchers().get(j + 1).getTypeOfFood());
					agency.getVouchers().get(j).setDuration(agency.getVouchers().get(j + 1).getDuration());
					agency.getVouchers().get(j).setPrice(agency.getVouchers().get(j + 1).getPrice());

					agency.getVouchers().get(j + 1).setNameOfCity(tmp_nameOfCity);
					agency.getVouchers().get(j + 1).setTypeOfHotel(tmp_typeOfHotel);
					agency.getVouchers().get(j + 1).setTypeOfTravel(tmp_typeOfTravel);
					agency.getVouchers().get(j + 1).setTypeOfTransport(tmp_typeOfTransport);
					agency.getVouchers().get(j + 1).setTypeOfFood(tmp_typeOfFood);
					agency.getVouchers().get(j + 1).setDuration(tmp_duration);
					agency.getVouchers().get(j).setPrice(tmp_price);
				}
			}
		}
	}

	public void sortByNameOfCity(TravelAgency agency) {

		NameOfCity tmp_nameOfCity;
		TypeOfHotel tmp_typeOfHotel;
		TypeOfTravel tmp_typeOfTravel;
		TypeOfTransport tmp_typeOfTransport;
		TypeOfFood tmp_typeOfFood;
		NumOfDays tmp_duration;
		double tmp_price;

		for (int i = 0; i < agency.getVouchers().size(); i++) {
			for (int j = 0; j < agency.getVouchers().size() - 1; j++) {
				if (agency.getVouchers().get(j).getNameOfCity()
						.compareTo(agency.getVouchers().get(j + 1).getNameOfCity()) < 0) {
					tmp_nameOfCity = agency.getVouchers().get(j).getNameOfCity();
					tmp_typeOfHotel = agency.getVouchers().get(j).getTypeOfHotel();
					tmp_typeOfTravel = agency.getVouchers().get(j).getTypeOfTravel();
					tmp_typeOfTransport = agency.getVouchers().get(j).getTypeOfTransport();
					tmp_typeOfFood = agency.getVouchers().get(j).getTypeOfFood();
					tmp_duration = agency.getVouchers().get(j).getDuration();
					tmp_price = agency.getVouchers().get(j).getPrice();

					agency.getVouchers().get(j).setNameOfCity(agency.getVouchers().get(j + 1).getNameOfCity());
					agency.getVouchers().get(j).setTypeOfHotel(agency.getVouchers().get(j + 1).getTypeOfHotel());
					agency.getVouchers().get(j).setTypeOfTravel(agency.getVouchers().get(j + 1).getTypeOfTravel());
					agency.getVouchers().get(j)
							.setTypeOfTransport(agency.getVouchers().get(j + 1).getTypeOfTransport());
					agency.getVouchers().get(j).setTypeOfFood(agency.getVouchers().get(j + 1).getTypeOfFood());
					agency.getVouchers().get(j).setDuration(agency.getVouchers().get(j + 1).getDuration());
					agency.getVouchers().get(j).setPrice(agency.getVouchers().get(j + 1).getPrice());

					agency.getVouchers().get(j + 1).setNameOfCity(tmp_nameOfCity);
					agency.getVouchers().get(j + 1).setTypeOfHotel(tmp_typeOfHotel);
					agency.getVouchers().get(j + 1).setTypeOfTravel(tmp_typeOfTravel);
					agency.getVouchers().get(j + 1).setTypeOfTransport(tmp_typeOfTransport);
					agency.getVouchers().get(j + 1).setTypeOfFood(tmp_typeOfFood);
					agency.getVouchers().get(j + 1).setDuration(tmp_duration);
					agency.getVouchers().get(j).setPrice(tmp_price);
				}
			}
		}
	}

	public void sortByTransport(TravelAgency agency) {

		NameOfCity tmp_nameOfCity;
		TypeOfHotel tmp_typeOfHotel;
		TypeOfTravel tmp_typeOfTravel;
		TypeOfTransport tmp_typeOfTransport;
		TypeOfFood tmp_typeOfFood;
		NumOfDays tmp_duration;
		double tmp_price;

		for (int i = 0; i < agency.getVouchers().size(); i++) {
			for (int j = 0; j < agency.getVouchers().size() - 1; j++) {
				if (agency.getVouchers().get(j).getTypeOfTransport()
						.compareTo(agency.getVouchers().get(j + 1).getTypeOfTransport()) > 0) {
					tmp_nameOfCity = agency.getVouchers().get(j).getNameOfCity();
					tmp_typeOfHotel = agency.getVouchers().get(j).getTypeOfHotel();
					tmp_typeOfTravel = agency.getVouchers().get(j).getTypeOfTravel();
					tmp_typeOfTransport = agency.getVouchers().get(j).getTypeOfTransport();
					tmp_typeOfFood = agency.getVouchers().get(j).getTypeOfFood();
					tmp_duration = agency.getVouchers().get(j).getDuration();
					tmp_price = agency.getVouchers().get(j).getPrice();

					agency.getVouchers().get(j).setNameOfCity(agency.getVouchers().get(j + 1).getNameOfCity());
					agency.getVouchers().get(j).setTypeOfHotel(agency.getVouchers().get(j + 1).getTypeOfHotel());
					agency.getVouchers().get(j).setTypeOfTravel(agency.getVouchers().get(j + 1).getTypeOfTravel());
					agency.getVouchers().get(j)
							.setTypeOfTransport(agency.getVouchers().get(j + 1).getTypeOfTransport());
					agency.getVouchers().get(j).setTypeOfFood(agency.getVouchers().get(j + 1).getTypeOfFood());
					agency.getVouchers().get(j).setDuration(agency.getVouchers().get(j + 1).getDuration());
					agency.getVouchers().get(j).setPrice(agency.getVouchers().get(j + 1).getPrice());

					agency.getVouchers().get(j + 1).setNameOfCity(tmp_nameOfCity);
					agency.getVouchers().get(j + 1).setTypeOfHotel(tmp_typeOfHotel);
					agency.getVouchers().get(j + 1).setTypeOfTravel(tmp_typeOfTravel);
					agency.getVouchers().get(j + 1).setTypeOfTransport(tmp_typeOfTransport);
					agency.getVouchers().get(j + 1).setTypeOfFood(tmp_typeOfFood);
					agency.getVouchers().get(j + 1).setDuration(tmp_duration);
					agency.getVouchers().get(j).setPrice(tmp_price);
				}
			}
		}
	}

	public TravelAgency findVoucherOfNameOfCity(TravelAgency agency, NameOfCity nameOfCity) {
		TravelAgency newAgency = new TravelAgency();
		for (int i = 0; i < agency.getVouchers().size(); i++) {
			if (agency.getVouchers().get(i).getNameOfCity().compareTo(nameOfCity) == 0) {
				newAgency.addVoucher(agency.getVouchers().get(i));
			}
		}
		if (newAgency.getVouchers().size() == 0)
			return null;
		return newAgency;
	}

	public TravelAgency findVoucherOfTypeOfTravel(TravelAgency agency, TypeOfTravel typeOfTravel) {
		TravelAgency newAgency = new TravelAgency();
		for (int i = 0; i < agency.getVouchers().size(); i++) {
			if (agency.getVouchers().get(i).getTypeOfTravel().compareTo(typeOfTravel) == 0) {
				newAgency.addVoucher(agency.getVouchers().get(i));
			}
		}
		if (newAgency.getVouchers().size() == 0)
			return null;
		return newAgency;
	}
}
