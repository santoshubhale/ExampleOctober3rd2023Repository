package com.sgtesting.inhertance;
class Sample{
	void add(int x , int y) {
		int res=(x+y);
		System.out.println("Addition Result = "+res);
	}
}
class Sample2 extends Sample{
	void mul(int x , int y) {
		int res=(x*y);
		System.out.println("Multiplication Result = "+res);
	}
}

public class SingleLevelInheritance {

	public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.add(100, 200);
		s.mul(10, 20);

	}

}
