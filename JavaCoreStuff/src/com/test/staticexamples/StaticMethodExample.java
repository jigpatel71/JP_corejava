package com.test.staticexamples;

public class StaticMethodExample {
	
	 static int i;
	   static String s;
	   public static void main(String args[]) //Its a Static Method
	   {
		   StaticMethodExample obj=new StaticMethodExample();
	       //Non Static variables accessed using object obj
	       System.out.println("i:"+obj.i);
	       System.out.println("s:"+obj.s);
	   }

}
