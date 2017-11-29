package com.rb.hr.complex;

import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * 
 * @author Raul Buibas
 * 
 *         Hypothetical problem: You stole a certain amount of gold. You're on a
 *         train. You must launder the gold, by selling it before you get off
 *         the train. You talk to the passengers, offering them to sell gold.
 *         You must sell all the gold before the train stops.
 * 
 *         Gather the offers and try to maximize your gain. Note that you must
 *         sell ALL the gold. Passengers will by certain amount for certain
 *         price, no bargain. Passengers will not settle for more or less
 *         amount, by changing the price. Everything is fixed.
 * 
 *         Example1:
 * 
 *         You've got 10 grams of gold and 3 passengers offered to buy 3, 8 and
 *         5 grams. You're in trouble since you cannot sell all the gold.
 * 
 *         Example2: You've got 10 grams of gold and 4 passengers offered to buy
 *         6, 4, 3 and 7 grams. Now you can choose, to either buy 6 and 4, or 3
 *         and 7. Maximize the gain.
 *
 */
public class DTSolution {

	public static void main(String[] args) {
		// read the input
		Scanner sc = new Scanner(System.in);

		// raw data input
		// line1:
		// int > number of passengers who agreed to buy (N)
		// int > stolen amount of gold (X)
		// lineN:
		// int > value passenger willing to pay
		// int > grams of gold for which they are paying

		// get raw data into an array
		int rawData[] = null;
		int numBuyers = sc.nextInt();

		try {
			rawData = new int[numBuyers * 2];
		} catch (NoSuchElementException e) {
			// no more lines
		} finally {
			// TODO: add logger
			System.out.printf("Why do I need finally");
		}
		
		// sanity check
		if (rawData == null || rawData.length == 0)
		{
			return;
		}
		
		// get the rest of the values
		for (int i = 0; i < rawData[0] * 2; i++) {
			rawData[i] = sc.nextInt(); // hope data is not corrupted
		}
		
//		for (int temp : rawData)
//			System.out.print(temp + " ");

	}

}
