import java.util.Arrays;

/*Leetcode Ques: Single Number

Given a non-empty array of integers nums, every element appears twice except for one. 
Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.*/




public class SingleNumber {
	
	// method-01(Using XOR)
	static int xor(int arr[])
	{
		int check=0;
		// Duplicate Values (Even Frequency): XOR = 0
        // Single Value: XOR: Single Value
		for(int i=0;i<arr.length;i++)
			check=check^arr[i];
		return check;
	}
	
	//(2) Sorting:
	
	static int Snumber(int arr[])
	{
		Arrays.sort(arr);
		int n=arr.length;
		for(int i=1;i<n;i+=2)
		{
			if(arr[i]!=arr[i-1])
				return arr[i-1];
		}
		return arr[n-1];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1,2,1,4,4};
		System.out.println(xor(arr));
		System.out.println(Snumber(arr));
		
		
		
//		int a=1^2;
//		int b=a^1;
//		int c=b^2;
//		int d=c^4;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
		
		
		
		

	}

}
