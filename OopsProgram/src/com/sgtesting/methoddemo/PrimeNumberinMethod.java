package com.sgtesting.methoddemo;

class Prime {
	void show(int num) {
		int flag = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag =+ 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(num + "= is prime number");
		} else {
			System.out.println(num + "= is not prime number");
		}
	}
}

public class PrimeNumberinMethod {

	public static void main(String[] args) {
		Prime p = new Prime();
		p.show(10);
		p.show(13);
		p.show(123);
		p.show(1423);

	}

}
