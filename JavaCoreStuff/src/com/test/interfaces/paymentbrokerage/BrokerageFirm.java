package com.test.interfaces.paymentbrokerage;

public class BrokerageFirm {
	
	public void debitFromBankAccount(Account account, double amount) {
		System.out.println("Brokerage -- debitFromBankAccount");
		account.debiting();
	}
	
/*	public void creditToBankAccount(Account account, double amount) {
		System.out.println("Brokerage -- creditToBankAccount");
		account.debit();
	}*/
	
/*	public void debitFromBankAccount(CheckingAccount account, double amount) {
		System.out.println("Brokerage -- debitFromBankAccount");
		account.debiting();
	}
	
	public void debitFromMoneyMarketAccount(MoneyMarketAccount account, double amount) {
		System.out.println("Brokerage -- debitFromMoneyMarketAccount");
		account.debiting();
	}*/
	
}
