package com.rb.hr.complex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DTLaundering {
	
	private int sellingAmount = 0;
	int rawData[] = null;
	List<DTBuyer> buyerList = new ArrayList<DTBuyer>();
	/**
	 * A map of arbitrary amount of buyers
	 */
	Map<List<DTBuyer>, Integer> buyerUnits = new HashMap<List<DTBuyer>, Integer>();
	
	public DTLaundering(int[] rawDataInput, int sellingAmount) {
		// initialize stuff if needed
		this.rawData = rawDataInput;
		setSellingAmount(sellingAmount);
		generateBuyers();
	}
	
	private void generateBuyers()
	{
		for (int i = 0; i < rawData.length; i+=2) {
			buyerList.add(new DTBuyer(rawData[i], rawData[i+1]));
		}
	}
	
	/**
	 * Generate a list of buyers whose buying intentions add up to a total selling amount.
	 * 
	 */
	public void generateBuyerMap() {
		/*
		 * Go through the list of buyers {$buyerList} and compile a list of all possible combinations
		 * of buyers which will result in the total sellingAmount
		 */
		
		if (this.sellingAmount == 0) {
			// we are not selling anything
		}
	}

	public int getSellingAmount() {
		return sellingAmount;
	}

	private void setSellingAmount(int sellingAmount) {
		this.sellingAmount = sellingAmount;
	}

}
