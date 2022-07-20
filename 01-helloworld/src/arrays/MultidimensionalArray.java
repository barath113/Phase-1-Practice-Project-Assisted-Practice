package arrays;

public class MultidimensionalArray {

	public static void main(String args[]) {
		int[][] arr = { {2,4},{5,9}};
		
		for(int a = 0; a<2; a++) {
			for(int b = 0; b<2; b++) {
				System.out.print(arr[a][b] + " " );
				
			}
			System.out.println();
		}
		}

}
