
public class ElementLessThantwoElement {
	
	
		// Method-01 TC:O(N^2)
	static void arrays(int arr[],int n)
	 {
		int count;
		 for(int i=0;i<n;i++)
		 {
			 count=0;
			 for(int j=0;j<n;j++)
			 {
				 if(arr[j]>arr[i])
					 count++;
			 }
			 if(count>=2)
				 System.out.print(arr[i]+" ");
		 }
	 }
	
	// Method-01 TC:O(N)
	static void arrys(int arr[],int n)
	 {
		 int max1=0,max2=0;
		 for(int i=0;i<n;i++)
		 {
			 if(arr[i]>max1)
			 {
				 max2=max1;
				 max1=arr[i];
			 }
			 else if(arr[i]>max2)
				 max2=arr[i];
		 }
		 for(int i=0;i<n;i++)
		 {
			 if(arr[i]<max2 && arr[i]<max1)
				 System.out.print(arr[i]+" ");
		 }	
	 }
		 
	public static void main(String[] args) {
		int arr[]= {7, -2, 3, 4, 1, -1};
		int n=arr.length;
	   arrys(arr,n);
	   System.out.println();
	   arrays(arr,n);
		
}
}