package com.sgtesting.inhertance;
class Employee{
	void showBonus(int percentage) {
		double sal;
		double bonus;
		sal=50000;
		bonus=(sal*percentage)/100;
		System.out.println("Bouns of the employee"+bonus);
	}
}
class Department extends Employee{
	 Department(int percentage) {
		super.showBonus(percentage);
	}
	 void showBonus(int percentage) {
		 System.out.println("percentage of bonus for Department"+percentage);
	 }
}

public class SuperClassAndSubClassHavingSameNameAndSameMethodWithSameSigniture {

	public static void main(String[] args) {
		Department d = new Department(10);
		d.showBonus(20);

	}

}
