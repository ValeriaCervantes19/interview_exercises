package com.training.exercise7;

import java.util.Map;
import java.util.Stack;

/*
 * return a boolean true if there are both parentheses for opening and closing, but false in the contrary case
 * 
 */

public class Solution {
	
	public boolean checkParentheses(String str) { 
	    
		Stack<Character> stack = new Stack<Character>();
		Map<Character, Character> blockSymbols = Map.of(')', '(', ']', '[', '>', '<');
		
		for(int i = 0; i < str.length(); i++) {
			char current = str.charAt(i);
			
			if(blockSymbols.containsValue(current)) {
				stack.push(current);
				continue;
			}
			
			if(blockSymbols.containsKey(current) && (stack.isEmpty() || blockSymbols.get(current) != stack.pop())) {
				return false;
			}
		}
		
		return stack.isEmpty();
		
	}
}
