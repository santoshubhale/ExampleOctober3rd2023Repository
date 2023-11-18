package com.sgtesting.methoddemo;

class Demo {
	static int[] Prime() {

		int count = 0;
		for (int i = 1; i < 100; i++) {
			int flag=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0) {
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				count++;
			}
		}
		System.out.println("Total count:-" + count);
		int[] a = new int[count];
		int k = 0;
		for (int j = 1; j <100; j++) {
				int flag = 0;
				for (int x = 2; x <j; x++) {
					if (j % x == 0) {
						flag++;
						break;
					}
				}
				if (flag == 0) {
					a[k] = j;
					k++;
				}
			}

		return a;

	}

}

public class ProgrameticallyReturnPrimeNo {

	public static void main(String[] args) {
		int x[] = Demo.Prime();
		for (int i = 0; i < x.length; i++)
			System.out.println(x[i]);
	}

}
