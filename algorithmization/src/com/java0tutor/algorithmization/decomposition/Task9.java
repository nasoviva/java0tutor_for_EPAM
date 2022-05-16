package com.java0tutor.algorithmization.decomposition;

public class Task9 {

	// Декомпозиция с использованием методов. Задание 9:
	// Даны числа X, Y, Z, Т — длины сторон четырехугольника.
	// Написать метод(методы) вычисления его площади, если угол между сторонами
	// длиной X и Y— прямой.

	private int x;
	private int y;
	private int z;
	private int t;

	public Task9() {

	}

	public Task9(int x, int y, int z, int t) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
		this.t = t;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public void result() {
		double area;
		double triangle1;
		double triangle2;
		double diag;

		diag = findHypotenuse(x, y);
		triangle1 = findAreaOfTriangle(x, y, diag);
		triangle2 = findAreaOfTriangle(t, z, diag);
		area = findAreaOfQuadrilateral(triangle1, triangle2);
		System.out.format("Площадь четырехугольника со сторонами %d, %d, %d, %d = %.3f", x, y, z, t, area);
	}

	public double findHypotenuse(int a, int b) {
		return Math.sqrt(a * a + b * b);
	}

	public double findAreaOfTriangle(double a, double b, double c) {
		double perimetr;

		perimetr = 0.5 * (a + b + c);
		return Math.sqrt(perimetr * (perimetr - a) * (perimetr - b) * (perimetr - c));
	}

	public double findAreaOfQuadrilateral(double x, double y) {
		return x + y;
	}

	public static void main(String[] args) {
		Task9 task = new Task9(3, 4, 6, 8);
		task.result();
	}

}
