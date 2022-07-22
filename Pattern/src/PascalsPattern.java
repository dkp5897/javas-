import java.util.Scanner;

public class PascalsPattern {
	
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
		
	}

	public static void main(String[] args) {
		
		 int n , i, j;
		 Scanner sc= new Scanner(System.in);
		 System.out.print("Enter the number of rows of Pascal's pattern: ");
		 n=sc.nextInt();
	     for (i = 0; i <= n; i++) 
	     {
	          for (j = 0; j <= n - i; j++)
	          {
	        	  // for left spacing
	        	  System.out.print(" ");
	          }
	          for (j = 0; j <= i; j++) 
	          {
	        	  // nCr formula
	        	  System.out.print("  "+ factorial(i)/ (factorial(i - j)* factorial(j)));
	           }
	 
	            // for newline
	            System.out.println();
	       }
	}
}
