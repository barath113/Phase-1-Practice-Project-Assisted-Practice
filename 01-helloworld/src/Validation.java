import java.util.ArrayList;
import java.util.Scanner;
public class Validation 
{
	public static void valid(ArrayList<String>list) 
	{
		System.out.println("Enter the mail ID: ");
		Scanner user_input = new Scanner(System.in);
	      String sc=user_input.next();
	      int count=0;
		for(String element:list) 
		{
	    	  if(element.equals(sc)) 
	    	  {
	    		  count=1;
	    		  break;
	    	  }
	      }
		if(count==1)
		{
			System.out.println("Mail ID is valid");
		}
		else
		{
			System.out.println("The mail Id is not valid");
		}
	}
	public static void main(String[] args) 
	{
		ArrayList <String> list=new ArrayList<String>();
		  for(int j=0;j<100;j++)
		  {
			  list.add("email"+j+"@gmail.com");
		  }
		  Validation.valid(list);	       
	}
}