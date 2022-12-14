package com.training.exercise11;

import java.util.HashMap;
import java.util.Map;

/*
 
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

example: 
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

 */

public class IndexOfSum {
	
	public int[] twoSum(int[] nums, int target) {
		
		int[] answer = new int[2];
		int difference = 0;
		//  num		 position
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			difference = target-nums[i];
			if(map.containsKey(difference)) {
				answer[0] = map.get(difference);
				answer[1] = i;
			}
			else {
				map.put(nums[i], i);
			}
		}
		
		return answer;
	}
}
