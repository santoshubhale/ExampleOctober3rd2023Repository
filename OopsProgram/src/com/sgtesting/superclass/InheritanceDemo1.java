package com.sgtesting.superclass;
class Demo1{
	void show(String str) {
		System.out.println("In class Demo1 class "+str);
	}
}
class Demo2 extends Demo1{
	Demo2(){
		super.show("Bangalore");
	}
	void show(String str) {
		System.out.println("In Demo2 class "+str);
	}
}
class Demo3 extends Demo2{
	Demo3(){
		super.show("Mumbai");
	}
	void show(String str) {
		System.out.println("In demo3 class "+str);
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args) {
	 Demo3 d = new Demo3();
	 d.show("Pune");

	}

}
