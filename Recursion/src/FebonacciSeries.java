
public class FebonacciSeries {
	
	static void febonacci(int a, int b, int n)
	{
		if(n==1)
			return ;
		
		int c= a+b;
		System.out.println(c);
		febonacci(b,c,n-1);
	}
	
	static int febo(int n)
	{
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
			return febo(n-1)+febo(n-2);
		
	}

	public static void main(String[] args) {
		
		int a=0,b=1,n=10;
		
		// without for loop
		System.out.println(a);
		System.out.println(b);
		febonacci(a,b,n-2);	// n-2 because we have print two number a ,b already means remaining n-2
		
		
		// by using for loop
//		for(int i=1;i<=n;i++)
//			System.out.println(febo(i));
	}
}
