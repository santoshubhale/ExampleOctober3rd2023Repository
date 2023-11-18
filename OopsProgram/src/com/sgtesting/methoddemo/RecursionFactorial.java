package com.sgtesting.methoddemo;
class Factorial{
	int getFactorial(int num){
		if(num==1) {
			return 1;
		}
		return num*getFactorial(num-1);
	}
}

public class RecursionFactorial {

	public static void main(String[] args) {
		Factorial f = new Factorial();
		int res=f.getFactorial(5);
		System.out.println(res);
	}

}
