package exceptionHandling;

public class NestedTryCatch {

	public static void main(String[] args) {
		System.out.println("CodeStarted=====");
		try 
		{
			System.out.println("parent try class");
			try 
			{
				System.out.println(100/0);
				System.out.println("Sub try class...");
				
			}
			catch(ArithmeticException ae) {
				System.out.println("sub catch block...");
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Parent catch block");
		}
		finally
		{
			System.out.println("code closed=====");
		}
		

	}

}
