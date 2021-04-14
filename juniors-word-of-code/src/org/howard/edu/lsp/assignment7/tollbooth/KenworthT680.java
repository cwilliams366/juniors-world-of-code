package org.howard.edu.lsp.assignment7.tollbooth;

public class KenworthT680 implements Truck {
	
	private String name;
	private int weight, axle;
	
	public KenworthT680(int weight, int axle) {
		this.axle = axle;
		this.weight = weight;
		this.name = "Kenworth T680";
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
