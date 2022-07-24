package exceptions;

@SuppressWarnings("serial")
class CustException extends Exception 
{ 
    public CustException(String s) 
    { 
        super(s); 
    } 
} 

public class customExpection {
	public static void main(String args[]) 
    { 
        try
        { 
            throw new CustException("temp"); 
        } 
        catch (CustException ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 


}