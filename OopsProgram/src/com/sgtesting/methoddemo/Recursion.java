package com.sgtesting.methoddemo;
class Maths1{
	int count =10;
	void display() {
		if(count<=20) {
			System.out.println(count);
			count++;
			display();
		}
	}
	
}

public class Recursion {

	public static void main(String[] args) {
		Maths1 m = new Maths1();
		m.display();

	}

}
