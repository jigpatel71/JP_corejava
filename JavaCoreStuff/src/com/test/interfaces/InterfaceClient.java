package com.test.interfaces;

public class InterfaceClient {
	
	
	public static void main(String[] args) {
		
		MyInterface myintObj = new MyInterfaceImpl();
		myintObj.work1();
		myintObj.work2();
		
		
	}

}
