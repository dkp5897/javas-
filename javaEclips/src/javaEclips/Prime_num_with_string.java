package javaEclips;

import java.util.Scanner;

public class Prime_num_with_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		String s="This is prime number";
		System.out.print("Enter the number: ");
		
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				s="This is not a prime numer";
				break;
			}
		}
		System.out.println(s);

	}

}
