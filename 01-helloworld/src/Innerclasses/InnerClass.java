package Innerclasses;

public class InnerClass {

	private String msg="Welcome to Eclipse IDE"; 
	 
	 class inner{  
	  void hi(){System.out.println(msg+", Let us start the E-learning of Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerClass ic=new InnerClass();
		InnerClass.inner in=ic.new inner();  
		in.hi();  
	}

}
