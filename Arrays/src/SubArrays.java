/*A sub array or substring will always be contiguous, but a subsequence need not be contiguous. 
That is, subsequences are not required to occupy consecutive positions within the original sequences.
But we can say that both contiguous subsequence and sub array are the same.
*/


public class SubArrays {
	
	static void subArray(int [] arr,int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)				// this will give total number of sub arrays
			{
				for(int k=i;k<=j;k++)			// this loop print total number of element
				{
					System.out.print(arr[k]+" ");
					//count++;
				}
				count++;
				System.out.println();
			}
		}
		System.out.print("Total number of subarray="+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={1,2,3,4};
		subArray(arr,arr.length);
	
	}

}
