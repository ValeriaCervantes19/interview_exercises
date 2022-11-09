package com.training.exercise8;

import java.util.HashMap;
import java.util.Map;

/*
 * Determine the most repeated word in a given string
 * -> a word is defined to be separated by either spaces or punctuation
 * Example: "She enjoys apples, bananas, and oranges"
 * Words: {She, enjoys, apples, bananas, and, oranges}
 * -> letters can be uppercase or lowercase
 * If two words are repeated an equal number of times, wichever set of words came first should be returned
 */

public class Solution {

	public String findMostRepeatedWord(String input) {
		
		String lowercased = input.toLowerCase().trim();
		String[] words = lowercased.split(" ");
		
		if(words.length == 0) {
			System.out.println("No unique words in input");
		}
		
		Map<String, Integer> wordCountMap = new HashMap<>();
		
		for(String word : words) {
			//if the word is already in the map, add one in the counter(value)
			if(wordCountMap.containsKey(word)) {
				wordCountMap.put(word, wordCountMap.get(word)+1);
			}
			else {
				wordCountMap.put(word, 1);
			}
		}
		
		int max = 0;
		String mostRepeatedWord = "";
		for(String key : wordCountMap.keySet()) {
			int currentValue = wordCountMap.get(key);
			if(currentValue > max) {
				mostRepeatedWord = key;
				max = currentValue;
			}
		}
		
		System.out.println("Most repeated word: "+ mostRepeatedWord+" \nRepeated: "+max+" times");
		
		return mostRepeatedWord;
	}
}
