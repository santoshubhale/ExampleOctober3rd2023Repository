package com.sgtesting.polymorphism;

abstract class Figer {
	abstract void calculation();
}

class Square extends Figer {

	@Override
	void calculation() {
		int side = 10;
		System.out.println("Square result" + (side * side));

	}

}
class Rectangle extends Figer {

	@Override
	void calculation() {
		int l = 10;
		int b = 20;
		int res = l * b;
		System.out.println("Rectangle Result" + res);

	}

}

class Circle extends Figer {

	@Override
	void calculation() {
		double pi = 3.142;
		int r = 10;
		double res = pi * r * r;
		System.out.println("Circle result" + res);

	}

}

public class PolymorphismDemo {

	public static void main(String[] args) {
		Figer figer = null;
		Square s = new Square();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		figer=s;
		s.calculation();
		figer=r;
		r.calculation();
		figer=c;
		c.calculation();
	}

}
