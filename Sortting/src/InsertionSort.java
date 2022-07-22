
public class InsertionSort {

	static void printArray(int arr[])
	{
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {7,8,3,1,2};
		for(int i=1;i<arr.length;i++) // loop for unsorted part
		{
			int current=arr[i];			// storing first element of unsorted part
			int j=i-1;					// storing sorting part element index
			while(j>=0 && current<arr[j])	//if(j>=0 and unsorted element is less than sorted element)
			{
				arr[j+1]=arr[j];		// shifting the sorted element in right side
				j--;
			}
			
			// placement
			arr[j+1]=current;		// placing the element at thier right position
		}
		
		printArray(arr);
	}

}
