package com.sgtesting.constructor;
class Person1{
	String name;
	int age;
	Person1(String personname, int personage){
		name=personname;
		age=personage;
		System.out.println("Name :-"+ name);
		System.out.println("Age:-"+age);
	}
}
class Product1{
	String productname;
	int price;
	Product1(String proName, int proPrice){
		productname = proName;
		price = proPrice;
		System.out.println("Product name:-"+productname);
		System.out.println("Price :-"+ price);
	}
}
class Market1{
	String location;
	int id;
	Market1(String loc, int mid){
		location = loc;
		id = mid;
		System.out.println("Location:-"+location);
		System.out.println("Id :-"+id);
	}
	
}

public class ParameterizedConstructorDemo {

	public static void main(String[] args) {
		Person1 p = new Person1("Santosh", 20);
		Product1 pd = new Product1("Mobile", 50000);
		Market1 m = new Market1("Mumbai", 777777);
		

	}

}
