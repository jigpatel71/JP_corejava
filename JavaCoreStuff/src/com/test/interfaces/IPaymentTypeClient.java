package com.test.interfaces;

public class IPaymentTypeClient {

	public static void main(String[] args) {
		IPaymentType payment = new ChasePaymentProcessor();
		payment.processPayment();
	}

}
