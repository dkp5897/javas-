import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		byte n=sc.nextByte();
		System.out.println("the binary number is :"+Integer.toBinaryString(n));  
		System.out.println("first compliment is :"+Integer.toBinaryString(~n));
		System.out.println("second compliment is :"+Integer.toBinaryString(~n+1));
		System.out.println("The second compliment is :"+Integer.toBinaryString(-n));
	}
}
