package com.sgtesting.tests.reflection3;

import java.lang.reflect.Method;

public class SampleDemo {

	public static void main(String[] args) {
		Sample obj=new Sample();
		try
		{
			Method method[]=obj.getClass().getDeclaredMethods();
			for(int i=0;i<method.length;i++)
			{
				method[i].invoke(obj, null);
			}
		}catch (Exception e) 
		{
			e.printStackTrace();
		}

	}

}
