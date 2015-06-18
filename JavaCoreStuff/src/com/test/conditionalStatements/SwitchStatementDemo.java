package com.test.conditionalStatements;

public class SwitchStatementDemo {
	
	public static void main(String[] args) {
		
		printMyPaymentCard('O');
		
	}
	
	public static void printMyPaymentCard(char paymentCard) {
		
//		char paymentCard = 'D'; //V, A, D
		//switch(M)
		//case value:
			// block of code
		//case value:
			// block of code
		//case value:
			// block of code
		//default value:
			// block of code
		
		switch(paymentCard) {
		
		case 'M':
			System.out.println("You have selected Mastercard for your payment");
			break;
		
		case 'D':
			System.out.println("You have selected Discover for your payment");
			break;

		case 'A':
			System.out.println("You have selected AMEX for your payment");
			break;

		default:
			System.out.println("You are paying by cash");
			
		}
		
	}

}
