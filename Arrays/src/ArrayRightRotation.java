
public class ArrayRightRotation {
	
	
				//method-01
//	static void RotateByOne(int arr[],int n)
//	{
//		int i,temp;
//		temp=arr[n-1];
//		for( i=n-1;i>0;i--)
//		{
//			arr[i]=arr[i-1];
//		}
//		arr[i]=temp;
//	}
//	static void RightRotation(int [] arr,int n,int d)
//	{
//		for(int i=0;i<d;i++)
//		{
//			RotateByOne(arr,n);
//		}
//	}
	
				//Method-02
	static void RightRotation(int arr[], int n,int d)
	{
		d=d%n;
		int [] a=new int [d];
		for(int i=0;i<d;i++)
		{
			a[i]=arr[n-1-i];
		}
		for(int i=n-1;i>d;i--)
		{
			arr[i]=arr[i-d];
		}
		int j=d;
		for(int i=0;i<d;i++)
		{
			arr[i]=a[--j];
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 11, 22, 33, 44, 55, 66, 77 };
        int r = 3;
        int n = array.length;
        System.out.println("Array before rotation: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        RightRotation(array,n,r);
        System.out.println("\nArray after Right rotation: ");
        for (int i = 0; i < n; i++) 
        {
            System.out.print(array[i] + " ");
        }

	}

}
