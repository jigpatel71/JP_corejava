package com.test.exceptionhandling;

public class UncheckedExampleException {
	
	public static void main(String[] args) {
		UncheckedExampleException unchecked = new UncheckedExampleException();
//		unchecked.uncheckedExample1();
//		unchecked.uncheckedExample2();
//		unchecked.uncheckedExample2Catch();
//    	unchecked.uncheckedExampleMultipleCatches();
		unchecked.uncheckedExample2FinallyBlock();
	}

	
	public void uncheckedExample1() {

		int num1=10;
		int num2=0;

		int res=num1/num2;
		System.out.println(res);
	}
	
	public void uncheckedExample2() {
		
		int arr[] = {1,2,3,4,5};
		System.out.println("value of arr[7]:" + arr[7]);
		
		System.out.println("After the exception");
	}
	
	public void uncheckedExample2Catch() {
		
		try {
			int arr[] = {1,2,3,4,5};
			
			int division = 3/0;
			System.out.println("value of arr[7]:" + arr[7]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The specified index does not exist " +
					"in array. Please correct the error.");
		} catch (ArithmeticException ae) {
			System.out.println("Please don't divide by zero. Please correct the error.");
		}
		System.out.println("After the exception");
	}
	
	public void uncheckedExampleMultipleCatches() {
		
		try {
			int division = 3/0;
			
			int arr[] = {1,2,3,4,5};
			System.out.println("value of arr[7]:" + arr[7]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("The specified index does not exist " +
					"in array. Please correct the error.");
		} 
		catch (ArithmeticException e){
			System.out.println("Catch ArithmeticException block");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.out.println("Catch All block");
		}
		System.out.println("After the exception");
	}
	
	public void uncheckedExample2FinallyBlock() {
		
		try {
			int division = 3/0;
			int arr[] = {1,2,3,4,5};
			System.out.println("value of arr[7]:" + arr[7]);
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("The specified index does not exist " +
					"in array. Please correct the error.");
		} catch (NullPointerException e){
			System.out.println("The specified index does not exist " +
					"in array. Please correct the error.");
		} catch (Exception e) {
			System.out.println("Catch All");
		} finally {
			System.out.println("finally block");
		}
		System.out.println("After the exception");
	}
}
