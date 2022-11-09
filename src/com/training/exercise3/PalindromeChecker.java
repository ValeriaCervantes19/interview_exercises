package com.training.exercise3;

/*
 * Check if a word is a palindrome (a word that you can read in the same way if is upside down)
 * Doesn't matter if there are uppercase or lowercase letters
 * Symbols also count just following the rules of a palindrome
 * return true is the word is a palindrome or false in the contrary case
 */

public class PalindromeChecker {
	
	public boolean palindromeCheckerTraditional(String word) {
		
		//hacer toda la cadena a minúscula o mayúscula
		String wordToCompare = word.toLowerCase();
		StringBuilder reversed = new StringBuilder();
		
		//String reversed = StringUtils.reverse(wordToCompare);
		//String reversed = StringBuilder(wordToCompare).reverse().toString();
		
		//guardar la nueva string volteada en variable reversed
		for(int i=wordToCompare.length()-1; i>=0; i--){
			reversed.append(wordToCompare.charAt(i));
		}
		
		return wordToCompare.equals(reversed.toString());
	}
}
