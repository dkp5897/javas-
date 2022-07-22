
public class sumOfRow {
	
	static void printMatrix(int arr[][],int n, int m)
	{
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<m;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		System.out.println("");
	}
}

	static void printRowSum(int [][]mat,int row, int col){
        long rowsum=0;
        System.out.println("RowSum: ");
        for(int i=0;i<row;i++)
        {
            rowsum=0;
            for(int j=0;j<col;j++)
            {
                rowsum+=mat[i][j];
            }
            System.out.print(rowsum+" ");
        }
    }
	
	static void printColSum(int [][]mat,int row, int col){
        long colsum=0;
        System.out.println("Column Sum: ");
        for(int i=0;i<col;i++)
        {
            colsum=0;
            for(int j=0;j<row;j++)
            {
                colsum+=mat[j][i];
            }
            System.out.print(colsum+" ");
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] mat= {{1,2,3},{4,5,6},{7,8,9},{1,4,7}};
	    int row=mat.length;
	    int col=mat[0].length;
	    printMatrix(mat,row,col);
	    printRowSum(mat,row,col);
	    System.out.println();
	    printColSum(mat,row,col);

	}

}
