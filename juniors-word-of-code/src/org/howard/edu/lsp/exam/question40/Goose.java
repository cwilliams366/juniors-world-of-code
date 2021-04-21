package org.howard.edu.lsp.exam.question40;

public class Goose extends Animal implements Flying {
	
	/**
	 * Enables the goose to fly
	 * @return the string message
	 */
	public String move() {
		return("Goose moves forward");
	}
	
	/**
	 * Enables the goose to speak
	 * @return the string message
	 */
	public String speak() {
		return("Goose speaks");
	}
	
	/**
	 * Enables the goose to fly
	 * @return the string message
	 */
	@Override
	public String fly() {
		return("Goose flies");
	}
}
