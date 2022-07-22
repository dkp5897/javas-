package javaEclips;

import java.util.Scanner;

public class Fissure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		if(n%15==0)
		{
			System.out.println("Hello Deepak");
		}
		else if(n%3==0)
		{
			System.out.println("Hello");
		}
		else if(n%5==0)
		{
			System.out.println("Deepak");
		}
		else 
		{
			System.out.println("Your number is not multiple os 3,5 or 15");
		}
		
	}

}
