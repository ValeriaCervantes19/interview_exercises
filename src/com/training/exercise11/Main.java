package com.training.exercise11;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = {3,2,4};
		int target = 6;
		IndexOfSum solution = new IndexOfSum();
		
		int[] answer = solution.twoSum(nums, target);
		
		System.out.println("The answer is: "+ answer[0]+" "+answer[1]);
	}
}
