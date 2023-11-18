package com.sgtesting.constructor;
// If instance variable name and parameter name both are same . 

//In this case the parameter hides the instance variable with in the body of the constructor

class StudentDemo1 {
	String name;
	int rollno;
	String branch;

	StudentDemo1(String name, int rollno, String branch) {
		name = name;
		rollno = rollno;
		branch = branch;
		System.out.println("Student name = "+ name);
		System.out.println("Roll no = "+rollno);
		System.out.println("Branch = "+branch);
	}
	void show() {
		System.out.println("Student name = "+ name);
		System.out.println("Roll no = "+rollno);
		System.out.println("Branch = "+branch);
	}
}

public class InstanceVariableAndParameterNameSameConstructorAndMethod {

	public static void main(String[] args) {
		StudentDemo1 sd = new StudentDemo1("Santosh", 27, "AI");
		sd.show();
	}

}
