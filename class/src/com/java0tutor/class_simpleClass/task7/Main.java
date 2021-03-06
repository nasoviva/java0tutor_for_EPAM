package com.java0tutor.class_simpleClass.task7;

import com.java0tutor.class_simpleClass.task7.entity.Coordinate;
import com.java0tutor.class_simpleClass.task7.entity.Triangle;
import com.java0tutor.class_simpleClass.task7.logic.TriangleLogic;

public class Main {

	public static void main(String[] args) {
		Triangle t;
		TriangleLogic action = new TriangleLogic();

		t = new Triangle(new Coordinate(0, 0), new Coordinate(50, 55), new Coordinate(2, 25));
		System.out.printf("Площадь треугольника = %.3f\n", action.findTriangleArea(t));
		System.out.printf("Периметр треугольника = %.3f\n", action.findTrianglePerimeter(t));
		System.out.printf("Точка пересечения медиан треугольника = %.3f, %.3f\n",
				action.findTrianglePointOfMedians(t).getX(), action.findTrianglePointOfMedians(t).getY());
	}
}
