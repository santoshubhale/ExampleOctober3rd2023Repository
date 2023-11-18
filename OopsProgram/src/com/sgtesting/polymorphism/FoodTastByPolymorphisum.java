package com.sgtesting.polymorphism;
interface Teast{
	abstract void teast();
}
class Salt implements Teast{

	@Override
	public void teast() {
		System.out.println("Teast is salt");
		
	}
	
}
class Spicy implements Teast{

	@Override
	public void teast() {
		System.out.println("Teast is hot");
		
	}
	
}
public class FoodTastByPolymorphisum {

	public static void main(String[] args) {
		Teast t = null;
		Salt s = new Salt();
		Spicy ss = new Spicy();
		t=s;
		s.teast();
		t=ss;
		ss.teast();

	}

}
