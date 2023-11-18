package com.sgtesting.methoddemo;

class Methodprgm {
	String[] s(String s1[]) {
		return s1;
	}

	int[][] arr() {
		int res[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		return res;
	}

	double circle(int i) {

		double cir = 3.14 * i * i;
		return cir;
	}

	String s() {
		String a = "pune";
		return a;
	}

	int cube(int a) {
		int i = a * a * a;
		return i;
	}

	static int price(int a) {
		int i = a;
		return i;
	}

	static int a() {
		int sum = 0;
		int res[] = { 2, 4, 6, 8, 10 };
		for (int i = 0; i < res.length; i++) {
			sum = sum + res[i];
		}
		return sum;
	}

	int countdemo() {
		int count = 0;
		for (int i = 40; i < 80; i++) {
			if (i % 3 == 0) {
				count++;
			}
		}
		return count;
	}

	char abc(int a) {

		char x = (char) a;
		return x;
	}

	static char[][] aaa() {
		char ch[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' } };
		return ch;
	}

	static int asd(char a) {
		int ab = (int) a;
		return ab;
	}

	static String hobies() {
		String str = "Dancing" + "Sports" + "singing";
		return str;
	}

	static double avgDemo() {
		double avg = 10;
		double num = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10;
		double res = num / avg;
		return res;

	}

	int factorial(int a) {
		int fact = 1;
		for (int i = 1; i <= a; i++) {
			fact = fact * i;
		}
		return fact;
	}

	int div() {
		int a = 10;
		int b = 2;
		int aa = a / b;
		return aa;
	}

	static int[] evennum() {

		int a[] = new int[6];
		int k = 0;
		for (int i = 10; i <= 20; i++) {
			if (i % 2 == 0) {
				a[k] = i;
				k++;
			}
		}
		return a;
	}

	static int[] aa() {
		int arr[] = new int[5];
		int k = 0;
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				arr[k] = i;
				k++;
			}
		}

		return arr;
	}

	static int addition() {

		int sum = 0;
		for (int i = 0; i <= 5; i++) {

			sum = sum + i;
		}
		return sum;
	}

	int mul() {
		int a = 10;
		int b = 20;
		int c = 30;

		return a * b * c;
	}

	static char[] ch() {
		char c[] = new char[5];
		int k = 0;
		char cc[] = { 'a', 'b', 'c', 'd', 'e' };
		for (int i = 0; i < cc.length; i++) {
			c[k] = cc[i];
			k++;
		}
		return c;
	}

	String s(String a) {
		return a;
	}

	boolean[] b() {
		boolean aa[] = { true, false, true };
		return aa;
	}

	int maximum() {
		int sk[] = { 10, 20, 30, 40, 50, 60 };
		return sk[5];
	}

	byte[] bg() {
		byte[] se = { 1, 2, 34, 5, 6 };
		return se;
	}

	String[] str() {
		String ss[] = { "santosh", "ashok", "nandan", "saipallavi" };
		return ss;
	}

}

public class MethodDemo {

	public static void main(String[] args) {
		Methodprgm mp = new Methodprgm();
		String[] x = { "apple", "mango", "orange", "banana" };
		String[] z = mp.s(x);
		System.out.println(z[0]);

		System.out.println("--------");
		int b[][] = mp.arr();
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		System.out.println("---------");
		double r = mp.circle(10);
		System.out.println("radius=" + r);
		System.out.println("---------");
		String s = mp.s();
		System.out.println(s);
		System.out.println("----------");
		int a = mp.cube(3);
		System.out.println("cube" + a);
		System.out.println("----------");
		int x1 = Methodprgm.price(100);
		System.out.println("price" + x1);
		System.out.println("-----------");
		int aa = Methodprgm.a();
		System.out.println(aa);
		System.out.println("--------");
		int bb = mp.countdemo();
		System.out.println("count" + bb);
		System.out.println("-------------");
		char ch = mp.abc(97);
		System.out.println(ch);
		System.out.println("------------");
		char w[][] = Methodprgm.aaa();
		for (int i = 0; i < w.length; i++) {
			for (int j = 0; j < w[i].length; j++) {
				System.out.print(w[i][j]);
			}
			System.out.println();
		}
		System.out.println("--------");
		int xx = (char) Methodprgm.asd('a');
		System.out.println(xx);
		System.out.println("----------");
		String saa = Methodprgm.hobies();
		System.out.println(saa);
		System.out.println("----------");
		double awa = Methodprgm.avgDemo();
		System.out.println(awa);
		System.out.println("----------");
		int zx = mp.factorial(5);
		System.out.println(zx);
		System.out.println("--------");
		int c = mp.div();
		System.out.println(c);
		System.out.println("--------");
		int aaa[] = Methodprgm.evennum();
		for (int i = 0; i < aaa.length; i++) {
			System.out.println(aaa[i]);
		}
		System.out.println("--------");
		int zxc[] = Methodprgm.aa();
		for (int i = 0; i < zxc.length; i++) {
			System.out.println(zxc[i]);
		}
		System.out.println("-----------");
		int sumres = Methodprgm.addition();
		System.out.println(sumres);
		System.out.println("-------------");
		int app = mp.mul();
		System.out.println(app);
		System.out.println("-----------");
		char[] cv = Methodprgm.ch();
		for (int i = 0; i < cv.length; i++) {
			System.out.println(cv[i]);
		}
		System.out.println("------------");
		String ss = mp.s("santosh");
		System.out.println(ss);
		System.out.println("-----------");
		boolean xz[] = mp.b();
		for (int i = 0; i < xz.length; i++) {
			System.out.println(xz[i]);
		}
		System.out.println("---------");

		int dd = mp.maximum();
		System.out.println(dd);
		System.out.println("---------");
		byte aak[] = mp.bg();
		for (int i = 0; i < aak.length; i++) {
			System.out.println(aak[i]);
		}
		System.out.println("-----------");
		String sa[] = mp.str();
		for (int i = 0; i < sa.length; i++) {
			System.out.println(sa[i]);
		}
	}

}
