package com.sgtesting.inhertance;
class Demo1{
	Demo1(){
		System.out.println("I am Demo1 constructor");
	}
}
class Demo2 extends Demo1{
	Demo2(){
		System.out.println("I am Demo2 constructor");
	}
}
class Demo3 extends Demo1{
	Demo3(){
		System.out.println("I am Demo3 constructor");
	}
}
public class HirachicalDemo {

	public static void main(String[] args) {
		Demo3 d = new Demo3();
		Demo2 d1 = new Demo2();

	}

}
