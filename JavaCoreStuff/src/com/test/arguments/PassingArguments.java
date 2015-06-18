package com.test.arguments;

public class PassingArguments {

	public static void main(String[] args) {
		System.out.println(args.length);
		for(int i =0; i<args.length; i++) {
			System.out.println("val at " + i + "is: " + args[i]);
		}
	}

}
