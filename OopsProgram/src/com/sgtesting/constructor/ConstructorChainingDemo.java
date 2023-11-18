package com.sgtesting.constructor;

class ChainDemo {
	
	ChainDemo(String name) {
		System.out.println("Name =" + name);
	}

	ChainDemo(int count) {
		this("Santosh");
		System.out.println("count = "+ count);
	}
	ChainDemo(double salary){
		this(77);
		System.out.println("Salary = "+salary);
	}
}

public class ConstructorChainingDemo {

	public static void main(String[] args) {
		ChainDemo cd = new ChainDemo(11111.11);
	}

}
