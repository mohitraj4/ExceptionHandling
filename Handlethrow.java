package exceptionHandling;

import java.util.Scanner;

class HandleSelf {
	public void m1 () throws ArithmeticException 
	{
		try {
		System.out.println("Code calc connected to calculator succesfully");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number to divide");
		int nums1=sc.nextInt();
		System.out.println("Enter second number to divide");
		int nums2=sc.nextInt();
		int value=nums1/nums2;
		System.out.println("The value is "+value);
		
		}
		catch(ArithmeticException e) {
			System.out.println("Exception is handled in parent class");
			throw e;
		}
		finally {
		System.out.println("Code Terminated Succesfully");
		}
		
	}
	
}

public class Handlethrow {
	public static void main(String[] args) 
	{	
		try {
		System.out.println("Main method Connection");
		HandleSelf h=new HandleSelf();
		h.m1();	
		}
		catch(Exception e) {
			System.out.println("Exaception handled in main");
		}
	}
}
