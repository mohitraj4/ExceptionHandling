package exceptionHandling;
import java.util.Scanner;

public class BasicExample {
	public static void main(String[] args) throws Exception {
		System.out.println("Code started to calculate");
		try {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first no to divide");
		int num1=sc.nextInt();
		System.out.println("Enter your second no to divide");
		int num2=sc.nextInt();
		int calc=num1/num2;
		System.out.println("Your answer is"+calc);
		}
		catch(Exception e)
		{
			System.out.println("You are trying to divide by wrong input");
		}
		System.out.println("Code is Terminated Succesfully..");
	}

}
