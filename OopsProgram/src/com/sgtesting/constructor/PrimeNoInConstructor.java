package com.sgtesting.constructor;

// verify given no is prime or not
class PrimeDemo {
	PrimeDemo(int num) {
		int flag = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = flag + 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(num + "= is prime");
		} else {
			System.out.println(num + "= is not prime");
		}
	}
}

public class PrimeNoInConstructor {

	public static void main(String[] args) {
		PrimeDemo pd = new PrimeDemo(11);
		PrimeDemo pd1 = new PrimeDemo(10);

	}

}
