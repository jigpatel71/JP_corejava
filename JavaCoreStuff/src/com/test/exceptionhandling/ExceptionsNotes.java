package com.test.exceptionhandling;

public class ExceptionsNotes {

	
	// Exceptions are nothing but interruptions to the normal process flow. They are all originated from:
	// Throwable super class. It has exceptions  and errors as subclasses. 
	// Errors are caused due to hardware/sw issues and should not be caught
	
	//Exceptions should be caught - They are checked and unchecked exceptions.
	//RuntimeException is the superclass of all the exceptions thrown during the normal operation of jvm. It is 
	//unchecked exception.
	
	//Unchecked exception (Runtime exception) - They are not checked at compile time. Compiler will not force you to catch them.
	//Examples: 
		//NullPointerException
		//ArrayIndexOutOfBoundsException
		//ArithmeticException
		//IllegalArgumentException
	
	//Checked exception - Checked at compile time. Should be handled using the try/catch block or using throws keyword.
	//Examples:
		//SQLException
		//IOException
		//DataAccessException
	
	//finally block - this always gets executed
}
