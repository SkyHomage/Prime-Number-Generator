package com.primenumber.impl;

import java.util.LinkedList;
import java.util.List;

public class RangeOfPrimes implements PrimeNumberGenerator{
	
	public List<Integer> generate(int startingValue, int endingValue) {
		
		int start = Math.min(startingValue, endingValue);
		int end = Math.max(startingValue, endingValue);
		
		List<Integer> primes = new LinkedList<Integer>();
		for(int i = start; i <= end; i++){
			if(isPrime(i)) primes.add(i);
		}
		
		return primes;
	}
	
	

	
	public boolean isPrime(int value) {
		if(value <= 1) return false;
		if(value == 2) return true;
		int sqrt = (int)Math.sqrt(value);
		if(sqrt*sqrt == value) return false;

		for(int i = 2; i <= sqrt; i++){
			if(value % i == 0) return false;
		}
		
		return true;
	}

}
