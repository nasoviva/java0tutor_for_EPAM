package com.java0tutor.oop.task4.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.java0tutor.oop.task4.controller.impl.ControllerImpl;

public class ConsolMenu {

	private List<String> menu = new ArrayList<>();
	private List<String> command = new ArrayList<>();

	public void add(String newMenu, String newCommand) {
		menu.add(newMenu);
		command.add(newCommand);
	}

	public void viewMenu(int button) {

		Reader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		ControllerImpl c = new ControllerImpl();
		int sum;

		if (button == 3) {
			System.out.print("\nВведите сумму: ");
			try {
				String s = bufferedReader.readLine();
				if (isValid(s)) {
					sum = Integer.parseInt(s);
					System.out.println(menu.get(button - 1) + " " + Integer.toString(sum) + ":");
					c.doAction(command.get(button - 1) + "," + Integer.toString(sum));
				} else {
					System.err.println("ошибка");
				}
			} catch (IOException e) {
				System.err.println("ошибка");
			}

		} else if (button > 0 && button < menu.size()) {
			System.out.println(menu.get(button - 1) + ":");
			c.doAction(command.get(button - 1));
		}
	}

	private static boolean isValid(String str) {
		int i;

		i = 0;
		while (i < str.length()) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
			i++;
		}
		if (i > 9)
			return false;
		return true;
	}

}
