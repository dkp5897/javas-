import java.util.Scanner;

public class saddeled_pattern {
	
	static void sadeled(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;i+j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();	
		}
		
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* "  );
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of pattern: ");
		int num=sc.nextInt();
		sadeled(num);

	}

}
