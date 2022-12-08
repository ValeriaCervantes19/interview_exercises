package com.training.exercise14;

public class Main {

	public static void main(String[] args) {
		
		PlusOne pOne = new PlusOne();
		int[] digits = {0};
		
		int[] result = pOne.plusOne(digits);
		
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i]+" ");
		}

	}

}
