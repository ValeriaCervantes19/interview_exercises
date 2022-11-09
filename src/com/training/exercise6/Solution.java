package com.training.exercise6;

import java.util.LinkedList;
import java.util.Queue;

/*
 * receive an int number and print all the binary representation numbers until that number, including itself
 */

public class Solution {

	public void printBinary(int number) {
		
		if(number <= 0) {
			System.out.println("There is no binary representation of your number");
			return;
		}
		
		for(int i = 1; i <= number; i++) {
			System.out.println(Integer.toBinaryString(i));
		}
	}
	

	public void printBinaryUsingQueue(int number) {
		
		if(number <= 0) {
			System.out.println("There is no binary representation of your number");
			return;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		//because one is the first binary number
		queue.add(1);
		
		for(int i = 1; i <= number; i++) {
			Integer current = queue.remove();
			System.out.println(current);
			
			queue.add(current * 10);
			queue.add(current * 10+1);
		}
		
		
	}
}
