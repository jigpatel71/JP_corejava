package com.test.interfaces.paymentbrokerage;

public class MoneyMarketAccount implements Account {
	
	@Override
	public void debiting() {
		System.out.println("MoneyMarket Account debit");		
	}

	@Override
	public void credit() {
		System.out.println("MoneyMarket Account credit");		
	}

}
