package com.sgtesting.constructor;

class ThisDemo {
	String name;
	int age;
	double salary;

	ThisDemo(String name, int age, double salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Salary = " + salary);
	}

	void show() {
		System.out.println("Name = " + name);
		System.out.println("Age = " + age);
		System.out.println("Salary = " + salary);
	}
}

public class ThiskeywordInConstructor {

	public static void main(String[] args) {
		ThisDemo td = new ThisDemo("santosh", 10, 110001.110);

		td.show();
	}

}
