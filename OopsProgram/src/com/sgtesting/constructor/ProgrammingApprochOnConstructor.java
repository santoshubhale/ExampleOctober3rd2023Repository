package com.sgtesting.constructor;

// WAC it should accept integer array has a parameter and find the sun of all the elements
class ProgramDemo {
	 ProgramDemo(int a[]) {
		int sum=0;
		for(int i=0; i<a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println("Total sum = "+sum);
	}
}

public class ProgrammingApprochOnConstructor {

	public static void main(String[] args) {
	//	ProgramDemo pd = new ProgramDemo(new int[]{11,22,33,44,55});
		int x[]= {12,24,36,48,60};
		ProgramDemo pd = new ProgramDemo(x);

	}

}
