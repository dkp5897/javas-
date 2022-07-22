import java.util.HashMap;
import java.util.Map.Entry;

public class UniunOfArrays {
	
	//The above method has time complexity O(m+n).
	
	static int uniun(int a[],int b[],int n,int m)
	{
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<n;i++)
			map.put(a[i], i);
		
		for(int i=0;i<m;i++)
		{
			map.put(b[i], i);
		}
		
		System.out.print("The uniun Elements are: ");
		
		for(Entry<Integer,Integer>e:map.entrySet())
			System.out.print(e.getValue()+" ");
		
		return map.size();
	}

	public static void main(String[] args) {
		
		int a[]= {5,4,8,2,6,2,5,8,1};
		int b[]= {5,4,6,10,7};
		
		int ans=uniun(a,b,a.length,b.length);
		System.out.println("\nTotal number of elements in uniun is: "+ans);

	}

}
