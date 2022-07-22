import java.util.Scanner;

public class fun_03_force_on_body {
	
	static float force(int m)
	{
		return (float) (m*9.8);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the mass of body: ");
		int mass=sc.nextInt();
		System.out.println("The force on body="+force(mass));
		

	}

}
