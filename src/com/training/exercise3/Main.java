package com.training.exercise3;

public class Main {

	public static void main(String[] args) {
		String s1 = "maDam";
		String s2 = "raceCar";
		String s3 = "abBa";
		String s4 = "hey";
		String s5 = "wiFi";
		
		PalindromeChecker palindrome = new PalindromeChecker();
		
		//true
		System.out.println(palindrome.palindromeCheckerTraditional(s1));
		//true
		System.out.println(palindrome.palindromeCheckerTraditional(s2));
		//true
		System.out.println(palindrome.palindromeCheckerTraditional(s3));
		//false
		System.out.println(palindrome.palindromeCheckerTraditional(s4));
		//false
		System.out.println(palindrome.palindromeCheckerTraditional(s5));
	}

}
