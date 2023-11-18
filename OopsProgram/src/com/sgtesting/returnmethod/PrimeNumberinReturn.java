package com.sgtesting.returnmethod;
class Prime{
	boolean show(int num) {
		int flag=0;
		boolean result =false;
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				flag=+1;
				break;
			}
		}
		if(flag==0) {
			result=true;
		}
		return result;
	}
}

public class PrimeNumberinReturn {

	public static void main(String[] args) {
		Prime p = new Prime();
		boolean a=p.show(10);
		System.out.println(a);
		boolean b=p.show(11);
		System.out.println(b);
	}

}
