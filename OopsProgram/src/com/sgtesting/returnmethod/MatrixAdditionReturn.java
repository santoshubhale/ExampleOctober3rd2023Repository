package com.sgtesting.returnmethod;

class Addition {
	int[][] add(int a[][], int b[][]) {
		int c[][] = new int[a.length][a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		return c;
	}
}

public class MatrixAdditionReturn {

	public static void main(String[] args) {
		Addition a = new Addition();
		// Addition output
		int[][] res = a.add(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				new int[][] { { 11, 22, 33 }, { 44, 55, 66 }, { 77, 88, 99 } });
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("-------");
		// display the first row of the element
		for(int i=0; i<res.length; i++) {
			System.out.println(res[0][i]+" ");
		}
		System.out.println("-----------");
		// display 3rd row
		for(int i=0; i<res.length; i++) {
			System.out.println(res[2][i]);
		}
		System.out.println("--------");
			// display first column
			for(int i=0; i<res.length; i++) {
				System.out.println(res[i][0]);
			}
			System.out.println("---------");
			//Transpose the element
			for(int i=0; i<res.length; i++) {
				for(int j=0; j<res[i].length; j++) {
					System.out.print(res[j][i]+" ");
				}
				System.out.println();
			}

	}

}
