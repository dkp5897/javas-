import java.util.Arrays;
import java.util.HashSet;

public class DistingElements {
	
	// Bruet Force Solution(TC=O(n^2),SC=O(1))
	static int disElements(int arr[],int n)
	{
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
		}
		return n-count;
	}
	
	// Bruet Force Solution2(TC=O(n),SC=O(1))
	static int disElements2(int arr[],int n)
	{
		int count=0;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]==arr[i+1])
				count++;
		}
		return n-count;
	}
	
	// optimized Solution
	static int disElements3(int arr[],int n) 
	{
		HashSet<Integer>set=new HashSet<>();
		for(int e:arr)
		{
			set.add(e);
		}
		return set.size();
	}

	public static void main(String[] args) {
		int arr[]= {4,47,8,65,6,2,5,2,47};
		int ans=disElements(arr, arr.length);
		System.out.println(ans);
		
		int ans2=disElements2(arr, arr.length);
		System.out.println(ans2);
		
		int ans3=disElements3(arr, arr.length);
		System.out.println(ans3);
		

	}

}
