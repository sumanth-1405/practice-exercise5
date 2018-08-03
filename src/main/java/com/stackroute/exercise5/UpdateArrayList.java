package com.stackroute.exercise5;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sumanth reddy 
 * program to update Array list
 */
public class UpdateArrayList {
	public static void main(String[] args) {
		List<String> list_Strings = new ArrayList<String>();
		list_Strings.add("apple");
		list_Strings.add("Grape");
		list_Strings.add("melon");
		list_Strings.add("Berry");
		List<String> updated = update(list_Strings);
		System.out.println(updated);
		List<String> emptied = emptier(updated);
		System.out.println("Array list after removing all elements" + emptied);

	}

	/**
	 * @param updated
	 * method to empty the array list
	 */
	private static List<String> emptier(List<String> updated) {
		updated.clear();
		return updated;
	}

	/**
	 * @param list_Strings
	 * method to update specific array elements with given element
	 */
	private static List<String> update(List<String> list_Strings) {
		list_Strings.set(0, "Kiwi");
		list_Strings.set(2, "Mango");
		return list_Strings;
	}
}