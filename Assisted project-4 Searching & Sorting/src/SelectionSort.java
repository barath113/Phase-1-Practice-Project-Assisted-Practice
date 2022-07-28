public class SelectionSort {

	public static void main(String[] args) 
	{
	    int[] arr = {10,6,13,1,7,4,18};
	    int length = arr.length;
	     System.out.println("Given array:" );
	    for(int i=0;i<arr.length;i++)
        {
        	System.out.print(arr[i]+" ");
        }
	    selectionSort(arr);
	    System.out.println("\nThe sorted elements are:");
	    for(int i:arr){

	        System.out.print(i+" ");
	         }
	     }
	    public static void selectionSort(int[] arr)
	    {
	        for(int i=0;i<arr.length-1;i++)
	        {
	            int index =i;
	            for(int j=i+1;j<arr.length;j++)
	            {
	                if(arr[j]<arr[index])
	                {
	                    index =j;
	                }
	            }
	            int smallNumber = arr[index];
	            arr[index]= arr[i];
	            arr[i]= smallNumber;
	        }
	    }
}