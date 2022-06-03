package com.java0tutor.simpleClass.task6;

import com.java0tutor.simpleClass.task6.entity.Time;
import com.java0tutor.simpleClass.task6.logic.TimeLogic;
import com.java0tutor.simpleClass.task6.view.View;

//Programming with classes. Простейшие классы и объекты. Задание 6:
//Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. 
//В случае недопустимых значений полей поле устанавливается в значение 0. 
//Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Main {

	public static void main(String[] args) {
		View view = new View();
		Time time = new Time(3, 1, 3);
		TimeLogic changeTime = new TimeLogic();
		int changeHour;
		int changeMin;
		int changeSec;

		view.printCurrentTime(time);
		time.setHour(3);
		time.setMin(23);
		time.setSec(33);
		view.printCurrentTime(time);
		time = new Time(2, 160, 3);
		view.printCurrentTime(time);

		changeHour = view.inputTime("На сколько часов увеличить текущее время? Введите число: ");
		changeMin = view.inputTime("На сколько минут увеличить текущее время? Введите число: ");
		changeSec = view.inputTime("На сколько секунд увеличить текущее время? Введите число: ");
		changeTime.increaseCurrentTime(time, changeHour, changeMin, changeSec);
		view.printCurrentTime(time);

		changeHour = view.inputTime("На сколько часов уменьшить текущее время? Введите число: ");
		changeMin = view.inputTime("На сколько минут уменьшить текущее время? Введите число: ");
		changeSec = view.inputTime("На сколько секунд уменьшить текущее время? Введите число: ");
		changeTime.decreaseCurrentTime(time, changeHour, changeMin, changeSec);
		view.printCurrentTime(time);
	}

}
