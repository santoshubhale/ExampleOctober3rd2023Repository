package com.sgtesting.constructor;
// without using instance variable can we use parameterized constructor Ans:-yes

class Student{
	Student(String fname , int age){
		System.out.println("Student Name :-"+fname);
		System.out.println("Student Age :-"+age);
	}
}
public class WithoutInstanceVariableConstructor {

	public static void main(String[] args) {
		Student s = new Student("Santosh", 20);

	}

}
