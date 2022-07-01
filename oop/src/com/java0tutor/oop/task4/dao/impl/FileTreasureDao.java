package com.java0tutor.oop.task4.dao.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.java0tutor.oop.task4.bean.CaveOfDragon;
import com.java0tutor.oop.task4.bean.Treasure;
import com.java0tutor.oop.task4.dao.DaoException;
import com.java0tutor.oop.task4.dao.TreasureDao;
import com.java0tutor.oop.task4.service.util.Validator;

public class FileTreasureDao implements TreasureDao {

	private static final File TREASURE_SOURCE = new File("./src/com/java0tutor/oop/task4/source/file.txt");

	@Override
	public CaveOfDragon getTreasuresOfDragon() throws DaoException {

		CaveOfDragon cave = new CaveOfDragon();
		BufferedReader reader;
		String treasure;
		double price;
		String tmp;

		try {
			FileReader fileReader = new FileReader(TREASURE_SOURCE);
			reader = new BufferedReader(fileReader);
			while (reader.ready()) {
				tmp = reader.readLine();
				if (Validator.isValid(tmp)) {
					treasure = tmp.split(",")[0];
					price = Double.valueOf(tmp.split(",")[1]);
					cave.add(new Treasure(treasure, Double.valueOf(price)));
				} else if (tmp.length() > 0) {
					cave.add(new Treasure(tmp.split(",")[0], 0));
				}
			}
			reader.close();
		} catch (FileNotFoundException e) {
			throw new DaoException(e);
		} catch (IOException e) {
			throw new DaoException(e);
		}
		return cave;
	}

}
