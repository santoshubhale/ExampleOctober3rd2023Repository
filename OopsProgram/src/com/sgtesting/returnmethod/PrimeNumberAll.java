package com.sgtesting.returnmethod;

class PrimeDemo {
	boolean display(int num) {
		int flag = 0;
		boolean result = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag += 1;
				break;
			}
		}
		if (flag == 0) {
			result = true;
		}
		return result;
	}
}

public class PrimeNumberAll {

	public static void main(String[] args) {
		PrimeDemo pd = new PrimeDemo();
		boolean a = pd.display(11);
		System.out.println(a);
		System.out.println("---------------");
		// print prime number 1 to 50
		for (int i = 1; i <= 50; i++) {
			if (pd.display(i) == true) {
				System.out.println(i + "= is a prime number");
			}
		}
		// count of prime number 50 to 100
		int count = 0;
		for (int i = 50; i < 100; i++) {
			if (pd.display(i) == true) {

				count++;

			}
		}
		System.out.println("Total count is =" + count);
		// sum of the prime number 150 to 100;
		int sum=0;
		for(int i=150; i>=100; i--) {
			if(pd.display(i)==true) {
				sum=sum+i;
			}
		}
		System.out.println("Total sum is = "+sum);
	}

}
