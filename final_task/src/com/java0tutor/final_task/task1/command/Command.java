package com.java0tutor.final_task.task1.command;

import com.java0tutor.final_task.task1.presentation.BookPresentation;
import com.java0tutor.final_task.task1.presentation.PresentationProvider;
import com.java0tutor.final_task.task1.presentation.UserPresentation;
import com.java0tutor.final_task.task1.service.BookService;
import com.java0tutor.final_task.task1.service.ServiceException;
import com.java0tutor.final_task.task1.service.ServiceProvider;
import com.java0tutor.final_task.task1.service.UserService;

public interface Command {
	static final ServiceProvider serviceProvider = ServiceProvider.getInstance();
	static final BookService bookService = serviceProvider.getBookService();
	static final UserService userService = serviceProvider.getUserService();
	static final PresentationProvider presentationProvider = PresentationProvider.getInstance();
	static final BookPresentation bookPresentation = presentationProvider.getBookPresentation();
	static final UserPresentation userPresentation = presentationProvider.getUserPresentation();

	boolean execute(String request) throws ServiceException;
}
