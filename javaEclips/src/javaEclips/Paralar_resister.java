package javaEclips;

import java.util.Scanner;

public class Paralar_resister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float val=0;
		float sum=0;
		for(int i=0;i<n;i++)
		{
			val=sc.nextInt();
			sum=sum+(1/val);
			
		}
		int r= (int) Math.floor((1/sum));
		System.out.print(r);
	}

}
