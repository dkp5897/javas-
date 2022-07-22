
public class selectionSort {
	static void printArray(int arr[])
	{
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int arr[]= {1,5,2,6,7,10};
		
		//Selection Sort
		
		for(int i=0;i<arr.length-1;i++)
		{
			int smallest = i;    // storing smallest element's index
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[smallest])
				{
					smallest=j;
				}
			}
			
			// swap
			
			int temp=arr[smallest];
			arr[smallest]=arr[i];
			arr[i]=temp;
					
		}
		printArray(arr);
	}

}
