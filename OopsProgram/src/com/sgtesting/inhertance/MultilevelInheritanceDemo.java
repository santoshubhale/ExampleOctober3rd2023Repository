package com.sgtesting.inhertance;
class MultiLevel01{
	void add(int a, int b) {
		int res =(a+b);
		System.out.println("Addition Result"+res);
	}
}
class MultiLevel02 extends MultiLevel01{
	void sub(int a , int b) {
		int res =(a-b);
		System.out.println("Substraction Result"+res);
	}
}
class MultiLevel03 extends MultiLevel02{
	void mul(int a , int b) {
		int res =(a*b);
		System.out.println("Multiplication Result"+res);
	}
}
public class MultilevelInheritanceDemo {

	public static void main(String[] args) {
		MultiLevel03 ml = new MultiLevel03();
		ml.add(10, 20);
		ml.sub(100, 20);
		ml.mul(10, 10);

	}

}
