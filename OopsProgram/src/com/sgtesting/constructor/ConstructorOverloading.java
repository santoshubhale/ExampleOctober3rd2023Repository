package com.sgtesting.constructor;

class OverloadingDemo {
	OverloadingDemo() {
		System.out.println("no-args constuctor ");
	}


	OverloadingDemo(int a) {
		System.out.println(" int constructor ");
	}
	OverloadingDemo(long a){
		System.out.println("long constructor");
	}

	OverloadingDemo(double a) {
		System.out.println(" double constructor ");
	}

	OverloadingDemo(String a) {
		System.out.println(" string constructor ");
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo(119);
		OverloadingDemo od1 = new OverloadingDemo(12);
		

	}

}
