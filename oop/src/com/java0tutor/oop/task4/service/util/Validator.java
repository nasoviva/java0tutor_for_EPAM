package com.java0tutor.oop.task4.service.util;

public class Validator {
	public static boolean isValid(String str) {
		String[] tmp;
		int i;

		tmp = str.split(",");
		i = 0;
		if (tmp.length != 2) {
			return false;
		}
		while (i < tmp[1].length()) {
			if (tmp[1].charAt(i) < '0' || tmp[1].charAt(i) > '9') {
				return false;
			}
			i++;
		}
		return true;
	}
}
