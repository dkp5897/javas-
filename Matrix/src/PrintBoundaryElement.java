
public class PrintBoundaryElement {
	
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
	
	static void BoundaryElement(int mat[][],int r,int c)
	{
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(i==0)
					System.out.print(mat[i][j]+" ");
				else if(i==(r-1))
					System.out.print(mat[i][j]+" ");
				else if(j==0)
					System.out.print(mat[i][j]+" ");
				else if(j==c-1)
					System.out.print(mat[i][j]+" ");
				else
					System.out.print("  ");
			}
			System.out .println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		System.out .println("The Matrix is: ");
		PrintMatrix(a,a.length,a[0].length);
		System.out .println("The Boundary Elements of Matrix are: ");
        BoundaryElement(a, 4, 4);

	}
}
