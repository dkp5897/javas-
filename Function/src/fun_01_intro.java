import java.util.Scanner;

public class fun_01_intro {
	
	static int sum(int a, int b)  // function declaration and difination
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(sum(2,7));			// function calling
//		System.out.println(sum(2,75));
//		System.out.println(sum(20,75));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two integers: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("The sum ="+sum(a,b));

	}

}
