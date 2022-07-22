import java.util.Scanner;

public class two_opposite_pyramid_02 {
	
	static void R_pyramid(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j+i<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void pyramid(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of pattern: ");
		int num=sc.nextInt();
		System.out.println();
		R_pyramid(num);
		pyramid(num);
		
		

	}

}
