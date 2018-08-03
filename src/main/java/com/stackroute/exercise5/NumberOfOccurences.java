package com.stackroute.exercise5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author sumanth reddy
 * program to find occurences
 */
public class NumberOfOccurences {
	
	public static void main(String[] args) {
		String str = "one one -one___two,,three,one @three*one?two";
		Map<String, Integer> out = counter(str);
		System.out.println(out);
	}

	/**
	 * @param str
	 * @return map
	 * method to count the number of occurences of a string
	 */
	public static Map<String, Integer> counter(String str) {
		String[] arr = str.split("[\\W_]+");
		int countone = 0, counttwo = 0, countthree = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].matches("one")) {
				countone++;
			} else if (arr[i].matches("two")) {
				counttwo++;
			} else if (arr[i].matches("three")) {
				countthree++;
			}
		}
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", countone);
		map.put("two", counttwo);
		map.put("three", countthree);
		return map;

	}

}
