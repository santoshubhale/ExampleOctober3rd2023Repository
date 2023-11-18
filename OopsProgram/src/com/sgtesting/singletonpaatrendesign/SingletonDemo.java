package com.sgtesting.singletonpaatrendesign;
class maths1
{
	static maths1 o1=null;
	private maths1()
	{
		//it is private constructor
	}
	void Addition(int x,int y)
	{
		int res=(x+y);
		System.out.println(res);
	}
	void multiplication(String a)
	{

		System.out.println(a);
	}
	public static maths1 getInstance()
	{
		if(o1==null)
		{
			o1=new maths1();
		}
		return o1;
	}
	void substraction(int m,int n)
	{
		int res=(m-n);
		System.out.println(res);
	}
}
public class SingletonDemo {

	public static void main(String[] args) {
		maths1 obj=maths1.getInstance();
		obj.Addition(10, 20);


		maths1 obj1=maths1.getInstance();
		obj1.Addition(20, 40);
		obj1.multiplication("biradar");
		obj.Addition(2, 6);

		maths1 o1=maths1.getInstance();
		o1.Addition(1, 2);
		obj.multiplication("sapna");

	//	maths1 o4=new maths1();
//		maths1 obj2=maths1.getInstance();
//		obj2.substraction(12, 6);
		if(obj==o1)
		{
			System.out.println("achieved singleton ");
		}
		else
		{
			System.out.println("Not achieved singleton");
		}
	}

}
