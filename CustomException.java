package exceptionHandling;
import java.util.Scanner;
class Atm{
	int userid=1234;
	int password=1122;
	int uid;
	int pwd;

	public void inputUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your userid");
		uid=sc.nextInt();
		System.out.println("Enter your password");
		pwd=sc.nextInt();
	}
	
	public void verifier() {
		if(uid==userid && pwd==password) {
			System.out.println("Collect your Cash..");
			
		}
		else {
			System.out.println("You are Entered Wrong input.");
		}
	}
}
class Banks{
	
	public void intitialise() {
		Atm a1=new Atm();
		a1.inputUser();
		a1.verifier();
	}
	
}

public class CustomException {
	public static void main(String[] args) {
		Banks b=new Banks();
		b.intitialise();
		
	}

}

