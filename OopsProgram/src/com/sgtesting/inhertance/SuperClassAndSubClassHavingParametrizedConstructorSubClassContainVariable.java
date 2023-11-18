package com.sgtesting.inhertance;
class Student11{
	Student11(String name, int age){
		System.out.println("Name = "+name);
		System.out.println("Age = "+age);
	}
}
class Library11 extends Student11{
	String bookName;
	Library11(String fn, int age, String bookName){
		super("santosh",27);
		this.bookName=bookName;
		System.out.println("Book Name = "+bookName);
	}
	
}

public class SuperClassAndSubClassHavingParametrizedConstructorSubClassContainVariable {

	public static void main(String[] args) {
		Library11 l = new Library11("ubhale", 30, "core java");

	}

}
