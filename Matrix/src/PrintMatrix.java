
public class PrintMatrix {
	
	static void matrix(int arr[][],int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] mat= {{1,2,3},{4,5,6},{7,8,9},{1,4,7}};
		int row=mat.length;	// Number of row
		int col=mat[0].length;
		matrix(mat,row,col);

	}

}
