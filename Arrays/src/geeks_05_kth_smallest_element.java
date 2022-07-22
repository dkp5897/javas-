import java.util.Arrays;
import java.util.Scanner;

/*Given an array arr[] and an integer K where K is smaller than size of array, 
the task is to find the Kth smallest element in the given array. 
It is given that all array elements are distinct.*/


public class geeks_05_kth_smallest_element {
	
	static int kthSmallest(int []a,int n,int k)
	{
		if(n==0)
			return 0;
			
		Arrays.sort(a);
//		
		return (a[k-1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the  array element: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("which smallest value do you want to see in array:  ");
		int k=sc.nextInt();
		
		int s=kthSmallest(arr,n,k);
		System.out.printf("the %dth smallest element is %d",k,s);
		

	}

}
