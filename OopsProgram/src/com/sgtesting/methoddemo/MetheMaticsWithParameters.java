package com.sgtesting.methoddemo;
class Maths{
	void multiplication(int x, int y) {
		int res=(x*y);
		System.out.println("Multiplication :"+res);
	}
	void addition(int x , int y){
		int res=(x+y);
		System.out.println("Addition :"+res);
	}
}

public class MetheMaticsWithParameters {

	public static void main(String[] args) {
		Maths m = new Maths();
		m.addition(1, 20);
		m.multiplication(10, 30);
		m.addition(100, 10);
		

	}

}
