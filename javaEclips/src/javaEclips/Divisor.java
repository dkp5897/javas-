package javaEclips;

import java.util.Scanner;

public class Divisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, count=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=1)
		{
			if(n%2==0)
			{
				n=n/2;
				count++;
			}
			else if(n%3==0)
			{
				n=n/3;
				count++;
			}
			else if(n%5==0)
			{
				n=n/5;
				count++;
			}
			else if(n%7==0)
			{
				n=n/7;
				count++;
			}
			else
			{
				count++;
			}
			
		}
		System.out.println(count);

	}

}
