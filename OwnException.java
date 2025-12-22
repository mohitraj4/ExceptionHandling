package exceptionHandling;
import java.util.*;
class InvalidCustomerException extends Exception
{
	public InvalidCustomerException(String msg) {   //PARAMETER CONSTRUCTOR PASSED
		super(msg);  //CALLING PARENT CLASS
	}

		
}
class ATMSBI{
	int usersid=1234;
	int passwords=112233;
	int uid;
	int pd;	
	public void inputs() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Kindly Enter Your UiserId");
		uid=sc.nextInt();
		System.out.println("Kindly Enter Your Password");
		pd=sc.nextInt();
	}
	public void verifys() throws InvalidCustomerException
	{
		if(usersid==uid && passwords==pd) 
		{
			System.out.println("Collect Your Cash.");
		}
		else
		{
			InvalidCustomerException ice=new InvalidCustomerException("YOU HAVE ENTERED WRONG INPUT..");
		     //System.out.println(ice);
			System.out.println(ice.getMessage());
			throw ice;				
		}
	}	
}
class Bankss{
	public void initiate() {	
		ATMSBI as =new ATMSBI();
		try 
		{
		as.inputs();
		as.verifys();
		}
		catch(InvalidCustomerException e) {
			
			try {
				as.inputs();
				as.verifys();
				}
				catch(InvalidCustomerException e1) {
					
					try {
						as.inputs();
						as.verifys();
						}
						catch(InvalidCustomerException e2) {
							System.out.println("You Have Entered WrongInput So Many Time, CARD BLOCKED.");
							System.exit(0);
						}
				}
		}
		
	}
}

public class OwnException {
	public static void main(String[] args) {
		Bankss b=new Bankss();
			b.initiate();
		
		
	}

}
