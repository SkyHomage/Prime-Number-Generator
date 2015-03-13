package com.primenumber.impl;

import java.util.LinkedList;
import java.util.List;
/*
 * This class is an implementation of PrimeNumber Generator which allows the displaying and testing of primes.
 */
public class RangeOfPrimes implements PrimeNumberGenerator{
	
	/*
	 * Generates all primes in range from start to end inclusively. 
	 * The method will search in ascending order regardless of the order given.
	 * Primes are tested to be prime by the isPrime method.
	 * 
	 * @param startingValue the value at which the method will start the range search, 
	 * in case startingValue > endingValue, startingValue = endingValue
	 * @param endingValue the value at which the method will end the range search, 
	 * in case endingValue < startingValue, endingValue = startingValue
	 * 
	 * @return List<Integer> of found primes in range from startingValue to endingValue inclusively.
	 *  Returns empty list if no values are found.
	 * 
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
	 * This method is used to test if value is prime. 
	 * 
	 * @param value the natural number for which is to be tested if it is prime.
	 * 
	 * @return true is value is prime, false if value is non-prime.
	 */
	public boolean isPrime(int value) {
		
		if(value <= 1) return false;
		if(value == 2 || value == 3) return true; //since we start loop at 3 we must test if value if first 2 primes
		if(value % 2 == 0 || value % 3 == 0) return false;
		int sqrt = (int)Math.sqrt(value);
		if(sqrt*sqrt == value) return false;
		
		//we can skip every even number since they are divisible by 2 and we already tested that
		for(int i = 3; i <= sqrt; i += 2){
			if(value % i == 0) return false;
		}
		
		return true;
	}

}
