package com.sgtesting.constructor;

/* Suppose the value which you are suppling parameterized constructor the same value you
would like to use in a same class or other method in this case we have to prefer assign 
parameter value into a instance variable*/
class StudentDemo{
	String name;
	int rollnum; 
	String branch;
	StudentDemo(String sname, int srno, String sbranch){
		name=sname;
		rollnum=srno;
		branch= sbranch;
		System.out.println("Student name ="+ name);
		System.out.println("Roll Number ="+rollnum);
		System.out.println("Branch ="+ branch);
		
	}
	void show() {
		System.out.println("Inside method");
		System.out.println("Student name ="+ name);
		System.out.println("Roll Number ="+rollnum);
		System.out.println("Branch ="+ branch);
	}
}
public class ValuesToConstructorAndMethod {

	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo("santosh", 27, "Business Analayst");
		sd.show();

	}

}
