package javaEclips;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class NewtonPractice {
	
//	static void move(int []arr,int n)
//	{
//		int [] temp=new int[n];
//		int j=0;
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i]==0)
//				temp[j++]=arr[i];		//storing positive integer in temp
//		}
//		if(j==n||j==0)
//			return ;
//		
//		for(int i=0;i<n;i++)
//		{
//			if(arr[i]==1)
//				temp[j++]=arr[i];		//storing Negative integer in temp
//		}
//		for(int i=0;i<n;i++)
//		{
//			arr[i]=temp[i];				// updating the arr element form temp element
//			
//		}
//		for(int e:arr)
//		{
//			System.out.print(e+" ");
//		}
//		
//	}
	
	
	
	static void BubbleSort(int[] arr, int n)
	{
	    int i=0,j=0;

	    for (i=0; i<n-1; i++) // O(N)
	    {
	        for (j=0; j<n-i-1; j++) // O(N) - Worst Case
	        {
	            if (arr[j] > arr[j+1])
	            {
	            	 int temp = arr[j];
	                  arr[j] = arr[j+1];
	                  arr[j+1] = temp;
	            }
	        }
	    }
	    for(int e:arr)
	    System.out.print(e+" ");
	}


	public static void main(String[] args) {
		int arr[]= {1,1,0,0,01,1,0};
		BubbleSort(arr,arr.length);
	}
}
