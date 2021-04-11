package org.howard.edu.lsp.assignment7.tollbooth;

public class CheverletColorado implements Truck{

	private int weight, axel;
	private String truckName;
	
	CheverletColorado(int weight, int axel){
		this.axel = axel;
		this.weight = weight;
		this.truckName = "Chevelet Colorado";
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
	public int getAxel() {
		// TODO Auto-generated method stub
		return axel;
	}
	
	
}
