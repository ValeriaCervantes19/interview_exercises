package com.training.exercise1;
/*
 * Recibir un string que contenga un número romano y convertirlo a int   MCMXCIV
 */
public class Solution {

	public int romanToInt(String s) {
		
		int result = 0;
		
		StringBuilder revS = new StringBuilder(s);
        revS.reverse();
		//MCMXCIV  -> VICXMCM
        //4
        //104
        //94
        
		int prev = romanValue(revS.charAt(0));
		
		result+=prev;
		for(int i=1; i<revS.length(); i++) {
			
			if(prev <= romanValue(revS.charAt(i))) {
				result += (romanValue(revS.charAt(i)));
			}
			else {
				result-=romanValue(revS.charAt(i));
			}
			//actualizar valor de prev
			prev = romanValue(revS.charAt(i));
		}		
		
		return result;
	}
	
	public int romanValue(char c) {
		switch(c) {
		
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
			
		}
	}
}
