import java.util.Arrays;

//Rearrange an array in order – smallest, largest, 2nd smallest, 2nd largest, ..

//Input : arr[] = [5, 8, 1, 4, 2, 9, 3, 7, 6]
//Output :arr[] = {1, 9, 2, 8, 3, 7, 4, 6, 5}


public class Mountain {
	
	static void mountain(int arr[],int n)
	{
		int index=0;
		Arrays.sort(arr);
		int temp []=new int [n];
		for(int i=0,j=n-1;i<=n/2||j>n/2;i++,j--)
		{
			if(index<n)
			{
				temp[index]=arr[i];
				index++;
			}
		
			if(index<n)
			{
				temp[index]=arr[j];
				index++;
			}
		}
		for (int i = 0; i < n; i++)
            arr[i] = temp[i];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 8, 1, 4, 2, 9, 3, 7, 6 };
        int n = arr.length;
        mountain(arr, n);
      
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");

	}

}
