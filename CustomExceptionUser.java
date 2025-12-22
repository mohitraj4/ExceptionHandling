package exceptionHandling;
import java.util.*;
class UnderAgeException extends Exception{
	public UnderAgeException(String msg) {
		super(msg);
	}
}
class OverAgeException extends Exception{
	public OverAgeException(String msg1) {
		super(msg1);
	}
}
class Applicant{
	int age;
	
	public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Age For Applying License");
		age=sc.nextInt();
	}
	public void verify()throws Exception {
		if(age<18) {
			UnderAgeException uae=new UnderAgeException("You are UnderAge,Wait for Some time");
		    System.out.println(uae.getMessage());
		    throw uae;
		}
		else if(age>70) {
			OverAgeException oae=new OverAgeException("Your time is up, Cannot apply");
		    System.out.println(oae.getMessage());
		    throw oae;
		}
		else {
			System.out.println("You are eligible for apply");
		}
	}
	
}
class RTO{
	public void initiate() {
		Applicant a=new Applicant();
		try {
			a.input();
			a.verify();			
		}
		catch(Exception e) {
			try {
				a.input();
				a.verify();
				
			}
			catch(Exception e1) {
				try {
					a.input();
					a.verify();
					
				}
				catch(Exception e2) {
					System.out.println("Have Patience, Please first try to Read Rules & Regulations");
					System.exit(0);
				}
			}			
		}
	}
}


public class CustomExceptionUser {

	public static void main(String[] args) {
		RTO r=new RTO();
		r.initiate();
	}

}
