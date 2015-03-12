package com.primenumber.test;

import junit.framework.TestCase;

import org.junit.*;

import static org.junit.Assert.*;

import com.primenumber.impl.PrimeNumberGenerator;
import com.primenumber.impl.RangeOfPrimes;

public class PrimeNumberGeneratorTest extends TestCase {

	private PrimeNumberGenerator primes;
	
	@BeforeClass
	public static void setUp(){
		primes = new RangeOfPrimes();
	}
	
	@Test
	public void testZero(){
		
	}
}
