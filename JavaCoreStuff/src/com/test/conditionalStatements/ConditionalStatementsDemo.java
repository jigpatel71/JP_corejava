package com.test.conditionalStatements;

public class ConditionalStatementsDemo {
	
	
	public static void main(String[] args) {
//		ifStatementExample();
//		ifStatementExampleWithParameters(30, 50);
		processPayment("square");
	}
	
	public static void processPayment(String paymentType) {
		
		if(paymentType.equalsIgnoreCase("PAYPAL") || paymentType.equalsIgnoreCase("SQUARE")) {
			System.out.println("Payment processed by Paypal/Square");
		} else if(paymentType.equalsIgnoreCase("APPLE")) {
			System.out.println("Payment processed by Apple");
		} else if(paymentType.equalsIgnoreCase("AMAZON")) {
			System.out.println("Payment processed by Amazon");
		} else {
			System.out.println("All other payments processed by Chase");
		}
	}
	
	public static void ifStatementExample() {
		int no1 = 10;
		int no2 = 20;
		
		int sum = no1+no2;
		
		if(sum < 10) {
			System.out.println("sum is greater than 10: "+ sum);
		} else if (sum == 40){
			System.out.println("sum is equal to 40");
		} else if (sum == 60) {
			System.out.println("sum is equal to 60");
		} else  {
			System.out.println("nothing of the above");
		}
	}
	
	public static void ifStatementExampleWithRanges() {
		int no1 = 10;
		int no2 = 20;
		
		int sum = no1+no2;
		
		if(sum > 10 & sum < 20) {
			System.out.println("sum is greater than 10: "+ sum);
		} else if (sum >21 & sum < 41){
			System.out.println("sum is equal to 40");
		} else if (sum > 42 & sum < 60) {
			System.out.println("sum is equal to 60");
		} else  {
			System.out.println("nothing of the above");
		}
	}
	
	public static void ifStatementExampleWithParameters(int no1, int no2) {
		int sum = no1+no2;
		
		if(sum < 10) {
			System.out.println("sum is greater than 10: "+ sum);
		} else if (sum == 40){
			System.out.println("sum is equal to 40");
		} else if (sum == 60) {
			System.out.println("sum is equal to 60");
		} else  {
			System.out.println("nothing of the above");
		}
		
	}
	
}
