package com.sgtesting.Interface;

interface Rbi {
	void rbiLocation(String location);
}
interface Sbi extends Rbi{
	void sbiLocation(String location);
}
interface Hdfc extends Sbi{
	void HdfcLocation(String location);
}
abstract class Bank implements Rbi,Sbi,Hdfc{
	
}
class BankLocation extends Bank{

	@Override
	public void rbiLocation(String location) {
		System.out.println("Rbi location "+location);
		
	}
	@Override
	public void sbiLocation(String location) {
		System.out.println("sbi location "+location);
		
	}

	@Override
	public void HdfcLocation(String location) {
		System.out.println("hdfc location "+location);
		
	}

	
}
public class MultilevelInterface {

	public static void main(String[] args) {
		BankLocation bl = new BankLocation();
		bl.rbiLocation("Delhi");
		bl.sbiLocation("Mumbai");
		bl.HdfcLocation("Bangalore");
	}

}
