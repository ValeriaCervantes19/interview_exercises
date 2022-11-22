package com.training.exercise9;

/*
 * Find the greatest common denominator of two numbers
 * Using euclid's algorithm
 */

public class GreatestCommonDenominator {
					// 	20 			8
	public Integer gdc(Integer a, Integer b) {
		Integer t = 0;
		while(b != 0) {
			t = a; // t=20
			a = b; // a=8
			b = t % b; //0
		}
		
		return a;
	}
}
