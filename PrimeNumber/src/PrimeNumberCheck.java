import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberCheck {
	
	
	// Method-(1) Check for All Numbers from 2 to N-1
	
	static void checkPrime(int n)
	{
		String s="This is a Prime Number";
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				s="This is not a Prime Number";
		}
		System.out.println(s);
	}
	
	
	// Method-02:-Check for All Numbers from 1 to N -- Count the Number of Factors
	static void checkPrime2(int n)
	{
		int count = 0;
		String s="This is a Prime Number";
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count!=2)
			s="This is not a prime Number";
		System.out.println(s);
	}
	
	// Method-03:-Check for All Numbers from 2 to N/2
	
	static void checkPrime3(int n)
	{
		String s="This is a Prime Number";
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
				s="This is not a Prime Number";
		}
		System.out.println(s);
	}
	
	//Method(4):- Check for All Numbers from 2 to Sqrt(N)
	
	/*
	 * Euclid Theorem: - Any Number if its does not have any factor till sqrt(N), It
	 * wont have Any Factor after.
	 */
	
	static void checkPrime4(int n)
	{
		String s="This is a Prime Number";
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
				s="This is not a Prime Number";
		}
		System.out.println(s);
	}
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		InputStreamReader r=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(r);
//		System.out.println("Enter a Number: ");
//		int n=Integer.parseInt(br.readLine());
//		checkPrime(n);
//		checkPrime2(n);
//		checkPrime3(n);
		checkPrime4(25);
		

	}

}
