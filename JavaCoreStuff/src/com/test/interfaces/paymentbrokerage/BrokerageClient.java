package com.test.interfaces.paymentbrokerage;

public class BrokerageClient {

	public static void main(String[] args) {

		BrokerageFirm brokerage = new BrokerageFirm();

		CheckingAccount account = new CheckingAccount();
		brokerage.debitFromBankAccount(account, 1000.50);
		
/*		MoneyMarketAccount moneyMarket = new MoneyMarketAccount();
		brokerage.debitFromMoneyMarketAccount(moneyMarket, 1000.50);*/
		
		
		
		
	}

}
