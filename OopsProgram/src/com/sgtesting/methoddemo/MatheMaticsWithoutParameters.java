package com.sgtesting.methoddemo;
// this type of method never having any parameters
class MathsAdd{
	void show() {
		int x,y,res;
		x=10;
		y=77;
		res=x+y;
		System.out.println("Addition value = "+res);
	}
}

public class MatheMaticsWithoutParameters {

	public static void main(String[] args) {
		MathsAdd ma = new MathsAdd();
		ma.show();
		ma.show();

	}

}
