import java.util.Scanner;

public class triangle_04_incresing {
	
	static void triangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("  ");
			}
			for(int j=0;j<=i;j++) 
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of pattern: ");
		int num=sc.nextInt();
		triangle(num);
	}

}
