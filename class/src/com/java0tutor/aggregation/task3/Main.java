package com.java0tutor.aggregation.task3;

import java.util.ArrayList;
import java.util.List;

import com.java0tutor.aggregation.task3.entity.Area;
import com.java0tutor.aggregation.task3.entity.City;
import com.java0tutor.aggregation.task3.entity.Region;
import com.java0tutor.aggregation.task3.entity.State;
import com.java0tutor.aggregation.task3.view.View;

//Programming with classes. Агрегация и композиция. Задание 3:
//Создать объект класса Государство, используя классы Область, Район, Город. 
//Методы: вывести на консоль столицу, количество областей, площадь, областные центры.

public class Main {

	public static void main(String[] args) {
		View view = new View();
		List<Area> areasOfSulin = new ArrayList<Area>();
		Area gorn = new Area("Горняцкий", 10, 6000);
		Area verb = new Area("Вербенка", 30, 4000);
		Area skel = new Area("Скелеватка", 20, 5000);
		areasOfSulin.add(gorn);
		areasOfSulin.add(verb);
		areasOfSulin.add(skel);
		City sulin = new City("Сулин", 93, 37000, areasOfSulin);

		List<Area> areasOfRostov = new ArrayList<Area>();
		Area zapad = new Area("Западный", 10, 6000);
		Area sever = new Area("Северный", 30, 4000);
		Area levob = new Area("Левобережный", 20, 5000);
		areasOfRostov.add(zapad);
		areasOfRostov.add(sever);
		areasOfRostov.add(levob);
		City rostov = new City("Ростов-на-Дону", 354, 1100000, areasOfRostov);

		List<City> cities = new ArrayList<City>();
		cities.add(sulin);
		cities.add(rostov);

		List<Area> areasOMoscow = new ArrayList<Area>();
		Area maryino = new Area("Марьино", 12, 252623);
		Area otradnoye = new Area("Отрадное", 10, 185218);
		Area arbat = new Area("Арбат", 2.11, 35800);
		areasOMoscow.add(maryino);
		areasOMoscow.add(otradnoye);
		areasOMoscow.add(arbat);
		City moscow = new City("Москва", 2561, 17400000, areasOMoscow);

		List<Area> areasOfOdintsovo = new ArrayList<Area>();
		Area centr = new Area("Центральный", 10, 6000);
		Area privokz = new Area("Привокзальный", 30, 4000);
		Area severny = new Area("Северный", 20, 5000);
		areasOfOdintsovo.add(centr);
		areasOfOdintsovo.add(privokz);
		areasOfOdintsovo.add(severny);
		City odintsovo = new City("Одинцово", 354, 1100000, areasOfOdintsovo);

		List<City> cities2 = new ArrayList<City>();
		cities2.add(moscow);
		cities2.add(odintsovo);

		Region rostovskayaRegion = new Region("Ростовская область", rostov, 100800, 4153763, cities);
		Region moscowRegion = new Region("Московская область", moscow, 100800, 4153763, cities2);
		List<Region> regions = new ArrayList<Region>();
		regions.add(rostovskayaRegion);
		regions.add(moscowRegion);

		State state = new State("Россия", moscow, 17100000, 144100000, regions);
		view.printCapitalOfState(state);
		view.printnumOfRegions(state);
		view.printsquareOfState(state);
		view.printsCapitalsOfRegions(state);
	}

}
