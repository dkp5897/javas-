package javaEclips;

import java.util.Scanner;

public class String_revesr {
	
	static String reverse(String str)
	{
		String s="";
		char ch;
		for(int i=str.length()-1;i>=0;i--)
		{
			ch=str.charAt(i);
			s=s+ch;
		}
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str=sc.next();	
		System.out.print(reverse(str));
	}

}
