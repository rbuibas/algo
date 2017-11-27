package com.rb.hr.statistics.mmm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		int[] testArray = { 64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060 };

		System.out.println("Call");
		getMMM(testArray);
		System.out.println("Call End");

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String input = scan.nextLine();

		String[] inputArray = input.split(" ");

		int[] inputIntArray = new int[inputArray.length];

		for (int i = 0; i < inputArray.length; i++) {
			try {
				inputIntArray[i] = Integer.parseInt(inputArray[i]);
			} catch (NumberFormatException e) {
				System.err.println(e.getMessage());
			}
		}

		// now process them

	}

	private static void getMMM(int[] array) {

		// lets do some Java 8 cool stuff

		double mean = 0;
		double median = 0;
		int mode = 0;

		Arrays.parallelSort(array);

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			mean += array[i];
		}

		// get mean
		mean /= array.length;
		// get median
		if (array.length % 2 == 1) {
			// odd thing to say
			median = array[array.length/2+1];
		}
		else {
			median = (double) (array[array.length/2] + array[array.length/2 - 1])/2;
		}
		// get mode (complicated)
		
		
		System.out.println("mean = " + mean);
		System.out.println("median = " + median);
		System.out.println("mode = " + getMode(array));
	}
	
	private static int getMode(int[] array) {
		Map<Integer, Integer> modeMap = new HashMap<Integer, Integer>();
		int maxMode = 1;
		int modeValue = 0;
		for (int i : array) {
			int tempCount = 0;
			if (modeMap.containsKey(i)) {
				tempCount = modeMap.get(i) + 1;
			} else {
				tempCount = 1;
			}
			modeMap.put(i, tempCount);
			
			if (tempCount > maxMode) {
				maxMode = tempCount;
				modeValue = i;
			}
		}
		
		return modeValue;
	}

}
