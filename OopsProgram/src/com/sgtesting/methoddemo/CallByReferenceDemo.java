package com.sgtesting.methoddemo;

class CallByRefence {
	int x, y;

	void calculate(CallByRefence o) {
		o.x += 100;
		o.y += 20;
		System.out.println("In method , value of x = " + o.x);
		System.out.println("In method , value of y = " + o.y);
	}
}

public class CallByReferenceDemo {

	public static void main(String[] args) {
		CallByRefence o = new CallByRefence();
		o.x = 10;
		o.y = 20;
		System.out.println("The value of x" + o.x);
		System.out.println("The value of y" + o.y);
		o.calculate(o);
		System.out.println("After exectution of  method x value" + o.x);
		System.out.println("After execution of method y value" + o.y);
	}

}
