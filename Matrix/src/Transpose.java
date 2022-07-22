
public class Transpose {
	
	// (1) Using Extra Matrix  (only for Square Matrix)
	
	static void Transpose(int mat[][],int m,int n)
	{
		int tran[][]=new int[n][m];
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				tran[i][j]=mat[j][i];
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(tran[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	//(2) Without Using Extra Matrix
	static void Transpose2(int mat[][],int m,int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(mat[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	// (3) by using swaping
	/*
	 * In this we have to swap only upper triangle matrix otherwise it will print same matrix
	 */ 
	static void transposed3(int mat[][],int m,int n)
	{
		for(int i=0;i<m;i++)
		{
			for(int j=i;j<n;j++)			// for upper triangular matrix
			{
				int temp=mat[i][j];
				mat[i][j]=mat[j][i];
				mat[j][i]=temp;
			}
		}
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] mat= {{1,2,3},{4,5,6},{7,8,9}};
	    int row=mat.length;
	    int col=mat[0].length;
	    //Transpose(mat,row,col);			
	    System.out.println();
	    //Transpose2(mat,row,col);
	    transposed3(mat,row,col);

	}

}
