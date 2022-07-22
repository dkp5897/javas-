package javaEclips;

import java.util.Scanner;

public class patarn_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner sc=new Scanner(System.in);
		N=sc.nextInt();

		System.out.println('*');

		for(int i=0;i<N-2;i++)
		{
			System.out.print('*');
			for(int j=0;j<=i;j++)
				 {
					System.out.print('^');
				 }
			System.out.println('*');
		}

			for(int i=0;i<=N;i++){

			System.out.print('*');

			}

			}

	

}
