
public class fun_04_natural_sum {
	
	static int sum(int n)
	{
		if(n==1||n==0)
			return 1;
		else
			return n+sum((n-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=100;
		System.out.print(sum(number));
	}

}
