import java.util.Arrays;

public class three_max_element__array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {25,79,52,45,65};
		int max1=0,max2=0,max3=0;
		int n=arr.length;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max1)
//				max1=arr[i];
//		}
//		System.out.print(max1+" ");
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max2&&arr[i]<max1)
//				max2=arr[i];
//		}
//		System.out.print(max2+" ");
//		
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max3&&arr[i]<max2)
//				max3=arr[i];
//		}
//		System.out.print(max3);
		
		
		//method-02(Optimized)
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max1)
//			{
//				max3=max2;
//				max2=max1;
//				max1=arr[i];
//			}
//			else if(arr[i]>max2)
//			{
//				max3=max2;
//				max2=arr[i];
//			}
//			else if(arr[i]>max3)
//			{
//				max3=arr[i];
//			}
//			
//		}
//
//		System.out.println(max1 + " " + max2 + " " + max3);
//		
		//method-03	(O(NlogN))
		
		Arrays.sort(arr);
		System.out.print(arr[n-1]+" "+arr[n-2]+" "+arr[n-3]+"\n"); 		// three maximum numbers
		System.out.print(arr[0]+" "+arr[1]+" "+arr[2]);				// three minimum numbers
		
		
	}

}
