package oops;
class Motorcycle  
{ 
    public int gear; 
    public int speed; 
    public Motorcycle(int gear, int speed) 
    { 
        this.gear = gear; 
        this.speed = speed; 
    } 
    public void applyBrake(int decrement) 
    { 
        speed -= decrement; 
    } 
    public void speedUp(int increment) 
    { 
        speed += increment; 
    }  
    public String toString()  
    { 
        return("No of gears are " + gear + "\n" + "Speed of bicycle is " + speed); 
    }  
} 
class MountainBike extends Motorcycle  
{ 
    public int seatHeight; 
    public MountainBike(int gear,int speed,int startHeight) 
    {  
        super(gear, speed); 
        seatHeight = startHeight; 
    }  
    public void setHeight(int newValue) 
    { 
        seatHeight = newValue; 
    } 
    public String toString() 
    { 
        return (super.toString()+ 
                "\nSeat height is "+seatHeight); 
    } 
}
public class Inheritance {
	public static void main(String args[])  
    { 
        MountainBike mb = new MountainBike(4, 180, 50); 
        System.out.println(mb.toString());
    } 

}