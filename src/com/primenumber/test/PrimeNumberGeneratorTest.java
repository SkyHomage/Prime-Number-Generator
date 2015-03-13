package com.primenumber.test;

import java.util.List;

import junit.framework.TestCase;

import org.junit.BeforeClass;
import org.junit.Test;

import com.primenumber.impl.PrimeNumberGenerator;
import com.primenumber.impl.RangeOfPrimes;

public class PrimeNumberGeneratorTest extends TestCase {

	private PrimeNumberGenerator primes;
	
	@BeforeClass
	public void setUp(){
		primes = new RangeOfPrimes();
	}
	

	
	@Test
	//[0, 0]
	public void testRangeZero(){
		assertTrue(primes.generate(0, 0).size() == 0);
	}
	
	@Test
	//[-1, -1]
	public void testRangeNegativeOne(){
		assertTrue(primes.generate(-1, -1).size() == 0);
	}
	
	@Test
	//[Integer.MIN, 0]
	public void testRangeNegativeMin(){
		assertTrue(primes.generate(Integer.MIN_VALUE, 0).size() == 0);
	}
	
	@Test
	//[1,1]
	public void testRangeOne(){
		assertTrue(primes.generate(1, 1).size() == 0);
	}
	
	@Test
	//[1,10]
	public void testRangeTen(){
		List<Integer> list = primes.generate(1, 10);
		int[] expected = new int[]{2, 3, 5, 7};
		boolean isCorrect = true;
		for(int i = 0; i < list.size() && 
				i< expected.length; i++){
			if(list.get(0) != expected[0]){
				isCorrect = false;
				break;
			}
		}
		assertTrue(list.size() == expected.length && isCorrect);
	}
	
	@Test
	//[1, 101]
	public void testRangeHundred(){
		List<Integer> list = primes.generate(1, 101);
		int[] expected = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 
				37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
		boolean isCorrect = true;
		for(int i = 0; i < list.size() && i< expected.length; i++){
			if(list.get(0) != expected[0]){
				isCorrect = false;
				break;
			}
		}
		assertTrue(list.size() == expected.length && isCorrect);
	}
	
	@Test
	//[7900, 7920]
	public void testRangeSevenThousand(){
		List<Integer> list = primes.generate(7900, 7920);
		int[] expected = new int[]{7901,7907, 7919};
		boolean isCorrect = true;
		for(int i = 0; i < list.size() && i< expected.length; i++){
			if(list.get(0) != expected[0]){
				isCorrect = false;
				break;
			}
		}
		assertTrue(list.size() == expected.length && isCorrect);
	}
	
	 @Test
	//[Int.max, Int.max]
	public void testRangeMaxInt(){
		List<Integer> list = primes.generate(Integer.MAX_VALUE, Integer.MAX_VALUE);
		int[] expected = new int[]{Integer.MAX_VALUE};
		boolean isCorrect = true;
		for(int i = 0; i < list.size() && i< expected.length; i++){
			if(list.get(0) != expected[0]){
				isCorrect = false;
				break;
			}
		}
		assertTrue(list.size() == expected.length && isCorrect);
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
	public void testIsPrimeThree(){
		assertTrue(primes.isPrime(3));
	}
	
	@Test
	public void testIsPrimeFive(){
		assertTrue(primes.isPrime(5));
	}
	
	@Test
	public void testIsPrimeSqrt(){
		assertFalse(primes.isPrime(16));
	}
	
	@Test
	public void testIsPrimeFailByLoop(){
		assertFalse(primes.isPrime(49));
	}
	
	@Test
	public void testIsPrimeSucceed(){
		assertTrue(primes.isPrime(7));
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
