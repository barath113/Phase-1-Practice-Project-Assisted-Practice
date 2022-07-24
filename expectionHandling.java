package AssitedProject2;
class MyExceptionhandling extends Exception
   {
	   String str1;
	   MyExceptionhandling(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyExceptionhandling Occurred: "+str1) ;
	   }
	}

public class expectionHandling {
	public static void main(String args[]){
		try{
			System.out.println("Start Try block");
			throw new MyExceptionhandling("My error Message");
		}
		catch(MyExceptionhandling exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }


}
