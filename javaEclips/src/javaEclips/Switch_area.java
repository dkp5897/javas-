package javaEclips;

import java.util.Scanner;

public class Switch_area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Type area for Rectangle->R,Square->S and for Triangle->T");
		s=sc.next();
		switch(s)
		{
		case"R":
		{
			System.out.println("Enter the length and width of Rectangle: ");
			int l=sc.nextInt();
			int r=sc.nextInt();
			System.out.println("The Area of Rectangle is "+(l*r));
			break;
		}
		case "S":
		{
			System.out.println("Enter the sides of Square");
			int a=sc.nextInt();
			System.out.println("The Area of Rectangle is = "+(a*a));
			break;
		}
		case "T":
		{
			System.out.println("Enter the hright and base of trinagle");
			int h=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("The Area of Rectangle is= "+(0.5*h*b));
			break;
		}
		default :
			System.out.println("Run again and Please type area for Rectangle->R,Square->S and for Triangle->T: ");
		
		}

	}

}
