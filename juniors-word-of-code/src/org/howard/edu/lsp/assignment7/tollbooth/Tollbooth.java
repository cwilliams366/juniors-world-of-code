package org.howard.edu.lsp.assignment7.tollbooth;

public interface Tollbooth {
	
	
	
	/**
	 * Resets the all receipts saved within archive
	 * @return 
	 */
	public String reset();
	
	/** Calculates the toll of the truck based on axle amount and half-ton 
	 * weight of truck
	 * @param T Takes in truck object for calculation of cost
	 * @return returns the tollCost 
	 */
	public double calculateToll(Truck T);
	
	/**
	 * Displays the current amount of receipts printed without resetting
	 * @return 
	 */
	public String currentReceiptProgress();
	
	
	/**
	 * String representation of the receipts
	 * @return 
	 * 
	 */
	public String displayData();
	
	/**Retrieves the toll cost of a truck
	 * 
	 * @return the toll cost of truck
	 */
	public double getTollCost();
	
	/**Retrieves the total receipt costs of trucks
	 * 
	 * @return the total receipt costs of all trucks
	 */
	public double getTotalReceiptCost();
	
}
