// for proper explanation go on sublime//


public class BoundaryElementInClockwise {
	
	static void BoundaryTraversal(int mat[][],int r,int c)
	{
		// print only first row
		for(int i=0;i<c;i++)
			System.out.print(mat[0][i]+" ");
		//print the last column except the first row
		for(int i=1;i<r;i++)
			System.out.print(mat[i][c-1]+" ");
		//print the last row except the last column
		for(int i=1;i<r;i++)
			System.out.print(mat[r-1][i]+" ");
		// Print the first column except
        // the first and last row
        if (c > 1) {
 
            // Print the first column
            for (int i = r - 2; i > 0; i--) {
                System.out.print(mat[i][0] + " ");
            }
        }
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]
	            = { { 1, 2, 3 },
	                { 4, 5, 6 },
	                { 7, 8, 9 } };
	        int N = arr.length;
	        int M = arr[0].length;
	 
	        // Function Call
	        BoundaryTraversal(arr, N, M);
	}
}
