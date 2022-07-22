
public class Factoral {
	
	static int calcfactorial(int n)
	{
		// base case
		if(n==1 || n==0 )
			return 1;
		
		int fact_nm1=calcfactorial(n-1);
		int n_fact=n*fact_nm1;				// n!=n*(n-1)!
		
		return n_fact;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=5;
		int ans=calcfactorial(n);
		System.out.print(ans);

	}

}
