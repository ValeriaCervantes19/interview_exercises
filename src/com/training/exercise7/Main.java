package com.training.exercise7;

public class Main {

	public static void main(String[] args) {
		
		Solution solution = new Solution();
		
		String s1 = "(<[]>)";
		String s2 = "[<incre>ment]";
		String s3 = "<increment>";
		String s4 = "()incre<>ment<>[]";
		
		String s5 = "<increment(";
		String s6 = "[)incre]ment(";
		String s7 = "<i(ncre>e)ment";
		String s8 = "(<increment>";
		
		System.out.println(solution.checkParentesis(s1));
		System.out.println(solution.checkParentesis(s2));
		System.out.println(solution.checkParentesis(s3));
		System.out.println(solution.checkParentesis(s4));
		
		System.out.println(solution.checkParentesis(s5));
		System.out.println(solution.checkParentesis(s6));
		System.out.println(solution.checkParentesis(s7));
		System.out.println(solution.checkParentesis(s8));
	}
}
