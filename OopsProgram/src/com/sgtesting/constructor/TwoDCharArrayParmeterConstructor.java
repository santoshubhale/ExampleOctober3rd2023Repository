package com.sgtesting.constructor;

/* WAC constructor should accept 2d array charector array as a parameter, 
in constructor all the element of 2d array assign into a 1d array and read the elements from 
1d charector array*/

class TwoDArrayDemo {
	TwoDArrayDemo(char arr[][]) {
		char a[] = new char[arr.length * arr[0].length];
		int k = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				a[k] = arr[i][j];
				k++;
			}
		}
		for (char ch : a) {
			System.out.println(ch);
		}
	}
}

public class TwoDCharArrayParmeterConstructor {

	public static void main(String[] args) {
		TwoDArrayDemo td = new TwoDArrayDemo(new char[][] { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'h', 'i', 'j' } });

	}

}
