
package com.sgtesting.Interface;

interface Univercity {
	abstract void showUniversityName(String name);
}

interface College {
	abstract void displayCollegeName(String name);
}

class BmsEngg implements Univercity, College {
	@Override
	public void showUniversityName(String name) {
		System.out.println("University name : -" + name);
	}
	@Override
	public void displayCollegeName(String name) {
		System.out.println("College name : -"+ name);
	}
	void displaylocation(String location) {
		System.out.println("callege location : -"+ location);
	}

}

public class InterfaceDemo {

	public static void main(String[] args) {
		BmsEngg be = new BmsEngg();
		be.displayCollegeName("Sg testing");
		be.showUniversityName("open university");
		be.displaylocation("Bangalore");
	}

}
