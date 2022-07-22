package javaEclips;

import java.util.Scanner;

public class sum_of_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,digit,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your digit: ");
		n=sc.nextInt();
		int i=n;
		while(i>0)
		{
			digit=i%10;
			sum=sum+digit;
			i=i/10;
		}
		
		System.out.print("The sum of digit ="+sum);

	}

}
