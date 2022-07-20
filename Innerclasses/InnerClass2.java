package Innerclasses;

public class InnerClass2 {

	private String displaymessage="Inner Class";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(displaymessage);
			 }  
	  }  
	  
	  Inner i=new Inner();  
	  i.msg();
	 }  

	 
	public static void main(String[] args) {
		InnerClass2  ic=new InnerClass2 ();  
		ic.display();  
		}

}
