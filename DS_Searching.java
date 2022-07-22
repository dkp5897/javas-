
----------> Data Structure Search Algorithm:-

	There are two popular Search Methods:---

	(1) Lenear Search Algorithm
	(2) Binary Search Algorithm

---------> Lenear Search Algorithm:-

		Searching is the process of finding some particular element in the list. 
		If the element is present in the list, then the process is called successful, 
		and the process returns the location of that element; otherwise, the search is called unsuccessful.	 

		Linear search is also called as sequential search algorithm. It is the simplest searching algorithm. 
		In Linear search, we simply traverse the list completely and match each element of the list with the item 
		whose location is to be found. If the match is found, then the location of the item is returned; otherwise, 
		the algorithm returns NULL.

		It is widely used to search an element from the unordered list, i.e., 
		the list in which items are not sorted. The worst-case time complexity of linear search is O(n). 


		The steps used in the implementation of Linear Search are listed as follows -

		(1) First, we have to traverse the array elements using a for loop.
		(2) In each iteration of for loop, compare the search element with the current array element, and -
			(a) If the element matches, then return the index of the corresponding array element.
			(b) If the element does not match, then move to the next element.
		(3) If there is no match or the search element is not present in the given array, return -1.


	Now, let's see the algorithm of linear search.

	Algorithm:-

	Linear_Search(a, n, val) // 'a' is the given array, 'n' is the size of given array, 'val' is the value to search  
	Step 1: set pos = -1  
	Step 2: set i = 1  
	Step 3: repeat step 4 while i <= n  
	Step 4: if a[i] == val  
	set pos = i  
	print pos  
	go to step 6  
	[end of if]  
	set ii = i + 1  
	[end of loop]  
	Step 5: if pos = -1  
	print "value is not present in the array "  
	[end of if]  
	Step 6: exit  




----->Time ans Space complexity:-

	Generally, there is always more than one way to solve a problem in computer science with different algorithms. 
	Therefore, it is highly required to use a method to compare the solutions in order to judge which one is more optimal. 
	The method must be:

	(1) Independent of the machine and its configuration, on which the algorithm is running on.
	(2) Shows a direct correlation with the number of inputs.
	(3) Can distinguish two algorithms clearly without ambiguity.

	There are two such methods used, "time complexity" and "space complexity" which are discussed below:

	Time Complexity:- 

		The time complexity of an algorithm quantifies the amount of time taken by an algorithm 
		to run as a function of the length of the input. Note that the time to run is a function of the length of 
		the input and not the actual execution time of the machine on which the algorithm is running on.

		In order to calculate time complexity on an algorithm, it is assumed that a constant time 'c' is taken 
		to execute one operation, and then the total operations for an input length on N are calculated. 
		Consider an example to understand the process of calculation: Suppose a problem is to find whether a pair (X, Y) 
		exists in an array, A of N elements whose sum is Z. The simplest idea is to consider every pair and check 
		if it satisfies the given condition or not.

		The pseudo-code is as follows:

		int a[n];
		for(int i = 0;i < n;i++)
		  cin >> a[i]
		  
		for(int i = 0;i < n;i++)
		  for(int j = 0;j < n;j++)
		    if(i!=j && a[i]+a[j] == z)
		       return true

		return false

		Code:-

		// Java program for the above approach
		import java.lang.*;
		import java.util.*;

		class GFG{
		static boolean findPair(int a[], int n, int z)
		{
			
			// Iterate through all the pairs
			for(int i = 0; i < n; i++)
				for(int j = 0; j < n; j++)
				
					// Check if the sum of the pair
					// (a[i], a[j]) is equal to z
					if (i != j && a[i] + a[j] == z)
						return true;

			return false;
		}

		// Driver code
		public static void main(String[] args)
		{
			
			// Given Input
			int a[] = { 1, -2, 1, 0, 5 };
			int z = 0;
			int n = a.length;
			
			// Function Call
			if (findPair(a, n, z))
				System.out.println("True");
			else
				System.out.println("False");
		}
		}

		Output:-
				False


		Assuming that each of the operations in the computer takes approximately constant time, let it be c. 
		The number of lines of code executed actually depends on the value of Z. During analyses of the algorithm, 
		mostly the worst-case scenario is considered, i.e., when there is no pair of elements with sum equals Z. 
		In the worst case, 		

		(1) N*c operations are required for input.
		(2) The outer loop i loop runs N times.
		(3) For each i, the inner loop j loop runs N times.


		So total execution time is N*c + N*N*c + c. Now ignore the lower order terms since the lower order 
		terms are relatively insignificant for large input, therefore only the highest order term is taken 
		(without constant) which is N*N in this case. Different notations are used to describe the limiting 
		behavior of a function, but since the worst case is taken so big-O notation will be used to represent 
		the time complexity.

		Hence, the time complexity is O(N^2) for the above algorithm. Note that the time complexity is solely 
		based on the number of elements in array A i.e the input length, so if the length of the array will increase 
		the time of execution will also increase.

		Order of growth is how the time of execution depends on the length of the input. 
		In the above example, it is clearly evident that the time of execution quadratically depends on the 
		length of the array. Order of growth will help to compute the running time with ease.


		Another Example: Let’s calculate the time complexity of the below algorithm:

		int count = 0 ;
		for (int i = N; i > 0; i /= 2)
		    for (int j = 0; j < i; j++)
		        count++;

		
		This is a tricky case. In the first look, it seems like the complexity is O(N * log N). 
		N for the j′s loop and log(N) for i′s loop. But it’s wrong. Let’s see why.

		Think about how many times count++ will run. 

		When i = N, it will run N times.
		When i = N / 2, it will run N / 2 times.
		When i = N / 4, it will run N / 4 times.
		And so on.
		The total number of times count++ will run is N + N/2 + N/4+…+1= 2 * N. So the time complexity will be O(N).

		Some general time complexities are listed below with the input range for which they are accepted in 
		competitive programming:     

		O(1) < O(N) < O(N*logN) < O(N*N) < O(N^3)



		Space Complexity:- The space complexity of an algorithm quantifies the amount of space taken by an algorithm 
		to run as a function of the length of the input. Consider an example: Suppose a problem to find the frequency 
		of array elements. 

		The pseudo-code is as follows: 

		int freq[n];
		int a[n];

		for(int i = 0; i<n; i++)
		{
		   cin>>a[i];
		   freq[a[i]]++;
		}  

		Code:-

		// Java program for the above approach
		import java.util.*;
		class GFG{

		// Function to count frequencies of array items
		static void countFreq(int arr[], int n)
		{
			HashMap<Integer,Integer> freq = new HashMap<>();

			// Traverse through array elements and
			// count frequencies
			for (int i = 0; i < n; i++) {
			if(freq.containsKey(arr[i])){
				freq.put(arr[i], freq.get(arr[i])+1);
			}
			else{
				freq.put(arr[i], 1);
			}
			}

			// Traverse through map and print frequencies
			for (Map.Entry<Integer,Integer> x : freq.entrySet())
			System.out.print(x.getKey()+ " " + x.getValue() +"\n");
		}

		// Driver Code
		public static void main(String[] args)
		{
			// Given array
			int arr[] = { 10, 20, 20, 10, 10, 20, 5, 20 };
			int n = arr.length;

			// Function Call
			countFreq(arr, n);
		}
		}

		Output:-
		5 1
		10 3
		20 4

	Explanation:-

	Here two arrays of length N, and variable i are used in the algorithm so, the total space used is 
	N * c + N * c + 1 * c = 2N * c + c, where c is a unit space taken. For many inputs, constant c is insignificant, 
	and it can be said that the space complexity is O(N).

	There is also auxiliary space, which is different from space complexity. The main difference is where 
	space complexity quantifies the total space used by the algorithm, auxiliary space quantifies the extra 
	space that is used in the algorithm apart from the given input. In the above example, the auxiliary space is 
	the space used by the freq[] array because that is not part of the given input. So total auxiliary 
	space is N * c + c which is O(N) only. 





------>Linear Search complexity:-

	(1) Time Complexity:-

	Now, let's see the time complexity of linear search in the best case, average case, and worst case. 
	We will also see the space complexity of linear search.

	Case								Time Complexity

	Best Case								O(1)
	Average Case							O(n)
	Worst Case								O(n)


	(1) Best Case Complexity - In Linear search, best case occurs when the element we are finding is at the 
		first position of the array. The best-case time complexity of linear search is O(1).

	(2) Average Case Complexity - The average case time complexity of linear search is O(n).

	(3) Worst Case Complexity - In Linear search, the worst case occurs when the element we are looking is 
		present at the end of the array. The worst-case in linear search could be when the target element 
		is not present in the given array, and we have to traverse the entire array. 
		The worst-case time complexity of linear search is O(n).

		The time complexity of linear search is O(n) because every element in the array is compared only once.

		(2) Space Complexity:-

			The space complexity of linear search is O(1).


	Write a program to implement linear search in Java.:-

	Code:-

	class LinearSearch {  
	static int linearSearch(int a[], int n, int val) {  
	  // Going through array sequencially  
	  for (int i = 0; i < n; i++)  
	    {  
	        if (a[i] == val)  
	        return i+1;  
	    }  
	  return -1;  
	}  
	public static void main(String args[]) {  
	  int a[] = {55, 29, 10, 40, 57, 41, 20, 24, 45}; // given array  
	  int val = 10; // value to be searched  
	  int n = a.length; // size of array  
	  int res = linearSearch(a, n, val); // Store result  
	  System.out.println();  
	  System.out.print("The elements of the array are - ");  
	  for (int i = 0; i < n; i++)  
	  System.out.print(" " + a[i]);  
	  System.out.println();  
	  System.out.println("Element to be searched is - " + val);  
	  if (res == -1)  
	  System.out.println("Element is not present in the array");  
	  else  
	  System.out.println("Element is present at " + res +" position of array");  
	}  
	}  

	Output:-
	
	The elements of the array are -  55 29 10 40 57 41 20 24 45
	Element to be searched is - 10
	Element is present at 3 position of array







-------->Binary Search Algorithm:-

	Binary search is the search technique that works efficiently on sorted lists. Hence, to search an element into 
	some list using the binary search technique, we must ensure that the list is sorted.

	Binary search follows the divide and conquer approach in which the list is divided into two halves, and the item 
	is compared with the middle element of the list. If the match is found then, the location of the middle element 
	is returned. Otherwise, we search into either of the halves depending upon the result produced through the match.


	NOTE:- Binary search can be implemented on sorted array elements. 
		   If the list elements are not arranged in a sorted manner, we have first to sort them.


	Algorithm
	Binary_Search(a, lower_bound, upper_bound, val) // 'a' is the given array, 'lower_bound' is the index of 
													//the first array element, 'upper_bound' is the index of the 
													//last array element, 'val' is the value to search  
	Step 1: set beg = lower_bound, end = upper_bound, pos = - 1  
	Step 2: repeat steps 3 and 4 while beg <=end  
	Step 3: set mid = (beg + end)/2  
	Step 4: if a[mid] = val  
	set pos = mid  
	print pos  
	go to step 6  
	else if a[mid] > val  
	set end = mid - 1  
	else  
	set beg = mid + 1  
	[end of if]  
	[end of loop]  
	Step 5: if pos = -1  
	print "value is not present in the array"  
	[end of if]  
	Step 6: exit  	   




	Binary Search complexity:-

	Now, let's see the time complexity of Binary search in the best case, average case, and worst case. 
	We will also see the space complexity of Binary search.

	1. Time Complexity:-


		Case												Time Complexity

	Best Case													O(1)
	Average Case												O(log)
	Worst Case													O(logn)


	Best Case Complexity - In Binary search, best case occurs when the element to search is found in first comparison, 
							i.e., when the first middle element itself is the element to be searched. 
							The best-case time complexity of Binary search is O(1).

	Average Case Complexity - The average case time complexity of Binary search is O(logn).

	Worst Case Complexity - In Binary search, the worst case occurs, when we have to keep reducing the search space 
							till it has only one element. The worst-case time complexity of Binary search is O(logn).




	Code:-

	public class BinarySearchAlgorithm {

		static int binarySearch(int a[], int beg, int end, int val)    
	    {    
	        int mid;    
	        if(end >= beg)     
	        {  
	            mid = (beg + end)/2;    
	            if(a[mid] == val)    
	            {    
	                return mid+1;  /* if the item to be searched is present at middle  
	*/  
	            }    
	            /* if the item to be searched is smaller than middle, then it can only  
	               be in left subarray */  
	            else if(a[mid] < val)     
	            {  
	                return binarySearch(a, mid+1, end, val);    
	            }    
	            /* if the item to be searched is greater than middle, then it can only be  
	               in right subarray */  
	            else    
	            {  
	                return binarySearch(a, beg, mid-1, val);    
	            }    
	        }    
	        return -1;    
	    }   
	    public static void main(String args[]) {  
	        int a[] = {8, 10, 22, 27, 37, 44, 49, 55, 69}; // given array  
	        int val = 37; // value to be searched  
	        int n = a.length; // size of array  
	        int res = binarySearch(a, 0, n-1, val); // Store result  
	        System.out.print("The elements of the array are: ");  
	        for (int i = 0; i < n; i++)  
	        {  
	            System.out.print(a[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Element to be searched is: " + val);  
	        if (res == -1)  
	        System.out.println("Element is not present in the array");  
	        else  
	        System.out.println("Element is present at " + res + " position of array");  
	   	 }  
	    }  



	Output:-
	
	The elements of the array are: 8 10 22 27 37 44 49 55 69 
	Element to be searched is: 37
	Element is present at 5 position of array
