package com.java0tutor.aggregation.task3.view;

import com.java0tutor.aggregation.task3.entity.State;

public class View {

	public void printCapitalOfState(State state) {
		System.out.println("Столица: " + state.getCapital().getName());
	}

	public void printnumOfRegions(State state) {
		System.out.println("Количество областей: " + state.getRegions().size());
	}

	public void printsquareOfState(State state) {
		System.out.printf("Площадь: %.0f кв.км\n", state.getSquare());
	}

	public void printsCapitalsOfRegions(State state) {
		System.out.print("Областные центры: ");
		for (int i = 0; i < state.getRegions().size() - 1; i++) {
			System.out.print(state.getRegions().get(i).getCapital().getName() + ", ");
		}
		System.out.println(state.getRegions().get(state.getRegions().size() - 1).getCapital().getName());
	}
}
