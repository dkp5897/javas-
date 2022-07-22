import java.util.*;
import java.util.Map.Entry;
public class FrequencyOfHashMap {
	
	@SuppressWarnings("rawtypes")
	static void PrintFreq(int arr[])
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		// Traverse Through Array
		
		for(int i=0;i<arr.length;i++)
		{
			Integer c=map.get(arr[i]);
			 // If this is first occurrence of element 
			if(map.get(arr[i])==null)
				map.put(arr[i], 1);
			// If elements already exists in hash map
			else
				map.put(arr[i],++c);
		}
		 // Print result
		
		for(Entry<Integer, Integer> m:map.entrySet())
		{
			 System.out.println("Frequency of " + m.getKey() + " is " + m.getValue());
		}
		
		System.out.println();
		
		for(Map.Entry p:map.entrySet())
		{
			 System.out.println("Frequency of " + p.getKey() + " is " + p.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {10, 34, 5, 10, 3, 5, 10};
        PrintFreq(arr);
	}
}
