package com.test.staticexamples;

class StaticInnerClass2{
	   int num;
	   //Static class
	   static class X{
	      static String str="Inside Class X";
//	      num=99;   -- static inner class can't access outer class
	   }
	   public static void main(String args[])
	   {
	      StaticInnerClass2.X obj = new StaticInnerClass2.X();
	      System.out.println("Value of num="+obj.str);
	   }
	}