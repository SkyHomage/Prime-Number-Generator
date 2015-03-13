package com.primenumber.impl;

import java.util.List;

/*
 * Interface for a prime number generator. 
 * A prime number is a natural number which has only two distinct natural number divisors: 1 and itself.
 */
public interface PrimeNumberGenerator {
	
	List<Integer> generate(int startingValue, int endingValue);
	boolean isPrime(int value);
}
