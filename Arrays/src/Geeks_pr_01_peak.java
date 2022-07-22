import java.util.Scanner;

public class Geeks_pr_01_peak {
	
	public static int peak(int [] arr,int n)
	{
		int r = 0,max=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				r=i;
			}
		}
		return r;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your length and array: ");
		int n=sc.nextInt();
		int [] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		int s=peak(a,n);
		System.out.print("The peak value come at the position/index of "+s);
	}

}
