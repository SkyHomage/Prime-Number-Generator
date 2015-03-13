package com.primenumber.impl;

import java.util.LinkedList;
import java.util.List;

public class RangeOfPrimes implements PrimeNumberGenerator{
	/*
	 * (non-Javadoc)
	 * @see com.primenumber.impl.PrimeNumberGenerator#generate(int, int)
	 */
	public List<Integer> generate(int startingValue, int endingValue) {
		//can elect to do if statements to set indices but setting max/min makes code cleaner and more obvious 
		int start = Math.min(startingValue, endingValue);
		int end = Math.max(startingValue, endingValue);
		
		start = Math.max(0, start); //dont waste time on negative range
		
		List<Integer> primes = new LinkedList<Integer>();
		
		//again discard negative with i >= 0 but this time it saves us from overflow
		for(int i = start; i <= end && i >=0; i++){
			if(isPrime(i)){
				primes.add(i);
			}
		}
		return primes;
	}
	

	/*
	 * (non-Javadoc)
	 * @see com.primenumber.impl.PrimeNumberGenerator#isPrime(int)
	 */
	public boolean isPrime(int value) {
		//we can early terminate since the first prime starts at 2 and by testing sqrt
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
