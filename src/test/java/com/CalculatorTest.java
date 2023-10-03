package com;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	private Calculator objCalcUnderTest;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		objCalcUnderTest = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculator() {
//		fail("Not yet implemented");
	}

	@Test
	void testAdd() {
		int a = 15; int b = 20; 
		int expectedResult = 35;
		long result = objCalcUnderTest.add(a, b);
		assertEquals(expectedResult, result);
	}

	@Test
	void testSubtract() {
		int a = 25; int b = 20; 
		int expectedResult = 5; 
		long result = objCalcUnderTest.subtract(a, b);
		assertEquals(expectedResult, result);
	}

	@Test
	void testMultiply() {
		int a = 10; int b = 25;
		long expectedResult = 250;
		long result = objCalcUnderTest.multiply(a, b);
		assertEquals(expectedResult, result);
	}

	@Test
	void testDivide() {
		int a = 56; int b = 10; 
		double expectedResult = 5.6; 
		double result = objCalcUnderTest.divide(a, b);
		assertEquals(expectedResult, result,0.00005);
	}
	
//	@Test
//	public void testDivideByZero() { 
//		int a = 15; int b = 0;
//		assertThrows(IllegalArgumentException.class, objCalcUnderTest.divide(a, b));
//	}

}
