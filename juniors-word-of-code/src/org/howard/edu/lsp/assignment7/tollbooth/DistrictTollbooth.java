package org.howard.edu.lsp.assignment7.tollbooth;

import java.util.ArrayList;
import java.util.List;

public class DistrictTollbooth implements Tollbooth {
	
	private List <Truck> truckInfo = new ArrayList<Truck>();
	private final double axleCharge = 5, weightCharge = 10, halfTon = 1000;
	private int truckCount = 0, index = 0;
	private double tollCost = 0, totalReceiptCost = 0;
	
	/**
	 * Displays the receipts count and the erases all saved receipt history within archive
	 * 
	 * @return returns a combined message of the currentRecieptProgress method
	 */
	@Override
	public String reset() {
		String message = "";
		//Display what is planned to be done
		message = ("*****Collecting Receipts*****\n");
		//Display the total receipts
		message += currentReceiptProgress();
		//Reset all info
		totalReceiptCost = 0; 
		truckCount = 0;
		index = 0;
		truckInfo = new ArrayList<Truck>();
		//Return message
		return message;
	}
	
	
	
	/**
	 * Calculate the toll total based on the truck's weight and axle
	 */
	@Override
	public double calculateToll(Truck T) {
	//Toll Cost Equals the (cost per axle) times the amount of axles
	//plus the (truck weight divided by half of a ton) times charge per half ton
	 tollCost = ((axleCharge*T.getAxle()))+(T.getTruckWeight()/halfTon)*weightCharge;
	 //Add total cost to the receipt total
	 totalReceiptCost += tollCost;
	 //Increment the amount of trucks by 1
	 truckCount++;
	 //Add to ArrayList
	 truckInfo.add(T);
	 
	 return tollCost;
	}
	
	
	/**
	 * Display receipt info for a truck
	 * @return return the receipt message of a passing truck
	 */
	@Override
	public String displayData() {
		String message = "";
		for(int i = index; i < truckInfo.size();i++) {
			message =("Truck Arrival\n-------------\nName: "+truckInfo.get(i).getTruckName()+" Axles: "+truckInfo.get(i).getAxle()
					+" Total Weight: "+truckInfo.get(i).getTruckWeight()+" Toll Due: $"+tollCost+"\n");
		}
		//Increment Index
		index++;
		return message;
	}
	
	/**
	 * Displays the current amount of receipts and their info without resetting
	 * @return return the current count of receipts, trucks, and cost
	 */
	@Override
	public String currentReceiptProgress() {
		String message = "";
		message = ("Total since last collection-Receipts: $"+totalReceiptCost+" Trucks: "+truckCount+"\n");
		return message;
	}


	/**
	 * Retrieves the toll cost
	 * @return Returns the toll cost based on the
	 * truck's weight and axle
	 */
	@Override
	public double getTollCost() {
		return tollCost;
	}


	/**Retrieve the total receipt costs of all trucks
	 * @return the total costs of all trucks in receipt
	 */
	@Override
	public double getTotalReceiptCost() {
		return totalReceiptCost;
	}
}

