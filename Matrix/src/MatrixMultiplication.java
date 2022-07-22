
public class MatrixMultiplication {
	
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
	
	static void Multiplication(int mat1[][],int mat2[][])
	{
		int r=mat1.length;
		int c=mat1[0].length;
		int mul[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				mul[i][j]=mat1[i][j]*mat2[j][i];
			}
		}
		PrintMatrix(mul,r,c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] mat1= {{1,2,3},{4,5,6},{7,8,9}};
		int [][] mat2= {{9,8,7},{6,5,4},{3,2,1}};
	    int row=mat1.length;
	    int col=mat1[0].length;
	    System.out.println("The first Matrix : ");
	    PrintMatrix(mat1,row,col);
	    System.out.println("The Second Matrix : ");
	    PrintMatrix(mat2,row,col);
	    System.out.println("The Multiplication of two Matrixes : ");
	    Multiplication(mat1, mat2);
	  

	}

}
