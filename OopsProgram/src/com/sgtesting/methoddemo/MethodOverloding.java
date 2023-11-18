package com.sgtesting.methoddemo;

class Test {
	void add(int x) {
		System.out.println("value of x :-" + x);
	}

	void add(int x, int y) {
		System.out.println("Addition of two no :-" + (x + y));
	}

	void add(int x, int y, int z) {
		System.out.println("Addition of three no :-"+(x+y+z));
	}
}

public class MethodOverloding {

	public static void main(String[] args) {
		Test t = new Test();
		t.add(10);
		t.add(20, 30);
		t.add(40, 50, 60);
	}

}
