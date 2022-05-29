package com.java0tutor.simpleClass.task7;

public class Main {

	public static void main(String[] args) {
		Triangle t;

		t = new Triangle(0, 0, 50, 50, 2, 25);
		System.out.println("Координаты вершин треугольника = " + t);
		System.out.println("Площадь треугольника = " + t.findTriangleArea());
		System.out.println("Периметр треугольника = " + t.findTrianglePerimeter());
		System.out.println("Точка пересечения медиан треугольника = " + t.findTrianglePointOfMedians());
		t.setbY(55);
		System.out.println();
		System.out.println("Координаты вершин треугольника = " + t);
		System.out.println("Площадь треугольника = " + t.findTriangleArea());
		System.out.println("Периметр треугольника = " + t.findTrianglePerimeter());
		System.out.println("Точка пересечения медиан треугольника = " + t.findTrianglePointOfMedians());
	}
}
