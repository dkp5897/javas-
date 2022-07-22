// prefix Sum is similar to Cumulative Sum

		// TC:O(N),SC:O(N)
public class PrefixSumArray {
	
	static void prefixSumArray(int [] arr,int n)
	{
		int[] prefixSum=new int [n];
		prefixSum[0]=arr[0];
		int i=0;
		for(i=1;i<n;i++)
		{
			prefixSum[i]=prefixSum[i-1]+arr[i];
		}
		for(int e:prefixSum)
		{
			System.out.print(e+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {10,5,20,4,15};
		prefixSumArray(arr,arr.length);

	}

}
