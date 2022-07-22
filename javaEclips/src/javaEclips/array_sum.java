package javaEclips;

import java.util.Scanner;

public class array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of element: ");
		int n,sum=0;
		n=sc.nextInt();
		int [] arr=new int[n];
		System.out.print("Enter the array element: ");
		for(int i=0; i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.print("the element are: ");
		for(int element:arr)
		{
			System.out.print(element+" ");
		}
		System.out.print("\nThe sum of element is="+sum);
		
		System.out.print("\nElement in Revers order: ");
		for(int j=n-1;j>=0;j--)
		{
			System.out.print(+arr[j]+" ");
		}

	}

}
