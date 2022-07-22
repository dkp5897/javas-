
public class SubarrayOfSumZero {
	
	
	static void sumZero(int arr[],int n)
	{
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

	}

}
