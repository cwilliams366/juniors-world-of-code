package org.howard.edu.lsp.assignment7.tollbooth;

public class CheverletColorado implements Truck{

	private int weight, axle;
	private String truckName;
	
	public CheverletColorado(int weight, int axle){
		this.axle = axle;
        this.weight = weight;
		this.truckName = "Cheverlet Colorado";
	}

	@Override
	public String getTruckName() {
		// TODO Auto-generated method stub
		return truckName;
	}

	@Override 
	public int getTruckWeight() {
		// TODO Auto-generated method stub
		return weight;
	}

	@Override
	public int getAxle() {
		// TODO Auto-generated method stub
		return axle;
	}
}
