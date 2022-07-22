import java.util.Scanner;

public class Incresing_pattern {
	
	public static void patterns(int n)
	{
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number to print pattern: ");
		int num=sc.nextInt();
		patterns(num);

	}

}
