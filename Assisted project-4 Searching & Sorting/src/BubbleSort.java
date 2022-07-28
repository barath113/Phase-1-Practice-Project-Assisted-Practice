public class BubbleSort {

	public static void main(String[] args){
	     int[] arr= {20,12,33,9,13};
	     System.out.println("Given array:" );
	     for(int i=0;i<arr.length;i++)
	        {
	        	System.out.print(arr[i]+" ");
	        }
	     bubbleSort(arr);
	     System.out.println("\nBubble Sorted Array:");
	     for(int i=0;i<arr.length;i++){
	        System.out.print(arr[i]+" ");
	        }
	    }
	    public static void bubbleSort(int[] arr){
	        int len = arr.length;
	        int temp = 0;
	        for(int i=0;i<len;i++){
	            for (int j=1;j<(len);j++){
	                if(arr[j-1]>arr[j]){
	                temp = arr[j-1];
	                arr[j-1]= arr[j];
	                arr[j]= temp;
	                }
	            }
	        }
	    }
}