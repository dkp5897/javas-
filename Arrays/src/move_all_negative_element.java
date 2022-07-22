/*Question:----Given an unsorted array arr[] of size N having both negative and positive integers. 
The task is place all negative element at the end of array without changing the order 
of positive element and negative element.
*/
 
/*The problem becomes easier if we are allowed to use extra space. 
Idea is create an empty array (temp[]). First we store all positive element of given array and 
then we store all negative element of array in Temp[]. Finally we copy temp[] to original array.*/



public class move_all_negative_element {
	
	static void move(int []arr,int n)
	{
		int [] temp=new int[n];
		int j=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>=0)
				temp[j++]=arr[i];		//storing positive integer in temp
		}
		if(j==n||j==0)
			return ;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<0)
				temp[j++]=arr[i];		//storing Negative integer in temp
		}
		for(int i=0;i<n;i++)
		{
			arr[i]=temp[i];				// updating the arr element form temp element
			
		}
		for(int e:arr)
		{
			System.out.print(e+" ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {12,-1,2,5,-3,45,-7,25,36};
		System.out.println("The array with all the negetive integer value in right side :\n ");
		move(a,a.length);

	}

}
