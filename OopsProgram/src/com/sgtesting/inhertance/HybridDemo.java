package com.sgtesting.inhertance;
class Test1{
	void a() {
		System.out.println("Test1");
	}
}
class Test2 extends Test1{
	void b() {
		System.out.println("Test2");
	}
}
class Test3 extends Test2{
	void c() {
		System.out.println("Test3");
	}
}
class Sample11 extends Test1{
	Sample11(){
		System.out.println("Sample");
	}
}
public class HybridDemo {

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.a();
		t.b();
		t.c();
		Sample11 s = new Sample11();
		

	}

}
