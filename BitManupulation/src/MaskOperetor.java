import java.util.Scanner;

public class MaskOperetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int i= sc.nextInt();
		int j= sc.nextInt();
		int k= sc.nextInt();
		int m= sc.nextInt();
		
		int onmask = (1 << i);
		int offmask = ~(1 << j);		// 1's compliment
		int tmask = (1 << k);
		int chmask = (1 << m);
		
		System.out.println(n | onmask);
		System.out.println(n & offmask);
		System.out.println(n ^ tmask);
		System.out.println((n & chmask)==0? false :true);

	}

}
