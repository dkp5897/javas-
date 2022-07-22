// Rotate a mtrix by 90 degree
public class RotateMatrix {
	

	static void rotate(int[][] arr) {
		 
        int n=arr.length;
     
    // first rotation
    // with respect to main diagonal
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<i;++j)
            {
                int temp = arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
         // Second rotation
    // with respect to middle column
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n/2;++j)
            {
                int temp =arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1]=temp;
            }
        }
 
    }
   
  // to print matrix
   static void printMatrix(int arr[][])
    {
        int n=arr.length;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print( arr[i][j] + " ");
            System.out.println();
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("The Matrix is: ");
		printMatrix(arr);
		System.out.println("The Matrix after 90 degree rotation");
        rotate(arr);
        printMatrix(arr);
        System.out.println("The Matrix after 180 degree rotation");
        rotate(arr);
        printMatrix(arr);
	}

}
