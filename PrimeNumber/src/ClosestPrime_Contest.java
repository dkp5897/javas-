import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ClosestPrime_Contest {
	
	static boolean isPrime(int n)
	{
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Number: ");
		int n=Integer.parseInt(br.readLine());
		int diff1=0,diff2=0;
		int p=0,q=0;
		for(int i=n; ;i++)
		{
			if(isPrime(i))
			{
				diff1=i-n;
				p=i;
				break;
			}
		}
		
		for(int i=n; ; i--)
		{
			if(isPrime(i))
			{
				diff2=n-i;
				q=i;
				break;
			}
		}
		System.out.println("The closest Prime Number to the given Number is: ");
		if(diff1<diff2)
			System.out.print(p);
		else if(diff2<diff1)
			System.out.print(q);
		else
			System.out.print(Math.min(p, q));
	}
}
