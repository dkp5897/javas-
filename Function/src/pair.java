
public class pair {
	
	
	 class pair  
	{  
	    int  first, second;  
	    public pair(int  first, int  second)  
	    {  
	        this.first = first;  
	        this.second = second;  
	    }  
	} 

	static int  pair max_min(int arr[],int n)
	{
		int max=0;
		int min=Integer.MAX_VALUE;
		for(int e:arr)
		{
			if(e>max)
				max=e;
			if(e<min)
				min=e;
		}
		pair p=new pair(min, max);
		return p;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {12,564,866,245,10};
		//max_min(a,5);
		System.out.print(max_min(a,5));

	}

}
