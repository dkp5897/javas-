
public class SunNearestToZero {
	
	static void NearestSum(int a[],int n)
	{
		int ml=0,mr=0,sum=0,minSum=a[0]+a[1];
		for( int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{	
				sum=(a[i]+a[j]);
				 if(Math.abs(minSum) > Math.abs(sum))
				 {
					 minSum=sum;
					 ml=i;  		// storing the indexes of element
					 mr=j;
				 }
				 
			}
		}
		System.out.println("The cobination of element: "+a[ml]+","+a[mr]);
		System.out.println("The sum nearest to zero= " +sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1, 60, -10, 70, -80, 83};
	    int n=arr.length;
	    NearestSum(arr,n);

	}

}
