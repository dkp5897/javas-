import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PrintPrimeNumber {
	
	
	//Method-01 TC:O(n^2) SC: O(1) 
	static boolean isPrime(int n){
	      if(n<2){
	          return false;
	      }
	      for(int i=2;i<n;i++){
	          if(n%i==0)
	              return false;
	      }
	      return true;
	   }
	
	static void PrintPrime(int n)
	{
		for(int i=2;i<=n;i++)
		{
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}

	
	// method-02 seiveofEratosthenes
	
	
	static void seiveofEratosthenes(int n)
	{
		boolean [] prime=new boolean[n+1];
		for(int i=0;i<n;i++)
		{
			prime[i]=true;
		}
		for(int i=2;i*i<n;i++)
		{
			if(prime[i]==true)
			{
				for(int j=i*i;j<=n;j+=i)
					prime[j]=false;
			}
		}
		for(int i=2;i<=n;i++)
		{
			if(prime[i]==true)
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
	   
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(r);
		System.out.println("Enter a Number to print prime number from 2 to n: ");
		int n=Integer.parseInt(br.readLine());
		PrintPrime(n);
		System.out.println();
		seiveofEratosthenes(n);
		
	}
}
