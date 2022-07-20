package methodoverriding;

public class Bike extends Vehicle {

	Bike()
	{
		System.out.println("Bike object: "+this);
	}
	String fuel() {
		return ("Petrol");
	}
}
