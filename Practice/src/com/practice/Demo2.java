package com.practice;

public class Demo2 {

	public static void main(String[] args) {
		
		String s = "santosh ubhale";
		String rev = " ";
		char ch;
		for(int i=0;  i<s.length(); i++) {
			ch=s.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);

	}

}
