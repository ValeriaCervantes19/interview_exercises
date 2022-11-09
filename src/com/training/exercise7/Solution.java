package com.training.exercise7;

import java.util.Map;
import java.util.Stack;

/*
 * regresar un booleano true en caso de que los paréntesis tengan cierra, un false en caso contrario
 */

public class Solution {
	
	public boolean checkParentesis(String str) {
	    
		Stack<Character> stack = new Stack();
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
