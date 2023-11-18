package com.sgtesting.singletonpaatrendesign;

class BasicMaths {
	static BasicMaths obj = null;

	private BasicMaths() {

	}

	void addition(int a, int b) {
		int res = (a + b);
		System.out.println("Addition Result" + res);
	}

	void multiplication(int a, int b) {
		int res = (a * b);
		System.out.println("Multipication Result" + res);
	}

	public static BasicMaths getInstance() {
		if (obj == null) {
			obj = new BasicMaths();
		}
		return obj;
	}
}

public class SingletonDesignPattren {

	public static void main(String[] args) {
		BasicMaths bm = BasicMaths.getInstance();
		bm.addition(10, 20);
		bm.multiplication(30, 40);

		BasicMaths bm1 = BasicMaths.getInstance();
		bm1.addition(100, 200);
		bm1.multiplication(12, 10);

		if (bm == bm1) {
			System.out.println("Achived Singleton Design Pattren");
		} else {
			System.out.println("Not Achived Singleton Design Pattren");
		}

	}

}
