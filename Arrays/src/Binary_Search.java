
public class Binary_Search {
	
	static int BinarySearch(int []a,int key)
	{
		int low=0;
		int high=a.length-1;
		int mid=0;
		while(low<=high)
		{
			mid=(low+high)/2;
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
		int key= 3;
		System.out.print(BinarySearch(arr,key));

	}

}
