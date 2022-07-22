import java.util.Arrays;

public class massing_number {
	//method-1
	static int missing(int[]a,int n)
	{
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
			if(a[i]!=i+1)
				return i+1;
		}
		return n;
	}
	//method-2
	static int missing1(int []a,int n)
	{
		int sum=n*(n+1)/2;
		int newsum=0;
		for(int e:a)
		{
			newsum+=e;
		}
		return sum-newsum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []arr= {2,3,4,1,8,5,9,6};// this is array of n-1 size in which one term is missing
		int r=missing(arr,arr.length+1);
		
		int s=missing1(arr,arr.length+1);
		System.out.print("The missing term is:");
		System.out.println(r);
		System.out.print("The missing term is:");
		System.out.print(s);

	}

}
