package com.stackroute.exercise5;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * @author sumanth reddy
 * method to exchange
 */
public class ExchangeValues {
	public static void main(String[] args) {
		LinkedHashMap<String, String> hmap = new LinkedHashMap<String, String>();
		Scanner input = new Scanner(System.in);
		for (int i = 1; i < 3; i++) {
			String a = "val" + i;
			String b = input.next();
			hmap.put(a, b);
		}
		System.out.println(hmap);
		hmap = exchanger(hmap);
		System.out.println(hmap);
		input.close();

	}

	/**
	 * @param hmap
	 * @return hmap
	 * method to exchange and replace values
	 */
	public static LinkedHashMap<String, String> exchanger(LinkedHashMap<String, String> hmap) {
		String value = hmap.get("val1");
		hmap.replace("val1", " ");
		hmap.replace("val2", value);
		return hmap;
	}

}
