package com.test.interfaces;

public class ChasePaymentProcessor implements IPaymentType {

	@Override
	public String processPayment() {
			System.out.println("Processing with Chase");
	return null;
	}

}
