package practice;

public class root {
	
	static void roots(int a,int b,int c) {
		int d=(int) Math.sqrt(b*b-4*a*c);
		float r1,r2;
		if(d==0)
		{
			r1=r2=-b/(2*a);
			System.out.format("roots=%.2f, %.2f",r1,r2);
		}
		else if(d>0)
		{
			r1=(float) (-b+Math.sqrt(d))/(2*a);
			r2=(float) (-b-Math.sqrt(d))/(2*a);
			System.out.format("roots=%.2f, %.2f",r1,r2);
		}
		else
		{
			r1=r2=-b/2*a;
			//System.out.print("roots="+(r1)+(Math.sqrt(d))/2*a+"i ,"+(r2)-((Math.sqrt(d))/2*a)+"i");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		roots(3,5,4);

	}

}
