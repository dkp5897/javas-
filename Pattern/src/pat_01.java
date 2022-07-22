import java.io.InputStream;
import java.util.Scanner;

public class pat_01 {
	
	public static void pattern(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;i+j<n;j++)
			{
				System.out.print("* ");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of line to print:");
		int num=sc.nextInt();
		pattern(num);

	}


	
}
