package exceptionHandling;

class Main89{
	void disp() {
		try {
		System.out.println("code started");
		System.exit(0);
		}
		finally {
		System.out.println("code ended");
	}}
}

public class ReturnVoid {
	public static void main(String[] args) {
		Main89 m1=new Main89();
		m1.disp();
	}
}
