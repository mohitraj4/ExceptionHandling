package abstractionjava;
abstract class Loan{
	abstract public void dispInterest();
	public void welcomeNote() {
		System.out.println("Welcome to xxx Bank");
	}
	Loan(){
		System.out.println("play");
	}
}
class HomeLoan extends Loan
{
	public void dispInterest() {
		System.out.println("RI is 17%..");
	}
}
class EducationLoan extends Loan
{
	public void dispInterest() {
		System.out.println("RI is 10%..");
	}
}

public class ExampleAbstract2 {

	public static void main(String[] args) {
	Loan l=new HomeLoan();
	l.dispInterest();
	l.welcomeNote();
	
	System.out.println("==============================");
	
	Loan l1=new EducationLoan();
	l1.dispInterest();
	l1.welcomeNote();

	}

}
