import java.util.Scanner;

public class Day_function {
	
	public static void day(int n)
	{
		switch(day)
		{
		case 1:
		{
			System.out.print("Monday");
			break;
		}
		case 2:
		{
			System.out.print("Tuseday");
			break;
		}
		case 3:
		{
			System.out.print("Wednesday");
			break;
		}
		case 4:
		{
			System.out.print("Thirsday");
			break;
		}
		case 5:
		{
			System.out.print("Friday");
			break;
		}
		case 6:
		{
			System.out.print("Saturday");
			break;
		}
		case 7:
		{
			System.out.print("Sunday");
			break;
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		day(n);
	}

}
