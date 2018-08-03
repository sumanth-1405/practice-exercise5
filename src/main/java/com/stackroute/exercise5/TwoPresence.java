package com.stackroute.exercise5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoPresence {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String input=sc.nextLine();
		String[] in=input.split(" ");
		Map<String, Boolean> map=new HashMap<String, Boolean>();
		map=presence(in);
		System.out.println(map);
		sc.close();
	}

	private static Map<String, Boolean> presence(String[] in) {
		Map<String, Boolean> map=new HashMap<String, Boolean>();
		for (String value : map.keySet()) {
			  map.put(value, false);
			}
		for (int i = 0; i < in.length; i++) {
	        for (int j = i + 1; j < in.length; j++) {
	            if (in[i].matches(in[j])) {
	            	map.put(in[i], true);	
	            }
	            
	        }
	    }
		return map;
	}
	

}
