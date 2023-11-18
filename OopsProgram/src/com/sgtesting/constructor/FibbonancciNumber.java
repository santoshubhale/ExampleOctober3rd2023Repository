package com.sgtesting.constructor;

class Fibo {
	Fibo(){
		int fn=0;
		int sn=1;
		System.out.println(fn);
		System.out.println(sn);
		for(int i=1; i<=10;i++) {
			int tn=fn+sn;
			System.out.println(tn);
			fn=sn;
			sn=tn;
		}
	}
}

public class FibbonancciNumber {

	public static void main(String[] args) {
		Fibo f = new Fibo();
	}

}
