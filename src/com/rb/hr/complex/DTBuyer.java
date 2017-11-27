package com.rb.hr.complex;

public class DTBuyer {
	
	private int amount;
	private int price;
	private float pricePerGram;
	
	public DTBuyer(int amount, int price)
	{
		setAmount(amount);
		setPrice(price);
		// calculate price per gram
		setPricePerGram(amount/price);
	}

	// Getter/Setter
	
	public int getAmount() {
		return amount;
	}

	private void setAmount(int amount) {
		this.amount = amount;
	}

	public int getPrice() {
		return price;
	}

	private void setPrice(int price) {
		this.price = price;
	}

	public float getPricePerGram() {
		return pricePerGram;
	}
	
	private void setPricePerGram(float ppg) {
		this.pricePerGram = ppg;
	}
}
