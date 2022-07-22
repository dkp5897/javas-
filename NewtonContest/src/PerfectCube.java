import java.util.Scanner;

public class PerfectCube {
	
	static void PerfectCube(int n)
	{
		int cube;
		for(int i=0;i<=n;i++)
		{
			cube=i*i*i;
			if(cube==n)
			{
				System.out.printf("YES: the given Number %d is Perfect Cube",n);
				return ;		// it will print result only one time
			}
			else if(cube>n)
			{
				System.out.printf("NO: The Number %d is not perfect Cube",n);
				return ;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to check perfect Cube: ");
		int n=sc.nextInt();
		PerfectCube(n);

	}

}
