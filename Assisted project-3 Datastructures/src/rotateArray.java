class RotateArray1 { 
public void rotate(int[] nums, int k) {
    		if(k > nums.length) 
       			k=k%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < k; i++){
        			result[i] = nums[nums.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<nums.length; i++){
        			result[i] = nums[j];
j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class rotateArray {
	public static void main(String[] args) {
		RotateArray1 r = new RotateArray1();
        		int arr[] = { 1, 3, 4, 6, 7, 9, 10 }; 
        		r.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}


}