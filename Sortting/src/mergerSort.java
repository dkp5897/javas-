
public class mergerSort {
	
	// TC O(nlogn)
	
	static void printarray(int arr[])
	{
		for(int e:arr)
			System.out.print(e+" ");
	}
	
	static void divide(int arr[],int si,int ei)					// TC= O(logn)
	{
		if(si>=ei) {		// when every element become single
			return ;
		}
		int mid=si+(ei-si)/2;	// (si+ei)/2
		divide(arr,si,mid);		// for left side dividing part
		divide(arr,mid+1,ei);	// for rigth side dividing part
		
		conquer(arr,si,mid,ei);	// for conquer
	}
	
	static void conquer(int arr[], int si, int mid, int ei)		// TC=O(n)
	{
		int merged[]=new int [ei-si+1];		//creating total size of array to store merge element
		
		int idx1=si;		// starting index of part one
		int idx2=mid+1;		// starting index of part two
		int x=0;
		
		// comparing the element and storing into merged array
		while(idx1<=mid && idx2<=ei)
		{
			if(arr[idx1]<=arr[idx2])	//if part-1 first element < part-2 first element
			{
				merged[x++]=arr[idx1++];	// storing part-1 element into merged
			}
			else
			{
				merged[x++]=arr[idx2++];	// storing part-2 element into merged
			}
		}
		
		// only one of these loop will run at a time
		while (idx1<=mid)				// if after comparing extra element remain into the part-1
		{
			merged[x++]=arr[idx1++];
		}
		while(idx2<=ei)					// if after comparing extra element remain into the part-2
		{
			merged[x++]=arr[idx2++];
		}
		
		// copy into original array
		for(int i=0,j=si;i<merged.length;i++,j++)
		{
			arr[j]=merged[i];
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {5,6,1,7,3,6,8};
		int n=arr.length;
		divide(arr,0,n-1);
		printarray(arr);
	}
}
