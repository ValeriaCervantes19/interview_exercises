package com.training.exercise10;

/*
 * Return the factorial of a given number
 */

public class Factorial {
	
	//recursive function
	public Integer factorial(Integer num) {
		if(num == 0) {
			return 1;
		}
		else{
			return num*factorial(num-1);
		}
	}
}
