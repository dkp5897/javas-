import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class countPrimelessThan_N {
	
	static boolean prime(int n)
	{
		if(n<2)
			return false;
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	static int count(int n)
	{
		int count=0;
		for(int i=2;i<n;i++)
		{
			if(prime(i))
			{
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(r);
		System.out.print("Enter a Number: ");
		int n=Integer.parseInt(br.readLine());
		System.out.printf("Total Number of PrimeNumberts from 2 to %d = %d",n,count(n));
		//System.out.print(prime(4));

	}

}
