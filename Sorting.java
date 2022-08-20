										--------:Sorting in Java:----------


There are following Sorting Algorithm:

(1)	Bubble Sort 
(2)	Selection Sort 
(3)	Insertion Sort
(4)	Merge Sort 
(5)	Quick Sort



(1) Bubble Sort:-

In this sorting Algorithm we shift the largest element in the last of the array in every itteration.

Idea: if arr[i] > arr[i+1] swap them. To place the element in their respective position, we have to do the following 
operation N-1 times.

Algorithm:

(1)	START
(2)	Run two loops – an inner loop and an outer loop.
(3)	Repeat steps till the outer loop are exhausted.
(4)	If the current element in the inner loop is smaller than its next element, swap the values of the two elements.
(5)	END

Time Complexity: O(N^2)

Code:-


public class BubbleSort {
	
	// Method to print array
	static void printArray(int arr[])
	{
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		System.out.println();
	}
	
	// Bubble Sorting Method
	static void BubbleSort(int[] arr)
	{
	    // Bubble Sort

	    for (int i=0; i<arr.length-1; i++) // O(N)   this loop will run for n-1 times
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
		BubbleSort(arr);
		printArray(arr);
	}
}

Output:-
0 0 0 1 1 1 2 5 10 


(2) Selection Sort:-

In this sorting Algorithm we selects the smallest element and put it at the first position of the array. 

Idea: The inner loop selects the minimum element in the unsorted array and places the elements in increasing order.

Time complexity: O(N^2) 


Algorithm:

(1)	START
(2)	Run two loops: an inner loop and an outer loop.
(3)	Repeat steps till the minimum element are found.
(4)	Mark the element marked by the outer loop variable as a minimum.
(5)	If the current element in the inner loop is smaller than the marked minimum element, change the value of the minimum 
	element to the current element.
(6)	Swap the value of the minimum element with the element marked by the outer loop variable.
(7)	END


Code:-


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
			int smallest = i; // storing smallest element's index
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

Output:-

1 2 5 6 7 10 



(3)	Insertion Sort:-

In this we break; the array into two parts: first is sorted and second is unsorted. after this we shift a single element 
one by one from unsorted part to sorted part at it's right position. 

				S 	Un 													S 	 Un 		S 		Un 				
7 8 3 1 2 ----> 7 | 8 3 1 2 ----->  7 8| 3 1 2 ----> 3 7 8|1 2 ---> 1 3 7 8| 2 ----> 1 2 3 7 8|


Code:-


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

Output:-

1 2 3 7 8 





(4)	Merge Sort :-

Merge Sort is works on two technique Divide & Conquer. 

Divide:- Divide the unsorted array till it become undivisible. 

Example: 				6 3 9 | 5 2 8
			
				6 3| 9				5 2| 8

			6 | 3     9          5 | 2       8
		
		6     3     9         5     2     8		Single element array


Conquer:- merge the single elements into sorted array.

				3 6   9			2 5		8

				 3 6 9			  2 5 8

				 		2 3 5 6 8 9


Code:-

time complexity= O(nlogn)

public class mergerSort {
	
	static void printarray(int arr[])
	{
		for(int e:arr)
			System.out.print(e+" ");
	}
	
	static void divide(int arr[],int si,int ei)
	{
		if(si>=ei) {		// when every element become single
			return ;
		}
		int mid=si+(ei-si)/2;	// (si+ei)/2
		divide(arr,si,mid);		// for left side dividing part
		divide(arr,mid+1,ei);	// for rigth side dividing part
		
		conquer(arr,si,mid,ei);	// for conquer
	}
	
	static void conquer(int arr[], int si, int mid, int ei)
	{
		int merged[]=new int [ei-si+1];		//creating total size of array to store merge element
		
		int idx1=si;		// starting index of part one
		int idx2=mid+1;		// starting index of part two
		int x=0;
		
		// comparing the element and storing into merged array
		while(idx1<=mid && idx2<=ei)
		{
			if(arr[idx1]<=arr[idx2])	//if part-1 first element < part-2 first element
			{
				merged[x++]=arr[idx1++];	// storing part-1 element into merged
			}
			else
			{
				merged[x++]=arr[idx2++];	// storing part-2 element into merged
			}
		}
		
		// only one of these loop will run at a time
		while (idx1<=mid)				// if after comparing extra element remain into the part-1
		{
			merged[x++]=arr[idx1++];
		}
		while(idx2<=ei)					// if after comparing extra element remain into the part-2
		{
			merged[x++]=arr[idx2++];
		}
		
		// copy into original array
		for(int i=0,j=si;i<merged.length;i++,j++)
		{
			arr[j]=merged[i];
		}
	}
	
	public static void main(String[] args) {
		
		int arr[]= {5,6,1,7,3,6,8};
		int n=arr.length;
		divide(arr,0,n-1);
		printarray(arr);
	}
}

Output:-
1 3 5 6 6 7 8 				 		






(5) Quick Sort:-

this Algorithm works on pivot and partition technique.
In this we choose an element as pivot and put all the smaller than pivot elements before pivot and bigger after the pivot.

there are four methods to choose pivote:

(1) Any random element
(2) Median element
(3) first element
(4) last element (preffer)

---> In every single itteration we shift all the lower elements before the pivot and greater elements after the pivot 
	 and put the pivot at it's right position. 

	 Ex: 		4,5,2,6,8,3,9,_7

	 			so we choose pivot=7 here

	 			after one itteration array : 4,5,2,6,3,_7,8,9; 

	 			after this itteration we have two part of array:

	 				1. Before the pivot (Unsorted array)
	 				2. After the pivot (sorted array)

	 			Now we recall our quickSort Function for unsorted array again and again till the array sort. 	




Code:-

static void quickSort(int arr[],int low,int high)
{
	if(low<high)
	{
		int pi= partition(arr,low,high);	// this will give index of pivot

		quickSort(arr,low,pi-1);		// arranging lower elements before pivot
		quickSort(arr,pi+1,high);		// arranging higher elements after pivot
	}
	
}	

static int partition(int arr[], int low, int high)
{
	int pivot= arr[high];	// pivot = last element
	int i=low-1;			// assume there is no elements lower than pivot

	for(int j=low;j<high;j++)
	{
		if(arr[j]<pivot)
		{
			i++;		// making space for lower value

			// swap

			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
	}

	i++;
	int temp=arr[i];
	arr[i]=arr[high];
	arr[high]=temp;

	return i;
} 			

public static void main(String args[])
{
	int arr[]={5,8,2,4,6,9,1};

	quickSort(arr,0,arr.length-1);

	for(int e:arr)
		System.out.print(e+" ");
}