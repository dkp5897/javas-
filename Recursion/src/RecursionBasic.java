// print 10 to 1 number
public class RecursionBasic {
	
	// Method-01 By loop
	static void printnumber(int n)
	{
		for(int i=n;i>0;i--)
		{
			System.out.println(i+" ");
		}
	}
	
	// Method - 02 Recursion
	static void printNumber(int n)
	{
		if(n==0)
			return ;
		System.out.println(n);
		printNumber(n-1);
	}

	public static void main(String[] args) {
		
		int n=10;
		printNumber(n);
		printnumber(n);
		

	}

}
