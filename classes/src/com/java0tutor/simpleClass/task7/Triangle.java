package com.java0tutor.simpleClass.task7;

//Programming with classes. Простейшие классы и объекты. Задание 7:
//Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

public class Triangle {
	private double aX;
	private double aY;
	private double bX;
	private double bY;
	private double cX;
	private double cY;

	private Coordinate point_a;
	private Coordinate point_b;
	private Coordinate point_c;

	private double sideAB;
	private double sideBC;
	private double sideCA;

	public Triangle() {
		createTriangle();
	}

	public Triangle(double aX, double aY, double bX, double bY, double cX, double cY) {
		super();
		this.aX = aX;
		this.aY = aY;
		this.bX = bX;
		this.bY = bY;
		this.cX = cX;
		this.cY = cY;
		createTriangle();
	}

	public double getaX() {
		return aX;
	}

	public void setaX(double aX) {
		this.aX = aX;
		createTriangle();
	}

	public double getaY() {
		return aY;
	}

	public void setaY(double aY) {
		this.aY = aY;
		createTriangle();
	}

	public double getbX() {
		return bX;
	}

	public void setbX(double bX) {
		this.bX = bX;
		createTriangle();
	}

	public double getbY() {
		return bY;
	}

	public void setbY(double bY) {
		this.bY = bY;
		createTriangle();
	}

	public double getcX() {
		return cX;
	}

	public void setcX(double cX) {
		this.cX = cX;
		createTriangle();
	}

	public double getcY() {
		return cY;
	}

	public void setcY(double cY) {
		this.cY = cY;
		createTriangle();
	}

	public double getSideAB() {
		return sideAB;
	}

	public double getSideBC() {
		return sideBC;
	}

	public double getSideCA() {
		return sideCA;
	}

	private void createTriangle() {
		point_a = new Coordinate(aX, aY);
		point_b = new Coordinate(bX, bY);
		point_c = new Coordinate(cX, cY);
		sideAB = findTriangleSide(point_a, point_b);
		sideBC = findTriangleSide(point_b, point_c);
		sideCA = findTriangleSide(point_c, point_a);
		if (sideAB + sideBC <= sideCA || sideBC + sideCA <= sideAB || sideCA + sideAB <= sideBC) {
			sideAB = sideBC = sideCA = 0;
		}
	}

	private double findTriangleSide(Coordinate x, Coordinate y) {
		double side = Math.sqrt(Math.pow((y.getX() - x.getX()), 2) + Math.pow((y.getY() - x.getY()), 2));
		return side;
	}

	public double findTriangleArea() {
		double area;
		double semiPerimeter;

		semiPerimeter = findTrianglePerimeter() / 2;
		area = Math
				.sqrt(semiPerimeter * (semiPerimeter - sideAB) * (semiPerimeter - sideBC) * (semiPerimeter - sideCA));
		return area;
	}

	public double findTrianglePerimeter() {
		return sideAB + sideBC + sideCA;
	}

	public Coordinate findTrianglePointOfMedians() {
		Coordinate point = new Coordinate();
		double coordinate_x;
		double coordinate_y;

		coordinate_x = (point_a.getX() + point_b.getX() + point_c.getX()) / 3;
		coordinate_y = (point_a.getY() + point_b.getY() + point_c.getY()) / 3;
		point = new Coordinate(coordinate_x, coordinate_y);
		return point;
	}

	@Override
	public String toString() {
		return "[aX=" + aX + ", aY=" + aY + ", bX=" + bX + ", bY=" + bY + ", cX=" + cX + ", cY=" + cY + "]";
	}

}
