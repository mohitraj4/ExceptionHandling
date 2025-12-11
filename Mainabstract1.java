package abstractionjava;
abstract class animal{
    public abstract void eat();    // FUNCTIONALITY
	public abstract void sound();
	
}
class Dog extends animal
{
	public void eat() {
		System.out.println("Dog eats Egg");  //  HIDING IMPLEMENTATION
	}
	public void sound() {
		System.out.println("Dog is barking...");
	}
}
class Lion extends animal
{
	public void eat() {
		System.out.println("Lion eats Meat");
	}
	public void sound() {
		System.out.println("Lion is roar...");
	}
}

public class Mainabstract1 {

	public static void main(String[] args) {
		animal a=new Dog();
		a.eat();a.sound();
		
		System.out.println("============================");
		
		animal l=new Lion();
		l.eat();l.sound();
	}

}
