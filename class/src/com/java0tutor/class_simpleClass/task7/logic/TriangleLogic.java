package com.java0tutor.class_simpleClass.task7.logic;

import com.java0tutor.class_simpleClass.task7.entity.Coordinate;
import com.java0tutor.class_simpleClass.task7.entity.Triangle;

public class TriangleLogic {

	public double findTriangleArea(Triangle t) {
		double area;
		double semiPerimeter;

		semiPerimeter = findTrianglePerimeter(t) / 2;
		area = Math.sqrt(semiPerimeter * (semiPerimeter - t.getSideAB()) * (semiPerimeter - t.getSideBC())
				* (semiPerimeter - t.getSideCA()));
		return area;
	}

	public double findTrianglePerimeter(Triangle t) {
		double perimeter = t.getSideAB() + t.getSideBC() + t.getSideCA();
		return perimeter;
	}

	public Coordinate findTrianglePointOfMedians(Triangle t) {
		Coordinate point = new Coordinate();
		double coordinate_x;
		double coordinate_y;

		if (t.getSideAB() + t.getSideBC() <= t.getSideCA() || t.getSideBC() + t.getSideCA() <= t.getSideAB()
				|| t.getSideCA() + t.getSideAB() <= t.getSideBC()) {
			return point;
		}

		coordinate_x = (t.getPoint_a().getX() + t.getPoint_b().getX() + t.getPoint_c().getX()) / 3;
		coordinate_y = (t.getPoint_a().getY() + t.getPoint_b().getY() + t.getPoint_c().getY()) / 3;
		point = new Coordinate(coordinate_x, coordinate_y);
		return point;
	}

}
