package com.training.exercise3;

/*
 * checar si una palabra es palíndromo (se lee igual al revés)  
 * No importa si hay mayúsculas o mínusculas, se toman igual
 * Los símbolos también se toman en cuenta, siempre y cuando sigan las reglas de ser palíndromo
 * regresar true si es palíndromo, false en caso contrario
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
