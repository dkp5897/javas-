
public class SubarrayOfSumZero {
	
	static int maxSumSubarray(int arr[],int n){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(sum,max);

            if(sum<0)
            sum=0;
        }
        return max;
    }
	static void sumZero(int arr[],int n)
	{
		int max=maxSumSubarray(arr, arr.length);
		int sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				for(int k=i;k<=j;k++)
				{
					sum+=arr[k];
				}
				for(int k=i;k<=j;k++)
				{
					if(sum==0)
						System.out.print(arr[k]+" ");
				}
				System.out.println();
				
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,-2,1,1};
		sumZero(arr,arr.length);
		int ans=maxSumSubarray(arr, arr.length);
		System.out.println(ans);

	}

}
