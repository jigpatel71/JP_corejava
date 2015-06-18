package com.test.interfaces.paymentbrokerage;

public class SavingsAccount implements Account {

	@Override
	public void debiting() {
		System.out.println("Saving Account debit");		
	}

	@Override
	public void credit() {
		System.out.println("Saving Account credit");		
	}

}