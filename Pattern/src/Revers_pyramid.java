import java.util.Scanner;

public class Revers_pyramid {
	
	static void R_pyramid(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");	// without space it will print Revers Triangle			
			}
			for(int j=0;j+i<n;j++)
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
		R_pyramid(num);

	}

}
