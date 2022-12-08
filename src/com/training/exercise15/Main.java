package com.training.exercise15;

public class Main {

	public static void main(String[] args) {
		MajorityElement mj = new MajorityElement();
		
		int[] nums = {2,2,1,1,1,2,2};
		
		int result = mj.majorityElement(nums);
		System.out.print("The result is: "+result);

	}

}
