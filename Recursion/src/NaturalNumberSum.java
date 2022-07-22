
public class NaturalNumberSum {
	
	static void PrintSum(int i, int n, int sum)
	{
		// Base case
		if(i==n)
		{
			sum+=i;
			System.out.println("Natural Sum: "+sum);
			return ;
		}
		
		sum+=i;
		PrintSum(i+1,n,sum);
	}

	// Method-02

	static void PrintSum2(int n , int sum){
		if(n==0){
			System.out.println("natural sum: "+sum);
			return;
		}
		sum+=n;
		PrintSum2(n-1, sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=10;
		int sum=0; // Initially
				
		PrintSum(i,n,sum);
		PrintSum2(n, sum);

	}

}
