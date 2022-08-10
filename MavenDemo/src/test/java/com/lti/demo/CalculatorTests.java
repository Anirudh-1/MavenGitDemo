package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class CalculatorTests {
	
	Calculator c =new Calculator();

	@Test
	public void TestsayHello() {
		Assertions.assertEquals("Hello World",c.sayHello());
	}

	@Test
	public void Testadd() {
		Assertions.assertEquals(30, c.add(20, 10));
	}
	
	@Test
	public void Testsub() {
		Assertions.assertEquals(10, c.sub(20, 10));
	}
	
	@Test
	public void testassertnulls() {
		String s1=null;
		String s2="Anirudh";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10);
		Assertions.assertFalse(10>20,"10 is Smaller");
		Assertions.assertNotEquals("Hello", "hello");
	}
	
	@Test
	public void testarrays() {
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0,myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		
	}
	
	

}
