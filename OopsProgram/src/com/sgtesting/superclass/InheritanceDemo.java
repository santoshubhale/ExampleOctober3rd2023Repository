package com.sgtesting.superclass;

class Test1 {
	Test1(String name) {
		System.out.println("Name in test1 super class = " + name);
	}
}

class Test2 extends Test1 {
	int age;

	Test2(String name1, int age) {
		super(name1);
		this.age = age;
		System.out.println("Age in test2 class = " + age);
	}

}
class Test3 extends Test2{
	Test3(String name11, int age1) {
		super(name11,age1);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		Test3 t = new Test3("santosh", 27);
	}

}
