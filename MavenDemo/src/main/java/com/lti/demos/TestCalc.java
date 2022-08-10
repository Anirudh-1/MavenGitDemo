package com.lti.demos;

public class TestCalc {
	
	public static void main(String args[]) {
		
		Calculator a= new Calculator();
		System.out.println(a.sayHello());
		
		System.out.println(a.add(20, 10));
		System.out.println(a.sub(20, 10));
	}
}
