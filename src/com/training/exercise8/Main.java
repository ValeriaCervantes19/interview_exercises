package com.training.exercise8;

public class Main {

	public static void main(String[] args) {
		
		MostRepeatedWord solution = new MostRepeatedWord();
		
		String test = "hi hi hi val val moni moni moni moni";
		
		//the word should be moni
		System.out.println(solution.findMostRepeatedWord(test));

	}

}
