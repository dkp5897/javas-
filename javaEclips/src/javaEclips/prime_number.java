package javaEclips;

import java.util.Scanner;

public class prime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,prime=1;
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		number=sc.nextInt();
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				prime=0;
				break;
			}
			
		}
		if(prime==1)
		{
			System.out.println("this number is prime number");
		}
		else
		{
			System.out.println("this is not a prime number");
		}

	}

}
