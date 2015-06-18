package com.test.interfaces.paymentbrokerage;

public class CheckingAccount implements Account {

	@Override
	public void debiting() {
		System.out.println("Checking Account debit");		
	}

	@Override
	public void credit() {
		System.out.println("Checking Account credit");		
	}

}
