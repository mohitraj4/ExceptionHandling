package exceptionHandling;

import java.util.Scanner;

class HandleDivide{
	
	public void methods(){
		
	System.out.println("Connection to calculator app is ");
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your first no to divide");
	int num1=sc.nextInt();
	System.out.println("Enter your second no to divide");
	int num2=sc.nextInt();
	int calc=num1/num2;
	System.out.println("Your answer is"+calc);
	
	System.out.println("Code is Terminated Succesfully..");
	}
}
class SecondHandle{
	
	void method2() {
		HandleDivide h=new HandleDivide();
		h.methods();
	}
	
}

public class Handling2 {

	public static void main(String[] args) {
		try {
		SecondHandle sc=new SecondHandle();
		sc.method2();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception handled by main method");
		}
		System.out.println("Code terminated succesfully");

	}

}
