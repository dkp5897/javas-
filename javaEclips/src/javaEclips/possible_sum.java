package javaEclips;

import java.util.Scanner;

public class possible_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0,sum;
		Scanner sc=new Scanner(System.in);
		sum=sc.nextInt();
		for(int i=1;i<=sum;i++)
		{
			for(int j=1;j<=sum;j++)
			{
				if(sum==i+j)
					num++;
			}
		}
		System.out.print(num);


	}

}
