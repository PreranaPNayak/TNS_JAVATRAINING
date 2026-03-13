package org.tnsif.cap.c2tc.oops;

public class MethodOverloadingDemo {
	
	int addition(int a, int b) 
	{
		return a+b;
	}
	
	float addition(float a, float b) 
	{
		return a+b;
	}

	public static void main(String[] args) {
		
		MethodOverloadingDemo mod = new MethodOverloadingDemo();
		
		System.out.println("Addition for the int: "+mod.addition(5, 10));
		System.out.println("Addition for the float: "+mod.addition(2.3f, 6.5f));

	}

}
