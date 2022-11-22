package com.training.exercise12;

/*
    Write a function that reverses a string. The input string is given as an array of characters s.

	You must do this by modifying the input array in-place with O(1) extra memory. Example:
	
	Input: s = ["h","e","l","l","o"]
	Output: ["o","l","l","e","h"]
 */

public class ReverseString {
	
	public void reverseString(char[] s) {
		
		int last = s.length-1;
		char toChange = 'a';
		
		for(int i = 0; i <= last; i++) {
			toChange = s[i];  //h
			s[i] = s[last];	
			s[last] = toChange;
			
			last--;
		}
		
		for(int i = 0; i < s.length; i++) {
			System.out.print(s[i]+" ");
		}
		
	}
}
