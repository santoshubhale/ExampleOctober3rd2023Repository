package com.sgtesting.constructor;

class X {
	X(int age) {
		System.out.println("Age  = " + age);
	}

	X(String name) {
		this(27);
		System.out.println("Name = " + name);
	}

	X(double salary) {
		this("Santosh");
		System.out.println("Salary = " + salary);
	}
}

public class ConstructorChainingDemo2 {

	public static void main(String[] args) {
		X x = new X(100000.99);
	}

}
