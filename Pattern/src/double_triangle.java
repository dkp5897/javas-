import java.util.Scanner;

public class double_triangle {
	
	// for pyramid
	static void pyramid(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-i;j++)
			{
				System.out.print("  ");	// without space it will print Triangle			
			}
			for(int j=0;j<=i;j++)
			{
				System.out.print("* * ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of pattern: ");
		int num=sc.nextInt();
		pyramid(num);
	}
}
