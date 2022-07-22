
public class leader {
	
	static void leader(int a[],int n)
	{
		int j=0;
		for(int i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(a[i]<a[j])
					break;
			}
			if(j==n)
				System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]= {16, 17, 4, 3, 5, 2};
		 int n=arr.length;
		 leader(arr,n);
	}
}
