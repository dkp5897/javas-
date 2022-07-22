
public class QuickSort {
	
	static void printarray(int [] arr)
	{
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
	}
	
	static int partition(int arr[],int low,int high)
	{
		int pivot=arr[high];
		int i=low-1;			// i=-1 (initially we assume that there is no lower element than pivot
		
		for(int j=low;j<high;j++)
		{
			if(arr[j]<pivot)		// if element is less than pivot
			{
				i++;			// creating space for that element
				
				// swap
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		
		// swap with pivot
		// after shifting all lower value before the pivot
		i++;
		int temp=arr[i];
		arr[i]=arr[high];
		arr[high]=temp;
		
		return i; 		// index of pivote
	}
	
	static void quickSort(int [] arr,int low,int high)
	{
		if(low<high)
		{
			int pi=partition(arr,low,high);		// storing index of pivot into pi
			
			quickSort(arr,low,pi-1);		// arranging lower value by pivot before pivote
			quickSort(arr,pi+1,high);		// arranging lower value by pivot after pivote
			
		}
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,6,8,2,7,9};
		quickSort(arr,0,arr.length-1);
		printarray(arr);

	}
}
