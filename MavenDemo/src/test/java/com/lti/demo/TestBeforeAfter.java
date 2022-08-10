package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {

	Calculator c =new Calculator();
	int sum=0;
	
	@BeforeAll
	public static void testStartDemo()
	{
		System.out.println("DB is connected");
	}
	
	@BeforeEach
	public void testbefore() {
		System.out.println("Sum is zero "+sum);
	}
	@Test
	public void Testadd() {
		System.out.println("Test case 1");
		int result=c.add(20, 10);
		Assertions.assertEquals(30, result);
	}
	
	@Test
	public void Testsub() {
		System.out.println("Test case 2");
		Assertions.assertEquals(10, c.sub(20, 10));
	}
	
	@AfterEach
	public void testendDemo() {
		System.out.println("result is displayed");
	}
	
	@AfterAll
	public static void testafter() {
		System.out.println("DB is going to disconnect");
	}

}
