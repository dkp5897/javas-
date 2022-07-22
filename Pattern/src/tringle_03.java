import java.util.Scanner;

public class tringle_03 {
	
	static void triangle(int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("  ");   //without space -->tringle with 90 degree in left
			}							//with one space -->revers pyramid	
			for(int j=0;i+j<n;j++)		//with two space-->tringle with 90 degree in right
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
		triangle(num);

	}

}
