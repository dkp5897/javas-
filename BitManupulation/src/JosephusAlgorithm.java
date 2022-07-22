import java.util.Scanner;

public class JosephusAlgorithm {
	
	static int powerof2(int n)
	{
		int i=1;
		while(i*2<=n)
			i=i*2;
		return i;
	}
	
	static int solution(int n)
	{
		int hp2=powerof2(n);
		int l=n- hp2;
		return 2*l+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(solution(n));
		System.out.println(powerof2(n));
	}
}
