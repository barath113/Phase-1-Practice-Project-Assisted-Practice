package oops;

class Encapsulation 
{ 
    private String Name; 
    private int Roll; 
    private int Age;
    public int getAge()  
    { 
      return Age; 
    } 
    public String getName()  
    { 
      return Name; 
    } 
    public int getRoll()  
    { 
       return Roll; 
    } 
    public void setAge( int newAge) 
    { 
      Age = newAge; 
    } 
    public void setName(String newName) 
    { 
      Name = newName; 
    } 
    public void setRoll( int newRoll)  
    { 
      Roll = newRoll; 
    } 
}
public class usesofEncapsulation {
	public static void main (String[] args)  
    { 
        Encapsulation obj = new Encapsulation(); 
        obj.setName("Barath kumar"); 
        obj.setAge(21); 
        obj.setRoll(113); 
        System.out.println("My Name: " + obj.getName()); 
        System.out.println("My Age: " + obj.getAge()); 
        System.out.println("My Roll.no: " + obj.getRoll());      
    } 

}