A Matrix is a rectangular array .  The elements are arranged in the rows and columns. In this tutorial, 
we will look at some matrix programs in Java.

Since we are using two-dimensional arrays to create a matrix, we can easily perform various operations on its elements.


-------->Qs.(1):- Print a matrix.  

CODE:-


public class PrintMatrix {
	static void matrix(int arr[][],int m,int n)
	{
		for(int i=0;i<m;i++)		// to print row 
		{
			for(int j=0;j<n;j++)	// to print column
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

OUTPUT:-
1 2 3 
4 5 6 
7 8 9 
1 4 7 


-------->Qs.(2):-Transpose of a matrix. 

There are 4 method to print transpose of a matrix.... 
1.	By using extra Matrix (only for SquareMatrix)
2.	Without using extra matrix 
3.	By using swaping	(only for SquareMatrix)


		Matrix							Transpose Matrix

		1 2 3								1 4 7
		4 5 6								2 5 8
		7 8 9								3 6 9




Code:--->

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
	 * We can run under upper triangle when inner loop strat from j=i;
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

OUTPUT:- 

1 4 7 
2 5 8 
3 6 9 



------->Qs.(3):- Sum of Rows and Sum of columns

Matrix:- 1 2 3
		 4 5 6
		 7 8 9

		 sum of Rows---> 6 15 24
		 sum of columns--> 12 15 18



Code:-


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
            rowsum=0; // after every itteration rowsum should be zero otherwise it will give sum of all rows.
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

Output:-
1 2 3 
4 5 6 
7 8 9 
1 4 7 
RowSum: 
6 15 24 12 
Column Sum: 
13 19 25 




------>Qs.(4):- Given a matrix of N*N dimensions (Mat). Print the matrix rotated by 90 degree and 180 degree.

				Input:-
				First line contains N.
				N lines follow each containing N space seperated integers.

				2 <= N <= 100
				1 <= Mat[i][j] <= 10000

				Output:-

				Output 2*N+1 lines.
				First N lines should contain the Matrix rotated by 90 degrees.
				Then print a blank line.
				Then N lines should contain the Matrix rotated by 180 degrees.

Example;-

Sample Input
2
3 4
7 6

Sample Output
7 3
6 4

6 7
4 3

Sample Input:
2
1 2
3 4

Sample Output:
3 1
4 2

4 3
2 1



Code:-



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


Output:-

The Matrix is: 
1 2 3 
4 5 6 
7 8 9 
The Matrix after 90 degree rotation
7 4 1 
8 5 2 
9 6 3 
The Matrix after 180 degree rotation
9 8 7 
6 5 4 
3 2 1 


------->Qs.(5):- Addtion of Matrixes. 



Code:-

public class MatrixAddition {
	
	static void PrintMatrix(int mat[][],int r,int c)
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
	
	static void MatrixSum(int mat1[][],int mat2[][])
	{
		int r=mat1.length;
		int c=mat1[0].length;
		int sum[][]=new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		 PrintMatrix(sum,r,c);
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
	    System.out.println("The Sum Matrix : ");
	    MatrixSum(mat1,mat2);
	}
}


Output:-

The first Matrix : 
1 2 3 
4 5 6 
7 8 9 
The Second Matrix : 
9 8 7 
6 5 4 
3 2 1 
The Sum Matrix : 
10 10 10 
10 10 10 
10 10 10 



------->Qs.(6):- Substraction of Matrixes. 



Code:-

public class MatrixSubstraction {
	
	static void PrintMatrix(int mat[][],int r,int c)
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
	
	static void MatrixSub(int mat1[][],int mat2[][])
	{
		int r=mat1.length;
		int c=mat1[0].length;
		int sub[][]=new int [r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sub[i][j]=mat1[i][j]-mat2[i][j];
			}
		}
		 PrintMatrix(sub,r,c);
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
	    System.out.println("The Sum Matrix : ");
	    MatrixSub(mat1,mat2);
	}
}



------->Qs.(7):-Multiplication of Matrixes


Code:-

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


Output:-

The first Matrix : 
1 2 3 
4 5 6 
7 8 9 
The Second Matrix : 
9 8 7 
6 5 4 
3 2 1 
The Multiplication of two Matrixes : 
9 12 9 
32 25 12 
49 32 9 




-------->Qs.(8)

Problem Statement
You are given a matrix A of dimensions n x m. The task is to perform boundary traversal on the matrix in clockwise manner.

Input
The first line of input contains T denoting the number of testcases. T testcases follow. Each testcase two lines of input. The first line contains dimensions of the matrix A, n and m. The second line contains n*m elements separated by spaces.

Constraints:
1 <= T <= 100
1 <= n, m <= 30
0 <= A[i][j] <= 100
Output
For each testcase, in a new line, print the boundary traversal of the matrix A.

Example
Input:
4
4 4
1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
3 4
12 11 10 9 8 7 6 5 4 3 2 1
1 4
1 2 3 4
4 1
1 2 3 4

Output:
1 2 3 4 8 12 16 15 14 13 9 5
12 11 10 9 5 1 2 3 4 8
1 2 3 4
1 2 3 4

Explanation:
Testcase1: The matrix is:
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
The boundary traversal is 1 2 3 4 8 12 16 15 14 13 9 5
Testcase 2: Boundary Traversal will be 12 11 10 9 5 1 2 3 4 8.
Testcase 3: Boundary Traversal will be 1 2 3 4.
Testcase 4: Boundary Traversal will be 1 2 3 4.



Solution:-

Naive Approach: The simplest approach to solve this problem is to traverse the given matrix and check if 
				the current element is the boundary element or not. If found to be true, then print the element. 

Time Complexity: O(N2)
Auxiliary Space: O(1)

Efficient Approach: To optimize the above approach, the idea is to traverse only the first and last rows and 
					the first and last columns of the matrix. Follow the steps below to solve the problem:

Print the first row of the matrix.
Print the last column of the matrix except the first row.
Print the last row of the matrix except the last column.
Print the first column of the matrix except the first and last row.



Code:-


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


Output:-

1 2 3 6 9 8 9 4 





------->Qs.(9):- Printing Boundary Elements of a Matrix.

Given a matrix of size n x m. Print the boundary elements of the matrix. 
oundary elements are those elements which are not surrounded by elements on all four directions, 
i.e. elements in first row, first column, last row and last column.


Examples: 

Input :
        1 2 3 4  
        5 6 7 8
        1 2 3 4
        5 6 7 8
Output : 
         1 2 3 4 
         5     8 
         1     4 
         5 6 7 8
Explanation:The boundary elements of the
matrix is printed.

Input:
        1 2 3   
        5 6 7 
        1 2 3 
Output: 
        1 2 3   
        5   7 
        1 2 3 
Explanation:The boundary elements of the 
matrix is printed.


Approach: The idea is simple. Traverse the matrix and check for every element if that element lies on the boundary or not, 
		  if yes then print the element else print space character. 

Algorithm : 

Traverse the array from start to end.
Assign the outer loop to point the row and the inner row to traverse the elements of row.
If the element lies in the boundary of matrix, then print the element, i.e. if the element lies in 1st row, 1st column, last row, last column
If the element is not boundary element print a blank space.



Code:-


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


Output:-

The Matrix is: 
1 2 3 4 
5 6 7 8 
1 2 3 4 
5 6 7 8 
The Boundary Elements of Matrix are: 
1 2 3 4 
5     8 
1     4 
5 6 7 8 



-------->Qs.(10):-Finding sum of boundary elements

Given an matrix of size n x m. Find the sum of boundary elements of the matrix. 
Boundary elements are those elements which is not surrounded by elements on all four directions, 
i.e. elements in first row, first column, last row and last column. 

Examples:  

Input :
        1 2 3 4  
        5 6 7 8
        1 2 3 4
        5 6 7 8
Output : 54
Explanation:The boundary elements of the matrix 
         1 2 3 4 
         5     8 
         1     4 
         5 6 7 8
Sum = 1+2+3+4+5+8+1+4+5+6+7+8 =54

Input :
        1 2 3   
        5 6 7 
        1 2 3 
Output : 24
Explanation:The boundary elements of the matrix
        1 2 3   
        5   7 
        1 2 3  
Sum = 1+2+3+5+7+1+2+3 = 24


Code:-


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
		
		int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
		System.out .println("The Matrix is: ");
		PrintMatrix(a,a.length,a[0].length);
        long sum = BoundarySum(a, 4, 4);
        System.out.println("Sum of boundary elements = " + sum);
	}
}


Output:-

The Matrix is: 
1 2 3 4 
5 6 7 8 
1 2 3 4 
5 6 7 8 
Sum of boundary elements = 54




-------->Qs.(11):- Check identity Matrix

A matrix is said to be an identity matrix if it is a square matrix in which elements of principle diagonal are ones, 
and the rest of the elements are zeroes.

Eg.		1 0 0
		0 1 0
		0 0 1




Code:-


public class CheckIdentityMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows, cols;    
        boolean flag = true;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {1, 0, 0},    
                        {0, 1, 0},    
                        {0, 0, 1}    
                    };
        rows=a.length;
        cols=a[0].length;
        if(rows!=cols)
        	System.out.print("The Matrix should be Square Matrix");
        else
        {
        	for(int i=0;i<rows;i++)
        	{
        		for(int j=0;j<cols;j++)
        		{
        			if(i==j && a[i][j]!=1)//   a00=a11=a22!=1 then false
        				flag=false;
        			if(i!=j && a[i][j]!=0)// a01=a02=a10=a12=a20=a21 !=0 then false
        				flag=false;
        		}
        	}
        }
        if(flag)    
            System.out.println("Given matrix is an identity matrix");    
        else    
            System.out.println("Given matrix is not an identity matrix");    
	}
}


Output:-Given matrix is an identity matrix





























