package com.practice;

import java.util.HashMap;
import java.util.Map;

class AA {
	static {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "one");
		hm.put(2, "two");
		hm.put(3, "three");

//		for(int s : hm.keySet()) {
//			System.out.println(s);
//		}
//		for(String str : hm.values()) {
//			System.out.println(str);
//		}
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}

	{
		HashMap<String, String> hmp = new HashMap<String, String>();
		hmp.put("one", "Two");
		hmp.put("three", "four");
		hmp.put("five", "six");
		for (String str : hmp.keySet()) {
			System.out.println(str);
		}
		for (String str : hmp.values()) {
			System.out.println(str);
		}
	}
}

public class Demo {

	public static void main(String[] args) {
		// AA a = new AA();
		BB b = new BB();
	}

}
