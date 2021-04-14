package org.howard.edu.lsp.assignment7.tollbooth;

public class ToyotaLandCruiser implements Truck {
	
	private String name;
	private int weight, axle;
	
	public ToyotaLandCruiser(int weight, int axle) {
		this.weight = weight;
		this.axle = axle;
		this.name = "Toyota LandCruiser";
	}

	@Override
	public String getTruckName() {
		return name;
	}

	@Override
	public int getTruckWeight() {
		return weight;
	}


	@Override
	public int getAxle() {
		return axle;
	}

}
