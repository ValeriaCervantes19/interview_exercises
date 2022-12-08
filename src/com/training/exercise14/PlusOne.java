package com.training.exercise14;

/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith 
 * digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. 
 * The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits. Example:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */

public class PlusOne {
	
	public int[] plusOne(int[] digits) {
		
		int[] result = new int[2];
		
		if(digits[digits.length-1]==9) {
			
		}
		
		if(digits.length == 1) {
			if(digits[0]==9) {
				result[0]=1;
				result[1]=0;
				return result;
			}
			digits[0] = digits[0]+1;
			return digits;
		}
		else if(digits.length == 0) {
			return digits;
		}
		else {
			digits[digits.length-1] = digits[digits.length-1] +1;
			return digits;
		}
	}
}
