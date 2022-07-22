import java.util.Scanner;

public class geeks_06_frequency_in_array {
	
	static int findFrequency(int A[], int x){
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]==x)
            count++;
        }
        return count;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter the  array element: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Which integer frequency do you want to check:  ");
		int k=sc.nextInt();
		int result=findFrequency(arr,k);
		System.out.printf("the element %d is present %d times in the array",k,result);
	}
}
