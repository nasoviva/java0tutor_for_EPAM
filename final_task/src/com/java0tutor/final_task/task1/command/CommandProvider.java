package com.java0tutor.final_task.task1.command;

import java.util.HashMap;
import java.util.Map;

import com.java0tutor.final_task.task1.command.impl.AddBookInCatalog;
import com.java0tutor.final_task.task1.command.impl.BlockUser;
import com.java0tutor.final_task.task1.command.impl.ChangeUserInfo;
import com.java0tutor.final_task.task1.command.impl.CloseSystem;
import com.java0tutor.final_task.task1.command.impl.LogInAdmin;
import com.java0tutor.final_task.task1.command.impl.LogInUser;
import com.java0tutor.final_task.task1.command.impl.LogOut;
import com.java0tutor.final_task.task1.command.impl.RegistrationUser;
import com.java0tutor.final_task.task1.command.impl.RemoveBookFromCatalog;
import com.java0tutor.final_task.task1.command.impl.SearchBookByDescription;
import com.java0tutor.final_task.task1.command.impl.SearchBooksByAuthor;
import com.java0tutor.final_task.task1.command.impl.SearchBooksByTitle;
import com.java0tutor.final_task.task1.command.impl.SortBooksByAuthor;
import com.java0tutor.final_task.task1.command.impl.SortBooksById;
import com.java0tutor.final_task.task1.command.impl.SuggestAddBook;
import com.java0tutor.final_task.task1.command.impl.UnBlockUser;
import com.java0tutor.final_task.task1.command.impl.ViewCatalog;

public class CommandProvider {

	private Map<String, Command> commands;

	public CommandProvider() {

		commands = new HashMap<String, Command>();

		commands.put("registration", new RegistrationUser());
		commands.put("login user", new LogInUser());
		commands.put("login admin", new LogInAdmin());
		commands.put("logout", new LogOut());
		commands.put("block user", new BlockUser());
		commands.put("unblock user", new UnBlockUser());
		commands.put("change info about user", new ChangeUserInfo());
		commands.put("view catalog", new ViewCatalog());
		commands.put("sort books by id", new SortBooksById());
		commands.put("sort books by author", new SortBooksByAuthor());
		commands.put("search book by title", new SearchBooksByTitle());
		commands.put("search book by author", new SearchBooksByAuthor());
		commands.put("search book by description", new SearchBookByDescription());
		commands.put("add book in catalog", new AddBookInCatalog());
		commands.put("remove book from catalog by id", new RemoveBookFromCatalog());
		commands.put("close system", new CloseSystem());
		commands.put("suggest add book in catalog", new SuggestAddBook());
	}

	public Command getCommand(String commandName) {
		Command command;
		command = commands.get(commandName);
		return command;
	}

}
