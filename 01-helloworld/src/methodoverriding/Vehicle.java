package methodoverriding;

public class Vehicle {
	
	Vehicle()
	{
		System.out.println("Vehicle object: "+this);
	}
	
	String fuel() {
		return ("CNG");
	}

}
