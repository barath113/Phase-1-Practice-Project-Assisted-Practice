package exceptions;

public class throwKeyword {
	
    public static void main(String[] args)
    {

        int a=46,b=0,res;

        try
        {
            if(b==0)        
                throw(new ArithmeticException("Can't divide by zero."));
            else
            {
                res = a / b;
                System.out.println("The result is : " + res);
            }
        }
        catch(ArithmeticException Ex)
        {
            System.out.println("Error : " + Ex.getMessage());
        }
        System.out.println("End of program.");
    }


}
