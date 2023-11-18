package com.sgtesting.methoddemo;
class Demozz{
	int add(int x, int y) {
		int z= x+y;
		return z;
		
	}
	int sub(int x, int y) {
		int z=x-y;
		return z;
	}
	int mul(int x, int y) {
		int z=x*y;
		return z;
	}
}

public class ParametertoOtherMethod {

	public static void main(String[] args) {
		Demozz d = new Demozz();
		int res=d.mul(d.add(10,20), d.sub(20, 10));
		System.out.println("Multiplication"+res);

	}

}
