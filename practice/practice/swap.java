package practice;

import java.util.Collections;
import java.util.Scanner;

public class swap {
	//method-01
	static void swap1(int a,int b) {
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.printf("a=%d,b=%d\n",a,b);
	}
	//method-02
	static void swap2(int a,int b) {
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("a=%d,b=%d\n",a,b);
	}
	//method-03(b!=0)
	static void swap3(int a,int b) {
		a=a*b;
		b=a/b;
		a=a/b;
		System.out.printf("a=%d,b=%d\n",a,b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		int a= sc.nextInt();
//		int b= sc.nextInt();
		int a=15,b=35;
		System.out.printf("a=%d,b=%d\n",a,b);
		System.out.printf("After swap\n");
		swap1(a,b);
		swap2(a,b);
		swap3(a,b);
		Collections.swap( null, a, b);
		

	}

}
