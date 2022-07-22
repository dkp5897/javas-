import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to check perfect Square: ");
		int n=sc.nextInt();
		perfectSqr(n);
	}
		
		static void perfectSqr(int n)
		{
			int sqr;
			for(int i=0; i<=n;i++)
			{
				sqr=i*i;
			if (sqr == n) {
                System.out.printf("YES: %d is perfect Square",n);
                return;
            }
            else if (sqr > n) {
                System.out.printf("NO: %d is not perfect Square",n);
                return;
            }
		}

		}
}	


