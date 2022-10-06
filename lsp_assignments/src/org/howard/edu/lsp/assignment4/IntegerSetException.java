package org.howard.edu.lsp.assignment4;

/**
 * Throws an exception
 * @author pradep
 *
 */
@SuppressWarnings("serial")
public class IntegerSetException extends Exception{
	/**
	 * 
	 */
	public IntegerSetException() {
		super("The set is empty.");
	}
}