package com.sgtesting.encapsulation;
class EncapsulationTest{
	private String bankName;
	private int accountNo;
	public void setBankname(String bankname) {
		this.bankName=bankname;
	}
	public String getBankName() {
		return bankName;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo=accountNo;
		
	}
	public int getAccountNo() {
		return accountNo;
	}
}

public class EncapsulationDemo {

	public static void main(String[] args) {
		EncapsulationTest ed = new EncapsulationTest();
		ed.setBankname("HDFC bank");
		String str=ed.getBankName();
		System.out.println(str);
		
		ed.setAccountNo(12345678);
		int res=ed.getAccountNo();
		System.out.println(res);

	}

}
