
public class linear_saerch {
	
	static int LinearSearch(int []a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				System.out.printf("%d is present at the indese of :",key);
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,5,6,8,7,9,1,3,4};
		int key=9;
		System.out.print(LinearSearch(arr,key));
		
		

	}

}
