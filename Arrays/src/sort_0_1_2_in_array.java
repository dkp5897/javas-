//Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order.


public class sort_0_1_2_in_array {
	
	static void sort(int []a,int n)
	{
		int i=0;
		int zero=0,one=0,two=0;
		while(i<n)
		{
			if(a[i]==0)
				zero++;
			if(a[i]==1)
				one++;
			if(a[i]==2)
				two++;
			i++;
		}
		for(int j=0;j<zero;j++)
		{
			a[j]=0;
		}
		for(int j=zero;j<zero+one;j++)
		{
			a[j]=1;
		}
		for(int j=zero+one;j<zero+one+two-1;j++)
		{
			a[j]=2;
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {1,0,2,0,2,4,25,2 };
		sort(arr,arr.length);
	}
}
