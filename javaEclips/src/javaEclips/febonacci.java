package javaEclips;

import java.util.Scanner;

public class febonacci {
	
	static int feb(int n)
	{
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
			return feb(n-1)+feb(n-2);		// if n=3-->return 1+0=1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("how many terms of febonacci series do you want to print: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(feb(i));
		}
		
		

	}

}
