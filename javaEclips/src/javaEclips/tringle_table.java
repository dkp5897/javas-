package javaEclips;

import java.util.Scanner;

public class tringle_table {
	public static void main(String[] args) {
		int num;
		System.out.print("Enter a number: ");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(int i=1;i<=num;i++)
		{
			for(int j=1;j<=i;j++)
			{
//				System.out.print(" * ");
//				System.out.print(j+" ");
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
	}

}
