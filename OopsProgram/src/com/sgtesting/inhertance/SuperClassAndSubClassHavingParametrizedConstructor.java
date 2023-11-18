package com.sgtesting.inhertance;
class Student01{
	Student01(String name, int age) {
		System.out.println("Name :-"+name);
		System.out.println("Age :- "+age);
	}
}
class Library01 extends Student01{
	Library01(String fn, int age) {
		super("Santosh", 27);
		System.out.println("First name = "+fn);
		System.out.println("Age in lib = "+age);
	}
}
public class SuperClassAndSubClassHavingParametrizedConstructor {

	public static void main(String[] args) {
		Library01 l = new Library01("Ubhale", 20);

	}

}
