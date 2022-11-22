package com.training.exercise4;

public class Main {

	public static void main(String[] args) {
		
		String s1 = "HellO";
		String s2 = " there is a quiet Mouse";
		String s3 = "I am Happy";
		
		VowelsAndConsonants solution = new VowelsAndConsonants();
		
		solution.findNumberOfVowelsAndConsonants(s1);
		solution.findNumberOfVowelsAndConsonants(s2);
		solution.findNumberOfVowelsAndConsonants(s3);
	}
}
