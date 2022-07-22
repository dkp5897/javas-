import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GreaterClosesPrimeNumber {
	
	static boolean isPrime(int n)
	{
		for(int i=2;i*i<n;i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
	static void GreaterPrime(int n)
	{
		for(int i=n; ;i++)
			if(isPrime(i))
			{
				System.out.printf("The next prime number after %d is %d",n,i);
				break;
			}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number: ");
		int n=Integer.parseInt(br.readLine());
		GreaterPrime(n);
		
		

	}

}
