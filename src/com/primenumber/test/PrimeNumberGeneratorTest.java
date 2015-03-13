package com.primenumber.test;

import junit.framework.TestCase;

import org.junit.*;
 

import com.primenumber.impl.PrimeNumberGenerator;
import com.primenumber.impl.RangeOfPrimes;

public class PrimeNumberGeneratorTest extends TestCase {

	private PrimeNumberGenerator primes;
	
	@BeforeClass
	public void setUp(){
		primes = new RangeOfPrimes();
	}
	
	@Test
	public void testZero(){
		
	}
	
	@Test
	public void testNegativeOne(){
		
	}
	
	@Test
	public void testOne(){
		
	}
	
	
	@Test
	public void testIsPrimeZero(){
		assertFalse(primes.isPrime(0));
	}
	
	@Test
	public void testIsPrimeNegative(){
		assertFalse(primes.isPrime(-1));
	}
	
	@Test
	public void testIsPrimeTwo(){
		assertTrue(primes.isPrime(2));
	}
	
	@Test
	public void testIsPrimeSqrt(){
		assertFalse(primes.isPrime(16));
	}
	
	@Test
	public void testIsPrimeFailByLoop(){
		assertFalse(primes.isPrime(20));
	}
	
	@Test
	public void testIsPrimeMinInt(){
		assertFalse(primes.isPrime(Integer.MIN_VALUE));
	}
	
	@Test
	public void testIsPrimeMaxInt(){
		assertTrue(primes.isPrime(Integer.MAX_VALUE));
	}
}
