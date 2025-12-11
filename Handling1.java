package exceptionHandling;

public class Handling1 {

	public static void main(String[] args) {
		System.out.println("Code Started....");
		try {
			int a=10;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("code completed");

	}

}
