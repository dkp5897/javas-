package javaEclips;

public class Number_of_Divisor {
	
	static int divisor(int n) {
		int count=0;
		System.out.printf("The Divisor of the %d is =",n);
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number=99;
		
		System.out.print("Total number of divisor="+divisor(number));

	}

}
