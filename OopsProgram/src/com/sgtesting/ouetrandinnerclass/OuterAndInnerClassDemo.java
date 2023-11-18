package com.sgtesting.ouetrandinnerclass;
class Outer{
	String firstName;
	Inner i = new Inner();
	void displayAge() {
		i.age=27;
		System.out.println("Age"+i.age);
	}
	
	class Inner{
		int age;
		void showFN() {
			firstName="Santosh";
			System.out.println("Name :-"+firstName);
		}
	}
	
}
public class OuterAndInnerClassDemo {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.displayAge();
		o.i.showFN();

	}

}
