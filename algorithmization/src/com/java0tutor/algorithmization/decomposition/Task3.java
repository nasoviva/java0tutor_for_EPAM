package com.java0tutor.algorithmization.decomposition;

public class Task3 {

	// Декомпозиция с использованием методов. Задание 3:
	// Вычислить площадь правильного шестиугольника со стороной а, используя метод
	// вычисления площади треугольника.

	private double area;

	public Task3() {

	}

	public Task3(double area) {
		super();
		this.area = area;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double findTriangleArea(double a) {
		double area;
		double h;

		h = (a * Math.sqrt(3.0)) / 2.0;
		area = 1.0 / 2.0 * a * h;
		return area;
	}

	public double findHexagonArea() {
		return findTriangleArea(area) * 6;
	}

	public static void main(String[] args) {
		Task3 task = new Task3(20);

		System.out.print("Площадь правильного шестиугольника со стороной ");
		System.out.format("%.0f = %.4f", task.getArea(), task.findHexagonArea());
	}
}
