package com.sgtesting.inhertance;
class Student{
	Student(String name, int age){
		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age);
	}
	
}
class Library extends Student{
	Library(){
		super("Santosh",27);
	}
	
}
public class SuperClassContainsParametrizedConstructor {

	public static void main(String[] args) {
		Library l = new Library();
		

	}

}
