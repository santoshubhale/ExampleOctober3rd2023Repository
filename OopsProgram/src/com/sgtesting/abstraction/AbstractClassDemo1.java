package com.sgtesting.abstraction;
abstract class College{
	abstract void showCollegeName(String name);
	abstract void showCollegeLocation(String location);
	void displaycourses(String course[]) {
		System.out.println("courses are");
		for(int i=0; i<course.length; i++) {
			System.out.println("courses name"+course[i]);
		}
	}
}
class Engineering extends College{

	@Override
	void showCollegeName(String name) {
		System.out.println("Engineering college name"+name);
		
	}

	@Override
	void showCollegeLocation(String location) {
		System.out.println("Engineering location"+location);
		
	}
	void displaycityname(String name) {
		System.out.println("city name"+name);
	}

	
	
}

public class AbstractClassDemo1 {

	public static void main(String[] args) {
		College e = new Engineering();
		e.displaycityname("Bangalore");
		String s[] ={"ces","ece", "mech"};
		e.displaycourses(s);
		e.showCollegeLocation("Attiguppe");
		e.showCollegeName("sg testing");

	}

}
