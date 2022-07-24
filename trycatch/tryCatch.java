package trycatch;

public class tryCatch 
{
	public static void main(String args[]) 
    {
        int[] array = new int[4];
        try 
        {
            array[7] = 5;
        }
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index is out of bound!"); 
        }
        finally 
        {
            System.out.println("The array is of size " + array.length);
        }
    }


}
