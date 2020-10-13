package com.sapient.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.service.*;

public class TestMathService {
	
	MathService service;
	
	@BeforeEach
	 void init() {
		service = new 	MathService();
	}
	

	@Test
	 void testFibonacci1() {
		//service = new GenerateService();
		int actual = service.FibonacciRecursive(1);
		int expected = 1;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testFibonacci() {
		//service = new GenerateService();
		int actual = service.FibonacciRecursive(5);
		int expected = 5;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testFactorial0() {
		//service = new GenerateService();
		int actual = service.factorial(0);
		int expected = 1;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testFactorial() {
		//service = new GenerateService();
		int actual = service.factorial(5);
		int expected = 120;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testPrime1() {
		//service = new GenerateService();
		boolean actual = service.isPrime(1);
		boolean expected = false;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testPrime2() {
		//service = new GenerateService();
		boolean actual = service.isPrime(5);
		boolean expected = true;
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	 void testgetPrimes() {
		//service = new GenerateService();
		String actual = service.getPrimes(1,10);
		String expected = "2 3 5 7 ";
		Assertions.assertEquals(expected, actual);
	}
	
}
