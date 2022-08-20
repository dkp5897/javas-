
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
	
	static void Multiplication1(int mat1[][],int mat2[][]){
		int rlen1=mat1.length, clen1=mat1[0].length;
		int rlen2=mat2.length, clen2=mat2[0].length;

		if(clen1!=rlen2){
			System.out.println("Can't Multiply");
			return;
		}

		int prd[][]=new int[rlen1][clen2];
		for(int i=0;i<prd.length;i++){
			for(int j=0;j<prd[0].length;j++){
				for(int k=0;k<clen1;k++)
				prd[i][j]=mat1[i][k]*mat2[k][j];
			}
			
		}
		PrintMatrix(prd, rlen1, clen2);
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
		int [][] mat2= {{9,8},{6,5},{3,2}};
	    int row1=mat1.length;
	    int col1=mat1[0].length;
	    int row2=mat2.length;
	    int col2=mat2[0].length;
	    System.out.println("The first Matrix : ");
	    PrintMatrix(mat1,row1,col1);
	    System.out.println("The Second Matrix : ");
	    PrintMatrix(mat2,row2,col2);
	    System.out.println("The Multiplication of two Matrixes : ");
	    Multiplication1(mat1, mat2);
	  

	}

}
