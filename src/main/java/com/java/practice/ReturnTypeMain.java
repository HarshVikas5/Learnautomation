package com.java.practice;

public class ReturnTypeMain {

	public static void main(String[] args) {
	ReturnType obj= new ReturnType();
	obj.demo();
	obj.add();
	obj.addDouble();
	obj.addFloat();
	obj.charPrint();		
    obj.strPrint();
    obj.boolPrint();
    obj.subtraction();
    System.out.println("My ans:"+ReturnType.c);
    System.out.println("My ans:"+obj.c);     //give warning

	}

}
