import java.util.HashSet;

public class UniunOfArrays {
	
	//Time Complexity: O(m * log(m) + n * log(n))
	
	static int uniunSize(int a[],int b[],int n,int m)
	{
		HashSet<Integer>set=new HashSet<>();
		for(int e:a)
			set.add(e);
		for(int e:b)
			set.add(e);
		System.out.println("The uniun Elements is: "+set.toString());
		return set.size();
	}
	
	
	//We can improve performance of getUnion method by iterating over both the arrays for index 
	//from 0 to min(n, m)-1 adding all the elements in both the arrays to the set, and then 
	//iterate over the other array with the remaining elements and add them to the set.
	
	// Method-02	Time Complexity: O( max(m,n) )
	static int uniun(int a[],int b[],int n,int m)
	{
		HashSet<Integer> set =new HashSet<>();
		int min=(m<n)? m:n;
		for(int i=0;i<min;i++)		// min=min(m,n)=m=5
		{
			 // add elements from both the arrays for
	        // index from 0 to min(n, m)-1
			set.add(a[i]);
			set.add(b[i]);
		}
		if(n>m)
		{
			for(int i=m;i<n;i++)
			{
				set.add(a[i]);
			}
		}
		else if(n>m)
		{
			for(int i=n;i<m;i++)
			{
				set.add(b[i]);
			}
		}
		System.out.println("The uniun Elements is: "+set.toString());
		return set.size();
	}

	public static void main(String[] args) {

		int a[]= {5,4,8,2,6,2,5,8,1};
		int b[]= {5,4,6,10,7};
		
		int ans=uniunSize(a,b,a.length,b.length);
		System.out.println("Total number of elements in uniun is: "+ans);
		
		int ans2=uniunSize(a,b,a.length,b.length);
		System.out.println("Total number of elements in uniun is: "+ans2);
	}
}
