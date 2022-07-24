package exceptions;

public class finallyKeyword {
	
	public static void main(String[] args)
    {
        int a=46,b=0,res=0;
        try
        {
            res = a / b;
        }
        catch(ArithmeticException e)
        {
            System.out.print("\n\tError : " + e.getMessage());
        }
        finally
        {
            System.out.print("\n\tThe result is : " + res);
        }
    }

}
