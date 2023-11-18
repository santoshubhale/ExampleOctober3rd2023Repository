package com.sgtesting.inhertance;
class Aa{
	String name;
	void show() {
		System.out.println("name = "+name);
	}
}
class Bb extends Aa{
	String name;
	Bb(String name1 , String name) {
		super.name=name1;
		this.name=name;
	}
	void disp() {
		System.out.println("Name Bb = "+name);
	}
}
public class SuperClassAndSubClassContainsSameVariableNameWithSameDataType {

	public static void main(String[] args) {
		Bb c = new Bb("santosh", "ubhale");
		c.show();
		c.disp();

	}

}
