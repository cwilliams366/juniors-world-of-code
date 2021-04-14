package org.howard.edu.lsp.assignment7.tollbooth;

public class VolkswagenAmarok implements Truck {

	private String name;
	private int weight, axle;
	
	public VolkswagenAmarok(int weight, int axle) {
		this.weight = weight;
		this.axle = axle;
		this.name = "Volkswagen Amarok";
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
