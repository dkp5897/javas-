
public class pr_04_matrix_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][] mat1= {{1,2,3},
							{4,5,6}};			// 2D matrix 2*3
		
		int [][] mat2= {{1,2,3},
							{4,5,6}};
		
		int [][] result= {{0,0,0},
							{0,0,0}};
		
		System.out.println("First matrix");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				System.out.print(mat1[i][j]+" ");
			}
			System.out.println("");
		}
		
		
		System.out.println("\nsecond matrix");
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				System.out.print(mat2[i][j]+" ");
			}
			System.out.println("");
		}
		System.out.println("\nSum of matrixes");
		
		
		for(int i=0;i<mat1.length;i++)
		{
			for(int j=0;j<mat1[i].length;j++)
			{
				result[i][j]=mat1[i][j]+mat2[i][j];
				System.out.print(result[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
