STORAGE:- 
	A computer store anything only in binnary number.

Eg.	int n=57; ---> computer store n=111001(binary number)

DATATYPES:
	
	byte   -	1 Byte - 8 bits --> means it can store only 8 bits disting value e.i. 1 0 0 1 0 1 1 0
	short	-	2 Byte - 16 bits
	int     -	4 Byte - 32 bits
	long    -	8 Byte - 64 bits


Assume there is a DATATYPES "sib" which can store 4 bits of memory then possible number it can store--
	
	0 0 0 0 	--->0
	0 0 0 1 	--->1
	0 0 1 0 	--->2
	0 0 1 1 	--->3
	0 1 0 0 	--->4
	0 1 0 1 	--->5
	0 1 1 0 	--->6
	0 1 1 1 	--->7
	1 0 0 0  	--->8
	1 0 0 1 	--->9
	1 0 1 0 	--->10
	1 0 1 1 	--->11
	1 1 0 0 	--->12
	1 1 0 1 	--->13
	1 1 1 0 	--->14
	1 1 1 1 	--->15

	means sib can store 0 to 15 number but it is wrong because there is no opportunity for negative numbers

Approach:
	if MSB is 0 then consider positive number
	if MSB is 1 then consider negative number:
		find second compliment of number and put nagative sign before it.

		Eg. 1001 --> (1001)' -->0110 (first compliment) -->0110 + 0001 = 0111 --> 7

			but it's MSB is 1 so put negative sign before It 
			so in computer 1001 ---> -7 


	0 0 0 0 	--->0
	0 0 0 1 	--->1
	0 0 1 0 	--->2
	0 0 1 1 	--->3
	0 1 0 0 	--->4
	0 1 0 1 	--->5
	0 1 1 0 	--->6
	0 1 1 1 	--->7
	1 0 0 0  	--->-8
	1 0 0 1 	--->-7
	1 0 1 0 	--->-6
	1 0 1 1 	--->-5
	1 1 0 0 	--->-4
	1 1 0 1 	--->-3
	1 1 1 0 	--->-2
	1 1 1 1 	--->-1

	So sib can store only from -8 to 7

Range:

	Sib 	4 bits	2^4---> -2^3 to 2^3-1 (Imaginary)
	byte 	8 bits	2^8---> -2^7 to 2^7-1
	short 	16bits	2^16---> -2^15 to 2^15-1
	int 	32bits	2^32---> -2^31 to 2^31-1
	long 	64bits	2^64---> -2^63 to 2^63-1


Beyond The Range:


	if I want to store 12 in "sib" DATATYPES
	sib  n=12;
	12 --->(binary Number) 1100 --> -4 store in computer for sib datatype

	s.o.p.(n);	--> give n= -4;


	sib n=16; (fit into bits)
	16--->10000   but we have only 4 bits storage then it will store only last 4 digits -->0000
	s.o.p(n);	--->give n=0;


Conversion:

B2D:--
		MSB=0 											MSB=1

		->convert to decimal						 	->2'compliment
		-> + sign  										->convert to decimal
														-> - sign



D2B:--
		+Ve 									-Ve

		->Convert to binary 					-> Remove sign 
		-> fit in bits							->convert to binary
												->fit in bits
												-> 2'compliment



Bitwise Operator:----

	|		OR 
	&		AND 
	^		XOR
	<<		Left Shift 
	>>		Right Shift
	>>>		Triple Right Shift
	N 		1's Compliment
	-x		2's Compliment


	(1) OR('|'):--->Generaly used to "on" the bit
				In OR Operator 1 Is most powerful digits and 0 is lest powerful
				a-->(0,1)

				a|1 = 1 	(always give 1)
				a|0 = a 	(No change)

				0|1 =1
				1|1 =1
				1|0 =1
				0|0 =0

	(2) AND('&')--> Generaly used to "off" the bit
				In and operator 0 is most powerful and 1 is less powerful

				a-->(0,1)

				a&0 = 0 	(always give 0)
				a&1 = a 	(No change)

				0 & 0 = 0
				1 & 0 = 0
				0 & 1 = 0
				1 & 1 = 1


	(3) XOR('^')---->It's used for toggle
				 1 is powerful

				 a-->(0,1)

				 a^1 = ~a (toggle a)
				 a^0 = a (same)

				 0^1 = 1
				 1^1 = 0
				 0^0 = 0
				 1^0 = 1


	(4) Left Shift("<<"):--->

						x  = 0 0 1 0 1 1 0 1
						x<<3---> shift the 3 digit in Left

						x<<3=0 1 1 0 1 0 0 0


	(5) Right Shift("<<"):--->

							y  =  0 0 1 0 1 1 0 1
							y>>3---> shift the 3 digit in Right

						    y<<3 =0 0 0 0 0 1 0 1   (if MSB is 0 then shifted position is filled with 0)

						    Y  =  1 0 0 1 0 1 0 1
						    y>>3= 1 1 1 1 0 0 1 0 	(if MSB is 1 then shifted position is filled with 1)

						    y>>>3=0 0 0 1 0 0 1 0 	(triple shift always take 0 at shifted position)





Question:--->


(1) To ON a bit:- to on a bit we always use OR Operator
					
					x= 1 0 1 1 _0 1 0 1

				mask=  0 0 0 0 _1 0 0 0

			x | mask=  1 0 1 1 _1 1 0 1     now _bit is on



(2) To OFF a bit:- to off a bit we always use AND Operator


					x= 1 0 1 1 _1 1 0 1

				mask=  1 1 1 1 _0 1 1 1

			X & mask=  1 0 1 1 _0 1 0 1 	now _bit is off	


			HOW TO FIND mask:-

								let a= 0 0 0 0 0 0 0 1;

								a<<3 = 0 0 0 0 1 0 0 0;
						mask=(a<<3)'1= 1 1 1 1 0 1 1 1;



(3) To Toggle a bit:- to toggle a bit we always use XOR Operator


					x= 1 0 1 1 _1 1 0 1

				mask=  0 0 0 0 _1 0 0 0

			x ^ mask=  1 0 1 1 _0 1 0 1  (bit toggled)


(4) To chech a bit for on or off:- we can used any operator


	Eg.(1)			x= 1 0 1 1 _1 1 0 1

				mask=  0 0 0 0 _1 0 0 0

			x & mask=  0 0 0 0 _1 0 0 0



	Eg.(2)			x= 1 0 1 1 _0 1 0 1

				mask=  0 0 0 0 _1 0 0 0

			x & mask=  0 0 0 0 _0 0 0 0


	Comment:-- if x&mask==0 then bit is "off" otherwise bit is on 


CODE:-

import java.util.Scanner;

public class MaskOperetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc =new Scanner(System.in);
		int n= sc.nextInt();
		int i= sc.nextInt();
		int j= sc.nextInt();
		int k= sc.nextInt();
		int m= sc.nextInt();
		
		int onmask = (1 << i);
		int offmask = ~(1 << j);		// 1's compliment
		int tmask = (1 << k);
		int chmask = (1 << m);
		
		System.out.println(n | onmask);
		System.out.println(n & offmask);
		System.out.println(n ^ tmask);
		System.out.println((n & chmask)==0? false :true);

	}

}


Conversion of D2B:--

CODE:-

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner (System.in);
		byte n=sc.nextByte();
		System.out.println("the binary number is :"+Integer.toBinaryString(n));  
		System.out.println("first compliment is :"+Integer.toBinaryString(~n));
		System.out.println("second compliment is :"+Integer.toBinaryString(~n+1));
		System.out.println("The second compliment is :"+Integer.toBinaryString(-n));
	}
}



Kernighan's Algorithm:-->

	This Algorithm is used to find number of on bits in a binary numbers.

CODE:-

import java.util.Scanner;

public class Number_Of_On_bits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=sc.nextInt();
		System.out.println("The binary number is: "+Integer.toBinaryString(n));
		
		int count=0;
		while(n!=0)
		{
			int rsbm= n & -n;		// this will give Right Most set bit mask
			n-= rsbm;
			count++;
		}
		System.out.println("The number of on bits are :"+count);
	}
}


Dry Run:-

		let n=57-->(111001)
			-n-->000111
			//first itteration
			rsbm=n & -n-->1;
			n-=rsbm-->111001-000001=111000
			count=1;
			// second itteration
			rsbm=001000
			n=111000-001000=110000
			count=2;
			.................. run till n=000000 and count every one (1) present in number



 Josephus Problem Algorithm:-

 Qs.---> every itteration kill alternate number then find the last number remain.

 		if n=10;

 		1 2 3 4 5 6 7 8 9 10
 		itteration start from 1 and every alternate number will be killed

 		1st itteration:

 		1 _2 3 _4 5 _6 7 _8 9 _10  will killed

 		2nd itteration:

 		1 _ _3 _ 5 _ _7 _ 9 _ 

 		3rd itteration:

 		_1 _ _ _ 5 _ _ _ _9 _ 

 		in last 5 will remain


Explaination:--
				

				make n= 2^x + l
				and return 2*l+1;


				let n=10;
				so we can write n=2^3 + 2 = 10 ----> l = 2
				return 2*2+1 = 5


CODE:-

import java.util.Scanner;

public class JosephusAlgorithm {
	
	static int powerof2(int n)
	{
		int i=1;
		while(i*2<=n)
			i=i*2;
		return i;
	}
	
	static int solution(int n)
	{
		int hp2=powerof2(n);
		int l=n- hp2;
		return 2*l+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(solution(n));
	}
}














































































































































