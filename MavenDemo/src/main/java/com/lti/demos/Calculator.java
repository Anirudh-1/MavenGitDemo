package com.lti.demos;

public class Calculator {
	
	public String sayHello() {
		return "Hello World";
	}
	
	public int add(int x,int y) {
		int result =x+y;
		return result;
	}
	
	public int sub(int x,int y) {
		int result =x-y;
		return result;
	}
	
	public void searchEmp(int empId) {
		if(empId==0) {
			throw new ArithmeticException("You entered zero");
		}
		else {
			System.out.println("Do Something");
		}
	}
}
