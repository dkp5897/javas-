import java.util.Scanner;

public class calculator {
	
	static void cases(int n,int a,int b)
	{
		
		switch(n)
		{
		case 1:
			System.out.print(a+b);
			break;
		case 2:
			System.out.print(a-b);
			break;
		case 3:
			System.out.print(a*b);
			break;
		case 4:
			System.out.print(a/b);
			break;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner var=new Scanner(System.in);
		n=var.nextInt();
		int a=var.nextInt();
		int b=var.nextInt();
		cases(n,a,b);

	}

}
