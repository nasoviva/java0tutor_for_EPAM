package com.java0tutor.final_task.task1.service.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.java0tutor.final_task.task1.bean.TypeOfBook;

public class Validator {

	public static String separator = ";\\s*";

	public static boolean isValidFile(String str) {
		String[] tmp;
		int i;

		tmp = str.split(separator);
		i = 0;
		if (tmp.length != 5) {
			return false;
		}

		while (i < tmp[0].length()) {
			if (tmp[0].charAt(i) < '0' || tmp[0].charAt(i) > '9') {
				return false;
			}
			i++;
		}
		if (tmp[1].toUpperCase().equals(TypeOfBook.EBOOK.name())
				|| tmp[1].toUpperCase().equals(TypeOfBook.PAPERBOOK.name())) {
			return true;
		}
		return false;
	}

	public static boolean isValidId(String str) {
		int i;

		i = 0;
		while (i < str.length()) {
			if (str.charAt(i) < '0' || str.charAt(i) > '9') {
				return false;
			}
			i++;
		}
		return true;
	}

	public static boolean isValidUser(String str) {
		String[] tmp;
		int i;

		tmp = str.split(separator);
		i = 0;
		if (tmp.length != 8) {
			return false;
		}
		if (tmp[1].length() < 1 || tmp[1].length() > 20) {
			return false;
		}
		if (tmp[2].length() < 4 || tmp[2].length() > 10) {
			return false;
		}
		if (tmp[3].length() < 1 || tmp[3].length() > 20) {
			return false;
		}
		if (tmp[4].length() < 1 || tmp[4].length() > 20) {
			return false;
		}
		while (i < tmp[1].length()) {
			if ((tmp[1].toLowerCase().charAt(i) < 'a' || tmp[1].toLowerCase().charAt(i) > 'z')
					&& (tmp[1].charAt(i) < '0' || tmp[1].charAt(i) > '9')) {
				return false;
			}
			i++;
		}
		if (!isValidEmail(tmp[5])) {
			return false;
		}
		return true;
	}

	public static boolean isValidLoginPassword(String str) {
		String[] tmp;

		tmp = str.split(separator);
		if (tmp.length != 2) {
			return false;
		}
		if (tmp[0].length() < 1 || tmp[0].length() > 20) {
			return false;
		}
		if (tmp[1].length() < 4 || tmp[1].length() > 10) {
			return false;
		}

		return true;
	}

	public static boolean isValidData(String str) {
		String[] tmp;

		tmp = str.split(separator);
		if (tmp.length > 0) {
			if (tmp[0].length() < 1 || tmp[0].length() > 20) {
				return false;
			}
			return true;
		}
		return false;
	}

	public static boolean isValidEmail(String str) {
		Pattern pattern;
		Matcher matcher;

		pattern = Pattern.compile("\\w{1,20}@\\w{2,20}\\.[a-zA-Z]{2,3}");
		matcher = pattern.matcher(str);
		if (matcher.find()) {
			return true;
		}
		return false;
	}

}
