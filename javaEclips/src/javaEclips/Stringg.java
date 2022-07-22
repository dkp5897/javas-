package javaEclips;

import java.util.Scanner;

public class Stringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String name=new String("Deepak");	// both can be used for string initialization
//		String name2="Deepak Kumar";
//		System.out.println(name);
//		System.out.println(name2);
		
		// taking input as string//
		
		System.out.println("Enter the String");
		Scanner sc=new Scanner(System.in);
		String name3=sc.next();				//it is used for taking a single string
		String name4=sc.nextLine();		// it is for taking a line of Strings
//		System.out.println(name3);
//		System.out.println(name4);
		
		//we can also print somthing like in c-programmin//
		System.out.printf("fisrt is %s and second is %s",name3,name4);
		
		System.out.format("%s",name3);	// Format is also use for string print
		

	}

}
