import java.util.*;
public class Binary_Search {

	// There is derect method of binary search

	
	static int BinarySearch(int []a,int key)
	{
		int low=0;
		int high=a.length-1;
		
		while(low<high)
		{
			int mid=(low+high)/2;
			if(key==a[mid])
				return mid;
			else if(key>a[mid])
				low= mid+1;
			else
				high= mid-1;
			
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,2,4,3,5};
		int key= 5;
		System.out.println(BinarySearch(arr,key));

		System.out.println(key+" is present st index: "+Arrays.binarySearch(arr,key));

	}

}
