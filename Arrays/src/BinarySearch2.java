
public class BinarySearch2 {
	
	static int BinarySearch(int arr[],int n, int key)
	{
		int big, end, mid;
		big=0;
		end=n-1;
		mid=0;
		while(big<=end)
		{
			mid=(big+end)/2;
			if(arr[mid]==key)
				return mid;
			else if(key>arr[mid])
			{
				big=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,20,30,40,50};  
        int key = 35;
        int index=BinarySearch(arr,arr.length,key);
        System.out.print(index);

	}

}
