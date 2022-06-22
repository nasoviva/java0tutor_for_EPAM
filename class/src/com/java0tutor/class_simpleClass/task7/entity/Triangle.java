package com.java0tutor.class_simpleClass.task7.entity;

public class Triangle {
	private Coordinate point_a;
	private Coordinate point_b;
	private Coordinate point_c;

	private double sideAB;
	private double sideBC;
	private double sideCA;

	public Triangle() {
		point_a = new Coordinate();
		point_b = new Coordinate();
		point_c = new Coordinate();
	}

	public Triangle(Coordinate point_a, Coordinate point_b, Coordinate point_c) {
		super();
		this.point_a = point_a;
		this.point_b = point_b;
		this.point_c = point_c;
		sideAB = Math
				.sqrt(Math.pow((point_b.getX() - point_a.getX()), 2) + Math.pow((point_b.getY() - point_a.getY()), 2));
		sideBC = Math
				.sqrt(Math.pow((point_c.getX() - point_b.getX()), 2) + Math.pow((point_c.getY() - point_b.getY()), 2));
		sideCA = Math
				.sqrt(Math.pow((point_a.getX() - point_c.getX()), 2) + Math.pow((point_a.getY() - point_c.getY()), 2));
		if (sideAB + sideBC <= sideCA || sideBC + sideCA <= sideAB || sideCA + sideAB <= sideBC) {
			sideAB = sideBC = sideCA = 0;
		}
	}

	public Coordinate getPoint_a() {
		return point_a;
	}

	public void setPoint_a(Coordinate point_a) {
		this.point_a = point_a;
		sideAB = Math
				.sqrt(Math.pow((point_b.getX() - point_a.getX()), 2) + Math.pow((point_b.getY() - point_a.getY()), 2));
		sideCA = Math
				.sqrt(Math.pow((point_a.getX() - point_c.getX()), 2) + Math.pow((point_a.getY() - point_c.getY()), 2));
		if (sideAB + sideBC <= sideCA || sideBC + sideCA <= sideAB || sideCA + sideAB <= sideBC) {
			sideAB = sideBC = sideCA = 0;
		}
	}

	public Coordinate getPoint_b() {
		return point_b;
	}

	public void setPoint_b(Coordinate point_b) {
		this.point_b = point_b;
		sideAB = Math
				.sqrt(Math.pow((point_b.getX() - point_a.getX()), 2) + Math.pow((point_b.getY() - point_a.getY()), 2));
		sideBC = Math
				.sqrt(Math.pow((point_c.getX() - point_b.getX()), 2) + Math.pow((point_c.getY() - point_b.getY()), 2));
		if (sideAB + sideBC <= sideCA || sideBC + sideCA <= sideAB || sideCA + sideAB <= sideBC) {
			sideAB = sideBC = sideCA = 0;
		}
	}

	public Coordinate getPoint_c() {
		return point_c;
	}

	public void setPoint_c(Coordinate point_c) {
		this.point_c = point_c;
		sideBC = Math
				.sqrt(Math.pow((point_c.getX() - point_b.getX()), 2) + Math.pow((point_c.getY() - point_b.getY()), 2));
		sideCA = Math
				.sqrt(Math.pow((point_a.getX() - point_c.getX()), 2) + Math.pow((point_a.getY() - point_c.getY()), 2));
		if (sideAB + sideBC <= sideCA || sideBC + sideCA <= sideAB || sideCA + sideAB <= sideBC) {
			sideAB = sideBC = sideCA = 0;
		}
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((point_a == null) ? 0 : point_a.hashCode());
		result = prime * result + ((point_b == null) ? 0 : point_b.hashCode());
		result = prime * result + ((point_c == null) ? 0 : point_c.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sideAB);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideBC);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(sideCA);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triangle other = (Triangle) obj;
		if (point_a == null) {
			if (other.point_a != null)
				return false;
		} else if (!point_a.equals(other.point_a))
			return false;
		if (point_b == null) {
			if (other.point_b != null)
				return false;
		} else if (!point_b.equals(other.point_b))
			return false;
		if (point_c == null) {
			if (other.point_c != null)
				return false;
		} else if (!point_c.equals(other.point_c))
			return false;
		if (Double.doubleToLongBits(sideAB) != Double.doubleToLongBits(other.sideAB))
			return false;
		if (Double.doubleToLongBits(sideBC) != Double.doubleToLongBits(other.sideBC))
			return false;
		if (Double.doubleToLongBits(sideCA) != Double.doubleToLongBits(other.sideCA))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triangle [point_a=" + point_a + ", point_b=" + point_b + ", point_c=" + point_c + ", sideAB=" + sideAB
				+ ", sideBC=" + sideBC + ", sideCA=" + sideCA + "]";
	}

}
