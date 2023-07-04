package com.java.practice;

public class ReturnType {
	
	int a= 10;
	int b= 20;
	static int c;

	public void demo() {
		int a = 1;
		System.out.println(a);
	}

	public int add() {
		int a = 1;
		int b = 2;
		int c = a + b;
		System.out.println(c);
		return c;
	}

	public double addDouble() {
		double a = 10.1;
		double b = 12.2;
		double c = a + b;
		System.out.println(c);
		return c;
	}

	public float addFloat() {
		float a = 10.1f;
		float b = 12.2f;
		float c = a + b;
		System.out.println(c);
		return c;
	}

	public char charPrint() {
		char a = 'a';
		System.out.println("Output:" + a);
		return a;
	}

	public String strPrint() {
		String name = "My name is Harsh";
		System.out.println("Output:" + name);
		return name;
	}

	public boolean boolPrint() {
		boolean a = true;
		System.out.println(a);
		return a;
	}
    
	public int subtraction()
	{
		c= b-a;
		System.out.println(c);
				
		return c;
		
		
	}
}
