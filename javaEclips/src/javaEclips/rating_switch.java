package javaEclips;

import java.util.Scanner;

public class rating_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rating;
		System.out.print("Give Your Rating: ");
		Scanner sc= new Scanner(System.in);
		rating=sc.nextInt();
		switch(rating)
		{
		case 1:
			System.out.println("*");
			System.out.println("Thank You!");
			break;
		case 2:
			System.out.println("* *");
			System.out.println("Thank You!");
			break;
		case 3:
			System.out.println("* * *");
			System.out.println("Thank You!");
			break;
		case 4:
			System.out.println("* * * *");
			System.out.println("Thank You!");
			break;
		case 5:
			System.out.println("* * * * *");
			System.out.println("Thank You!");
			break;
		}

	}

}
