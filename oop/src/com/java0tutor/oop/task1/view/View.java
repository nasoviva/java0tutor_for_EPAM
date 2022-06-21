package com.java0tutor.oop.task1.view;

import com.java0tutor.oop.task1.entity.Directory;
import com.java0tutor.oop.task1.entity.File;
import com.java0tutor.oop.task1.entity.TextFile;

public class View {

	public void printTextFile(TextFile file) {
		System.out.println("Имя файла: " + file.getName());
		System.out.println("Разрешение файла: " + file.getResolution());
		System.out.println("Содержимое файла: " + file.getContent());
	}

	public void printFile(File file) {
		System.out.println("Имя файла: " + file.getName());
	}

	public void printContent(TextFile file) {
		System.out.println(file.getContent());
	}

	public void printDirectory(Directory dir) {
		System.out.println("Имя папки: " + dir.getName());
		for (int i = 0; i < dir.getFiles().size(); i++) {
			System.out.println("Имя файла: " + dir.getFiles().get(i).getName());
		}
	}
}
