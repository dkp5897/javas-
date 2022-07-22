package javaEclips;

import java.util.Scanner;

public class Deepak {
	public static void main(String[] args) {
		float a, b, c;
		double root1, root2, imaginary, discriminant;
		Scanner sc = new Scanner(System.in);
		
		System.out.print(" Please Enter the Values of a, b, c of Quadratic Equation : ");
		a = sc.nextFloat();	
		b = sc.nextFloat();
		c = sc.nextFloat();
		
		discriminant = (b * b) - (4 * a *c);
	  	
	  	if(discriminant > 0)
	  	{
	  		root1 = ((-b + Math.sqrt(discriminant)) / (2 * a));
	  		root2 = ((-b - Math.sqrt(discriminant)) / (2 * a));
	  		System.out.println("\n Two Distinct Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
	  	}
	  	else if(discriminant == 0)
	  	{
	  		root1 = root2 = -b / (2 * a);
	  		System.out.println("\n Two Equal and Real Roots Exists: root1 = " + root1 + " and root2 = " + root2);
	  	}
	  	else if(discriminant < 0)
	  	{
	  		root1 = root2 = -b / (2 * a);
	  		imaginary = Math.sqrt(-discriminant) / (2 * a);
	  		System.out.println("\n Two Distinct Complex Roots Exists: root1 = " + 
	  						root1 + " +i " + imaginary + " and root2 = " + root2 +" -i " +imaginary);
	}

	}
}
