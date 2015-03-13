package com.primenumber.impl;

import java.util.List;
import java.util.Scanner;

public class Driver {
	static final String prompt = "Driver for printing a range of primes.\n"
			+ "1 - Print primes from [start, end]\n"
			+ "2 - Is Prime (n)?\n"
			+ "3 - Exit";
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int choice = 4;
		while(choice != 3){
			System.out.println(prompt);
			choice = scn.nextInt();
			executeCommand(choice, scn);
		}
		

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
		scn.close();
		
	}
	
	private static void printList(List<Integer> list){
		for(int a : list) System.out.print(a +" ");
		System.out.println();
	}

}
