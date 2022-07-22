package methods;

import java.util.Scanner;

public class method_01 {
	
	static void check(int n)
	{
		String s="This number is odd";
		if(n%2==0)
			s="This number is even";
		System.out.print(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print( "Enter the number: ");
		int num =sc.nextInt();
		check(num);

	}

}
