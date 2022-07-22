import java.util.HashMap;

public class L_1_SumofTwoNumbers {
	
		// Brute Force Solution Time Complexity: O(n^2) ,Space Complexity: O(1)
	
	public static int[] twoSum(int[] nums, int target) {
	       for (int i = 0; i < nums.length; i++){
	           for(int j=i+1;j<nums.length;j++)
	           {
	               if (nums[i] + nums[j] == target)
	               return new int[] {i, j};
	           }
	       }
	       return new int[] {};
	   }
	
	
	// Using Hashmap Time Complexity: O(n) , Space Complexity: O(n)
	
//	static int [] twoSum(int []arr,int target)
//	{
//		int sum=0 ;
//		HashMap<Integer,Integer> indexMap =new HashMap<Integer,Integer>();
//		for(int i=0;i<arr.length;i++)
//		{
//			sum=target-arr[i];
//			if(indexMap.containsKey(sum))
//			{
//				int toStore[]= {indexMap.get(sum),i};
//				return toStore;
//			}
//			indexMap.put(arr[i],i);
//		}
//		return null;
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,2,13,11,1,8,6};
		int target=14;
		int [] result=twoSum(arr,target);
		System.out.print("The element indexes which give their sum=target are:   ");
		for(int e:result)
			System.out.print(e+" ");
	}

}
