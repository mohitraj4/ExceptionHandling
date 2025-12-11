package abstractionjava;
class Engine{
	public void start() {
		System.out.println("engine now start");
	}
}

class Car {
	Engine e=new Engine();
	public void setup() {
		
		System.out.println("Now car is going to run on the road ");
	}
	
}

public class HasArelationship {
	public static void main(String[] args) {
		Car c=new Car();
		c.setup();
	}

}
