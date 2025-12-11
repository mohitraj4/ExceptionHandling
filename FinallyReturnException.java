package exceptionHandling;
class main{
	int disp() {
		try {
		System.out.println("Code Started.");  // below return keyword statement is not getting executed.then try to execute with tr() and finally() block.
		return 2;
		}
		finally {
		System.out.println("code ended");
		}
	}
	
}

public class FinallyReturnException {

	public static void main(String[] args) {
		main m=new main();
		m.disp();

	}

}
