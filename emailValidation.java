import java.util.ArrayList;
import java.util.Scanner;

	public class emailValidation {
		public static void valid(ArrayList<String>list) {
			System.out.println("Enter the mail ID: ");
			Scanner input = new Scanner(System.in);
		      String sc=input.next();
		      int count=0;
			 //String[] list = null;
			for(String element:list) {
		    	  if(element.equals(sc)) {
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
				System.out.println("The mailId is not valid");
			}
		}
		public static void main(String[] args) {
			ArrayList <String> list=new ArrayList<String>();
			  list.add("job11@gmail.com");
		      list.add("job21@gmail.com");
		      list.add("job22@gmail.com");
		      list.add("job33@gmail.com");
		      list.add("job44@gmail.com");
		      
		      //MailIdValidate a =new MailIdValidate();
		      emailValidation.valid(list);
		    
		     
		}
}