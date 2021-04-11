package org.howard.edu.lsp.assignment6.integerset;
/**
 * Name: Carleton Williams
 * Date: 3/1/2021
 */
public class IntegerSetException extends Exception {

	/**
	 * Default constructor of the exception class
	 */
	public IntegerSetException(){
		
	}
	/** The constructor that takes in the specific message to be passed onto its parent class
	 * 
	 * @param message the error message to be shown when an exception is thrown
	 */
	public IntegerSetException(String message) {
		super(message);
	}
}
