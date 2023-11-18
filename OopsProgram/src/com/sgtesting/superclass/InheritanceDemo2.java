package com.sgtesting.superclass;
class Sample{
	String state;
	void show() {
		System.out.println("Sample 1 state"+ state);
	}
}
class Sample1 extends Sample{
	String state;
	Sample1() {
		super.state="Karnataka";
	}
	void show1() {
		System.out.println("Sample 2 state"+ state);
	}
}
class Sample2 extends Sample1{
	String state;
	Sample2(){
		super.state="Maharastra";
	}
	void show2() {
		System.out.println("Sample 3 state"+ state);
	}
}
public class InheritanceDemo2 {

	public static void main(String[] args) {
		Sample2 s = new Sample2();
		s.state="Delhi";
		s.show();
		s.show1();
		s.show2();

	}

}
