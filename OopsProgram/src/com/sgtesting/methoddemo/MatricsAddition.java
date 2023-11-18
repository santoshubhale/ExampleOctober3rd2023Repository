package com.sgtesting.methoddemo;
class Matrix{
	void show(int a[][], int b[][]) {
		if(a.length==b.length&&a[0].length==b[0].length) {
			for(int i=0; i<a.length; i++) {
				for(int j=0; j<a[i].length; j++) {
					int c= a[i][j]+b[i][j];
					System.out.print(c + " ");
				}
				System.out.println();
			}
		}
	}
}

public class MatricsAddition {

	public static void main(String[] args) {
		Matrix m = new Matrix();
		m.show(new int[][] {{1,2,3},{4,5,6},{7,8,9}},new int[][]{{10,11,12},{13,14,15},{16,17,18}});

	}

}
