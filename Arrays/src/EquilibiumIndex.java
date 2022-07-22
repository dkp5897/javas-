// Q-1: [Microsoft] Find Equilibrium Index in an Array

//Equilibrium Index in an Array is an index such that:
//
//sum of elements on its left == sum of elements on its right
//
//If there is no Equilibrium Index, return -1


public class EquilibiumIndex {
	
	
			// Method-01 O(N^2)
	static int equilibriumIndex(int [] arr)
	{
		int lsum=0,rsum=0;
		for(int i=0;i<arr.length;i++)
		{
			lsum=0;
			for(int j=0;j<i;j++)
			{
				lsum+=arr[j];
			}
			rsum=0;
			for(int j=i+1;j<arr.length;j++)
			{
				rsum+=arr[j];
			}
			if(lsum==rsum)
				return i;
		}
		return -1;
	}
	
	
	//method-02--->Optimized solution
	
	static int equilibriumIndex2(int [] arr)
	{
		int lsum=0,totalsum=0;
		for(int e:arr)
		{
			totalsum+=e;			// total sum of array
		}
		
		/*
        a = [-7 1 5 2 -4 3 0]
        totalsum = 0
        i = 0
        totalsum = totalsum - a[0] = 0 - (-7) = 7: RIGHTSUM
		*/
		
		for(int i=0;i<arr.length;i++)
		{
			totalsum=totalsum-arr[i];
			if(totalsum==lsum)
				return i;
			lsum+=arr[i];
		}
		return -1;
	}
	
	
			// Method-03 front end and back end sum 
//	Time Complexity: O(N)
//	Space Complexity: O(N)
	
	static int equilibriumIndex3(int [] arr)
	{
		int n=arr.length;
		int farr[]=new int[n];
		int barr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			if(i!=0)
				farr[i]=farr[i-1]+arr[i];
			else
				farr[i]=arr[i];
		}
		for(int i=n-1;i>=0;i--)
		{
			if(i<=(n-2))
				barr[i]=barr[i+1]+arr[i];
			else
				barr[i]=arr[i];
		}
		for(int i=0;i<n;i++)
		{
			if(farr[i]==barr[i])
				return i;
		}
		return -1;
	}
	
	
	//Method 4:– Using binary search
	
	static int equilibriumIndex4(int [] arr)
	{
		int n=arr.length;
		int mid=n/2;
		int lsum=0,rsum=0;
		for(int i=0;i<mid;i++)
			lsum+=arr[i];
		for(int i=n-1;i>mid;i--)
			rsum+=arr[i];
		if(rsum>lsum)
		{
			while(rsum>lsum && mid<n-1)
			{
				rsum-=arr[mid+1];
				lsum+=arr[mid];
				mid++;
			}
		}
		else
			while(lsum>rsum && mid>0)
			{
				lsum-=arr[mid-1];
				rsum+=arr[mid];
				mid--;
			}
		if(lsum==rsum)
			return mid;
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int [] arr= {3,2,-2,2,3};
		int [] arr= { -7, 1, 5, 2, -4, 3, 0};
		System.out.print("First Point of equilibrium is at index =");
		System.out.println(equilibriumIndex(arr));
		System.out.print("First Point of equilibrium is at index =");
		System.out.println(equilibriumIndex2(arr));
		System.out.print("First Point of equilibrium is at index =");
		System.out.println(equilibriumIndex3(arr));
		System.out.print("First Point of equilibrium is at index =");
		System.out.println(equilibriumIndex4(arr));
		

	}

}
