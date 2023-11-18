package com.sgtesting.constructor;

/*By using constructor overloading and appling 2 interger parameters 
perform all basic mathemathical operation action*/
class BasicMaths {
	BasicMaths(int x, int y, String action){
		int res = 0;
		switch(action){
		case "add":
			res=(x+y);
			System.out.println("Addition = "+res);
			break;
		case "sub":
			res=(x-y);
			System.out.println("Substraction = "+res);
			break;
		case  "mul":
			res=(x*y);
			System.out.println("Multiplication = "+res);
			break;
		case "div":
			res=(x/y);
			System.out.println("Division = "+res);
			break;
		case "mod":
			res=(x%y);
			System.out.println("modulus = "+res);
			break;
			default:
			{
				System.out.println("Invalid type");
			}
		}
	}
}

public class BasicMathsActionInSwitch {

	public static void main(String[] args) {
		BasicMaths bm = new BasicMaths(20, 3, "mod");
	}

}
