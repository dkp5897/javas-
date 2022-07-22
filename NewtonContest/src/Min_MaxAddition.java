import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Min_MaxAddition {
	
	// this will return maximum digit of the number
	static long mx(long n)
	{
		long mx=0;
		while(n!=0)
		{
			long r=n%10;
			mx=Math.max(r,mx);
			n=n/10;
		}
		return mx;
	}
	
	// this will return minimum digit of the number
	static long mn(long n)
	{
		long mn=9;
		while(n!=0)
		{
			long r=n%10;
			mn=Math.min(r,mn);
			n=n/10;
		}
		return mn;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		long A = Long.parseLong(br.readLine());
		long N = Long.parseLong(br.readLine());
		  long mx,mn;
		  while(N-->0)
		  {
			  mx=mx(A);
			  mn=mn(A);
			  A=A+(mx*mn);
		  }
		  System.out.print((A));

	}

}
