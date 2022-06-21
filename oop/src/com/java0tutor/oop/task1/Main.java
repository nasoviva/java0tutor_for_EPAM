package com.java0tutor.oop.task1;

import java.util.ArrayList;
import java.util.List;

import com.java0tutor.oop.task1.entity.Directory;
import com.java0tutor.oop.task1.entity.File;
import com.java0tutor.oop.task1.entity.TextFile;
import com.java0tutor.oop.task1.view.View;

//Basics of OOP. Задание 1:
//Создать объект класса Текстовый файл, используя классы Файл, Директория. 
//Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

public class Main {

	public static void main(String[] args) {
		View view = new View();

		File file1 = new TextFile("файл1", "содержимое1");
		File file2 = new TextFile("файл2", "содержимое2");
		File file3 = new TextFile("файл3", "содержимое3");

		List<File> files = new ArrayList<File>();
		files.add(file1);
		files.add(file2);
		files.add(file3);
		Directory dir = new Directory("папка", files);
		System.out.println("Содержимое папки:\n");
		view.printDirectory(dir);

		System.out.println("\nСоздадим файлы:\n");
		TextFile file4 = dir.createTextFile("файл4", "aaaaaaaaaaa");
		File file5 = dir.createFile("файл5");
		view.printTextFile(file4);
		view.printFile(file5);

		System.out.println("\nПереименуем файлы:\n");
		file4.rename("новыйфайл4");
		file5.rename("новыйфайл5");
		view.printTextFile(file4);
		view.printFile(file5);

		System.out.println("\nДополним текстовый файл:\n");
		file4.addContent("bbbbbbbbbbb");
		view.printContent(file4);

		System.out.println("\nУдалим файл и выведем содержимое папки:\n");
		dir.deleteFile("файл1");
		view.printDirectory(dir);

	}

}
