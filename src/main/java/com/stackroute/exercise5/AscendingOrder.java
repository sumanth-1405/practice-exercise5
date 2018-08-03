package com.stackroute.exercise5;

import java.util.Scanner;

/**
 * @author sumanth reddy 
 * program to sort the names given using set
 */
public class AscendingOrder {
	public static void main(String args[]) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string ");
		String str = sc.nextLine();
		String[] stringarray = str.trim().split(" ");
		String[] sorted = wordsSort(stringarray);
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}

	}

	/**
	 * @param stringarray 
	 * method to sort the given names in ascending order
	 */
	public static String[] wordsSort(String[] stringarray) {
		String temp;
		for (int i = 0; i < stringarray.length; i++) {
			for (int j = i + 1; j < stringarray.length; j++) {
				if (stringarray[i].compareTo(stringarray[j]) > 0) {
					temp = stringarray[i];
					stringarray[i] = stringarray[j];
					stringarray[j] = temp;

				}
			}
		}
		return stringarray;

	}
}
