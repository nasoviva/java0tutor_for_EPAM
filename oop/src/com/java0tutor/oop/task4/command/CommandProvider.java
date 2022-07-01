package com.java0tutor.oop.task4.command;

import java.util.HashMap;
import java.util.Map;

import com.java0tutor.oop.task4.command.impl.FindTreasuresForPrice;
import com.java0tutor.oop.task4.command.impl.MostExpensiveTreasure;
import com.java0tutor.oop.task4.command.impl.ViewAllTreasuresCommand;

public class CommandProvider {

	private Map<String, Command> commands;

	public CommandProvider() {

		commands = new HashMap<String, Command>();

		commands.put("view all treasures", new ViewAllTreasuresCommand());
		commands.put("find the most expensive treasure", new MostExpensiveTreasure());
		commands.put("find treasures for price", new FindTreasuresForPrice());

	}

	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		return command;
	}

}
