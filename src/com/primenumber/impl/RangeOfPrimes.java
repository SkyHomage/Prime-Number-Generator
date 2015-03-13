package com.primenumber.impl;

import java.util.List;

public class RangeOfPrimes implements PrimeNumberGenerator{
	
	public List<Integer> generate(int startingValue, int endingValue) {
		
		return null;
	}
	
	

	
	public boolean isPrime(int value) {
		if(value <= 1) return false;
		if(value != 2 && value % 2 == 0) return false;
		int sqrt = (int)Math.sqrt(value);
		for(int i = 3; i <= sqrt; i++){
			if(value % i == 0) return false;
		}
		
		return true;
	}

}
