package com.training.exercise7;

public class Main {

	public static void main(String[] args) {
		
		CheckParentheses solution = new CheckParentheses();
		
		String s1 = "(<[]>)";
		String s2 = "[<incre>ment]";
		String s3 = "<increment>";
		String s4 = "()incre<>ment<>[]";
		
		String s5 = "<increment(";
		String s6 = "[)incre]ment(";
		String s7 = "<i(ncre>e)ment";
		String s8 = "(<increment>";
		
		System.out.println(solution.checkParentheses(s1));
		System.out.println(solution.checkParentheses(s2));
		System.out.println(solution.checkParentheses(s3));
		System.out.println(solution.checkParentheses(s4));
		
		System.out.println(solution.checkParentheses(s5));
		System.out.println(solution.checkParentheses(s6));
		System.out.println(solution.checkParentheses(s7));
		System.out.println(solution.checkParentheses(s8));
	}
}
