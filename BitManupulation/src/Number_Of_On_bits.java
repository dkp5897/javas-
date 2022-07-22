import java.util.Scanner;

public class Number_Of_On_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("The binary number is: "+Integer.toBinaryString(n));
		
		int count=0;
		while(n!=0)
		{
			int rsbm= n & -n;		// this will give Right Most set bit mask
			System.out.println(Integer.toBinaryString(rsbm));
			n-= rsbm;
			System.out.println(Integer.toBinaryString(n));
			System.out.println(Integer.toBinaryString(-n));
			count++;
		}
		System.out.println("The number of on bits are :"+count);

	}

}
