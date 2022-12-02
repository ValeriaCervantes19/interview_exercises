package com.training.exercise13;

public class Main {

	public static void main(String[] args) {
		RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();
		
		int[] nums = {1, 1, 2, 3, 4, 5, 5};
		System.out.println("The actual lenght of the array is: "+nums.length);
		System.out.println("The new lenght of the array is: "+solution.removeDuplicates(nums));
	}

}
