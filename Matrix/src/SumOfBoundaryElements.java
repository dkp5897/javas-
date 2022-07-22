
public class SumOfBoundaryElements {
	static void PrintMatrix(int mat[][],int r, int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static int BoundarySum(int mat[][],int r,int c)
	{
		int sum=0;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==0)
					sum+=mat[i][j];
				else if(i==r-1)
					sum+=mat[i][j];
				else if(j==0)
					sum+=mat[i][j];
				else if(j==c-1)
					sum+=mat[i][j];
				
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 } };
		System.out .println("The Matrix is: ");
		PrintMatrix(a,a.length,a[0].length);
        long sum = BoundarySum(a, a.length, a[0].length);
        System.out.println("Sum of boundary elements = " + sum);

	}

}
