
public class X_power_N {
	
	// In this memory stack is n+1
	// x^n=x*(x^n-1)
	
	static int x_power_n(int x,int n)
	{
		if(n==0)
			return 1;
		else if(x==0)
			return 0;
		
		int xp_nm1= x_power_n(x,n-1);
		int xpn= x*(xp_nm1);
		
		return xpn;
		
		//return (x* (x_power_n(x,n-1)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=4;
		int n=15;
		//long ans=x_power_n(x,n);
		System.out.printf("%d power %d = %d",x,n,x_power_n(x,n));
	}
}
