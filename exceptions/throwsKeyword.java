package exceptions;

public class throwsKeyword {
    void Display() throws ArithmeticException
    {
        int a=46,b=0,res;
        res = a / b;
        System.out.print("\n\tThe result is : " + res);
    }
     public static void main(String[] args)
    {
        throwsKeyword T = new throwsKeyword();
         try
        {
            T.Display();
        }
        catch(ArithmeticException e)
        {
            System.out.print("Error : " + e.getMessage());
        }
        System.out.print("\n\tEnd of program.");
    }

}