import java.util.Scanner;

public class substract_sum_of_digit {
	
	static int digit_sum(int n)
	{
		int sum=0;
		while(n>0) 
		{
			sum=sum+n%10;				// 1254%10=4 give last digit as remainder
			n=n/10;						// 1254/10=125
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int count=0;
		while(num>0)
		{
			int c=digit_sum(num);
			num=num-c;
			count++;
		}
		System.out.print(count);

	}

}
