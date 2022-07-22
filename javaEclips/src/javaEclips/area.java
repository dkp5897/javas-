package javaEclips;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int S,Q,L,R,T;
		Scanner sc=new Scanner(System.in);
		Q=sc.nextInt();
		T=sc.nextInt();
		if(T==1)
		{
			S=sc.nextByte();
			System.out.println(S*S);
		}
		else if(T==2)
		{
			L=sc.nextByte();
			R=sc.nextByte();
			System.out.println(L*R);
		}

	}

}
