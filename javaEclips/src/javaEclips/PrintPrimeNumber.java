package javaEclips;

import java.util.ArrayList;

public class PrintPrimeNumber {
	
//	static void func(int n)
//	{
//		//String  primeNumbers = "";
//		int count=0;
//		for(int i=1;i<=n;i++)
//		{
//			for(int j=i;j>=1;j--)
//			{
//				if(i%j==0)
//					count+=1;
//			}
//			if(count==2)
//			{
//				//primeNumbers = primeNumbers + i + " ";
//				System.out.print(i);
//			}
//		}
//	}

	
	// this function return true or false regarding to prime number
public static boolean Isprime(int n) 
{
	if(n==1|| n==0)
		return false;
	for(int i=2;i<n;i++)
	{
		if(n%i==0)
			return false;
	}
	return true;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=100;
		System.out.println(Isprime(5));// this will give true because 5 is prime number
		
		ArrayList<Integer> A=new ArrayList<Integer>();  // to store the prime number in ArrayList
		System.out.printf("The Prime number from 1 to %d is: \n",n);
		for(int i=1;i<=n;i++)
		{
			if(Isprime(i))
			{
				System.out.print(i+" ");
				A.add(i);	
			}
		}
		System.out.print("\nThe prime number store in arrayList\n");
		System.out.print(A);
		
		
		
		// prime number store in an array
		int l=A.size();
		int j=0;
		int [] arr=new int[l];
		System.out.printf("\nThe Prime number store in the array from 1 to %d is: \n",n);
		for(int i=0;i<l;i++)
			arr[j++]=A.get(i);	
		for(int i=0;i<l;i++)
			System.out.print(arr[i]+" ");
		
		
		
		// printing of Super Prime
		System.out.println();
		System.out.printf("\nThe Super Prime number from 1 to %d is: \n",n);
		for(int i=0;i<j;i++)
		{
			if(Isprime(i+1))
				System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		for(int i=0;i<l;i++)
		{
			if(Isprime(i+1))
				System.out.print(A.get(i)+" ");
		}
	}
}
