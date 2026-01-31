/**
* File: InvalidCalcOperationException.java
* Class: CSCI 1302
* Author: Matteo Ventura, Naomi Oropesa, Sean Roe
* Created on: Feb 28, 2025
* Last Modified: Feb 28, 2025
* Description: finally Clause, Custom Exception classes; Create a custom Exception subclass and then detect any exceptions generated
 				from a working piece of code. 
*/
@SuppressWarnings("serial")
public class InvalidCalcOperationException extends Exception{
	char operation;
		
	public InvalidCalcOperationException() {
		super("Invalid Operation");
	}
	
	public InvalidCalcOperationException(char operation) {
		this();
		this.operation = operation;
	}

	//Accessor and Mutator Methods: operation
	public char getOperation() {
		return operation;
	}
	public void setOperation(char operation) {
		this.operation = operation;
	}
	
	//Override the getMessage() method from the Exception class
	@Override
	public String getMessage() {
		return String.format(super.getMessage() + ": %c was chosen", getOperation());
	}
}
