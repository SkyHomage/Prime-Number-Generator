package com.primenumber.impl;

import java.util.List;
import java.util.Scanner;

public class Driver {
	static final String prompt = "Driver for printing a range of primes.\n"
			+ "1 - Print primes from [start, end]\n"
			+ "2 - Is Prime (n)?\n"
			+ "3 - Exit";
	static final int MAX_WIDTH = 30;

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice = 0;
		while(choice != 3){
			System.out.println(prompt);
			choice = scn.nextInt();
			executeCommand(choice, scn);
		}
		scn.close();
	}
	private static void executeCommand(int choice, Scanner scn) {
		PrimeNumberGenerator p = new RangeOfPrimes();
		switch(choice){
			case 1:
				System.out.println("Enter range index 1:");
				int start = scn.nextInt();
				System.out.println("Enter range index 2:");
				int end = scn.nextInt();
				printList(p.generate(start, end));
				break;
			case 2:
				System.out.println("Enter number to be tested as prime:");
				int val = scn.nextInt();
				System.out.println(val + " is " + (p.isPrime(val) ? "prime." : " not prime."));
				break;
		}
		
		
	}
	
	private static void printList(List<Integer> list){
		int numOnLine = 0;
		for(int a : list) {
			numOnLine++;
			System.out.print(a +" ");
			if(numOnLine % MAX_WIDTH == 0) System.out.println();
		}
		System.out.println();
	}

}
