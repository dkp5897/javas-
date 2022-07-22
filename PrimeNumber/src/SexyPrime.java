import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SexyPrime {
	
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
	static int countSexyPrime(int n)
	{
		int count=0;
		for(int i=2;i<=n-6;i++)
		{
			if(prime(i) && prime(i+6))
			{
				count++;
				System.out.print(i+" ");
			}
		}
		System.out.println();
		return count;
	}
	
	
	// metho-02
	
	static int solution(int N)
	{
	boolean[] prime = new boolean[N+1]; //To keep in index range: 2 to 11
	int i=0;
	    
	    for (i=0; i<=N; i++)
	        prime[i] = true;

	for (int p=2; p*p<=N; p++) // p = 2, p = 3
	{
	    if (prime[p] == true) // p = 2, p = 3
	    {
	        for (i = p*p; i<=N; i+=p) //p = 2, i = 4, i = 6, i = 8, i = 10
	            // p = 3, i = 9
	            prime[i] = false;
	    }
	}

	int countofSexyPrimes=0;
	for (i=2; i<=N-6; i++)
	{
	    if (prime[i] && prime[i+6]) // Both are Prime and Diff is 6
	        ++countofSexyPrimes;
	}
	return countofSexyPrimes;
}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(r);
		System.out.print("Enter a Number: ");
		int n=Integer.parseInt(br.readLine());
		System.out.printf("Total Number of Sexy PrimeNumberts from 2 to %d = %d\n",n,countSexyPrime(n));
		System.out.printf("Total Number of Sexy PrimeNumberts from 2 to %d = %d\n",n,solution(n));
	}
}
