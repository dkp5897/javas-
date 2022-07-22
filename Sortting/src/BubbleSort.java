
public class BubbleSort {
	
	static void printArray(int arr[])
	{
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	static void BubbleSort(int[] arr)
	{
	    // Bubble Sort

	    for (int i=0; i<arr.length-1; i++) // O(N)
	    {
	        for (int j=0; j<arr.length-i-1; j++) // O(N) - Worst Case
	        {
	            if (arr[j] > arr[j+1])
	            {
	            	//swap
	            	 int temp = arr[j];
	                  arr[j] = arr[j+1];
	                  arr[j+1] = temp;
	            }
	        }
	    }
	    
	}
	
	public static void main(String[] args) {
		
		int arr[]= {1,1,0,0,2,5,10,1,0};
		printArray(arr);
		BubbleSort(arr);
		System.out.println("Array after sorting: ");
		printArray(arr);
	}

}
