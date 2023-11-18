package com.sgtesting.constructor;

class Person {
	String name;
	int age;

	Person() {
		name = "santosh";
		age = 27;
		System.out.println("Name :- " + name);
		System.out.println("Age :-" + age);
	}
}

class Product {
	String pname;
	double price;

	Product() {
		pname = "Lapton";
		price = 100000.77;
		System.out.println("Product :-" + pname);
		System.out.println("Price :-" + price);
	}
}

class Market {
	String location;
	int id;

	Market() {
		location = "Bangalore";
		id = 177795;
		System.out.println("Location :-" + location);
		System.out.println("Market id :-" + id);
	}
}

public class No_argsConstrctorDemo {

	public static void main(String[] args) {
		Person p = new Person();
		Product pd = new Product();
		Market m = new Market();

	}

}
