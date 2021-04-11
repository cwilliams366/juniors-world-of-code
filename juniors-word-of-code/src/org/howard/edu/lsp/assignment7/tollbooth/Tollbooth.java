package org.howard.edu.lsp.assignment7.tollbooth;

public interface Tollbooth {
	
	
	
	/**
	 * Resets the all receipts saved within archive
	 */
	public void reset();
	/** Calculates the toll of the truck based on axel amount and half-ton 
	 * weight of truck
	 * @param T Takes in truck object for calculation of cosr
	 * @return the price of the cost toll
	 */
	public double calculateToll(Truck T);
	
	/**
	 * String representation of the receipts
	 */
	public void displayData();
}
