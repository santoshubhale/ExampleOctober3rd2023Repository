package com.sgtesting.methoddemo;
class CallByValue{
	void calculate(int x, int y) {
		x+=100;
		y+=20;
		System.out.println("In method value of x = "+x);
		System.out.println("In method value of y = "+y);
	}
}

public class CallByValueDemo {

	public static void main(String[] args) {
		int x =15;
		int y=25;
		System.out.println("The value of x = "+x);
		System.out.println("The value of y = "+y);
		CallByValue cv = new CallByValue();
		cv.calculate(10, 10);
		System.out.println("After method execution the value of x = "+x);
		System.out.println("After method execution the value of y = "+y);

	}

}
