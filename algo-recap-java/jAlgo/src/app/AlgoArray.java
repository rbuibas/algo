package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlgoArray {

	/**
	 * Find missing number(s) in an array containing a series of numbers.
	 * 
	 * @param from
	 * @param to
	 * @param array
	 * @return
	 */
	public int findMissingNumber(int from, int to, int[] array) {
		final int matSum = to * (from + to) / 2;
//		final int actSum = Arrays.stream(array).reduce(0, (a,b) -> a + b);
		final int actSum = Arrays.stream(array).reduce(0, Integer::sum);
		return matSum - actSum;
	}

	public int[] getDuplicates(int[] array) {
		if (array.length <= 1) {
			System.out.println("To small.");
		}
		Arrays.sort(array);
		Map<Integer, Integer> dups = new HashMap<Integer, Integer>();
		int count = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] == array[i - 1]) {
				dups.put(array[i], ++count);
			} else {
				count = 1;
			}
		}

		int[] dupKeys = new int[dups.keySet().size()];
		int i = 0;
		for (int key : dups.keySet()) {
			dupKeys[i++] = key;
		}

		return dupKeys;
	}

	public int[] removeDuplicates(int[] array) {
		if (array.length <= 1) {
			System.out.println("To small.");
		}
		Arrays.sort(array);
		List<Integer> finalArray = new ArrayList<Integer>();
		finalArray.add(array[0]);
		for (int i = 1; i < array.length; i++) {
			if (array[i] != (int) finalArray.get(finalArray.size() - 1)) {
				finalArray.add(array[i]);
			}
		}

		int[] toRet = new int[finalArray.size()];
		for (int i = 0; i < finalArray.size(); i++) {
			toRet[i] = finalArray.get(i);
		}
		return toRet;
	}

	public String reverseString(String string) {
		char[] stringArray = string.toCharArray();
		int front = 0;
		int back = string.length() -1;
		while (front < back) {
			char temp = stringArray[front];
			stringArray[front++] = stringArray[back];
			stringArray[back--] = temp;
		}
		return new String(stringArray);
	}
	
	public String reverseStringRecursive(String string) {
		if (string.length() < 2) {
			return string;
		}
		return reverseString(string.substring(1)) + string.charAt(0);
	}
}