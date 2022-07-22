package javaEclips;

import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		String s="This is not Leap year";
		System.out.print("Enter the year:");
		Scanner sc=new Scanner(System.in);
		year =sc.nextInt();
		if(year%4==0)
		{
			if(year%100==0)
			{
				if(year%400==0)
					s="this is Leap year";
			}
			else
				s="this is Leap year";
		}
		System.out.print(s);
			
	}

}
