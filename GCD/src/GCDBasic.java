
public class GCDBasic {
	
	//Method-01
	static int GCD(int a, int b)
	{
		int gcd=1;
		for(int i=1;i<=a&& i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				gcd=i;
			}
		}
		return gcd;
	}
	
	// Method-02 (Eulid Algo)
	static int GCD2(int a, int b)
	{
		if(b==0)
			return a;
		return GCD2(b,a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(GCD(24,16));
		System.out.println(GCD2(16,24));
	}
}
