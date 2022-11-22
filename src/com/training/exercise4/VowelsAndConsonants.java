package com.training.exercise4;

/*
 * Create a function that receives a string and print the number of vowels and consonants that has
 * -> doesn't matter if it has uppercase or lowercase letters
 */

public class VowelsAndConsonants {
	
	public void findNumberOfVowelsAndConsonants(String input) {
		//hacer toda la cadena a minúscula o mayúscula
		String wordToCompare = input.toLowerCase();
		String vowels = "aeiouy";
		char[] wordArray = wordToCompare.toCharArray();
		int vowelsCounter = 0;
		int consonantCounter = 0;
		
		for(char c: wordArray) {
			//indexOf regresa -1 cuando no hay un elemento 
			if(vowels.indexOf(c) != -1) {
				vowelsCounter++;
			}
			//si no es vocal ni un espacio en blanco, será una consonante
			else if(c != ' ') {
				consonantCounter++;
			}
		}
		
		System.out.println("There are "+ vowelsCounter+" vowels in "+ input);
		System.out.println("There are "+ consonantCounter+" consonants in "+input);
	}
}
