package com.training.exercise2;

public class Main {

	public static void main(String[] args) {
		LongestCommonPrefix solution = new LongestCommonPrefix();
		
		String[] words = {"carro", "cartulina", "carniceria"};
		
		String prefix = solution.longestCommonPrefix(words);

		System.out.println(prefix);
	}

}
