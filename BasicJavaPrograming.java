
											-------------:Recursion:----------



Introduction:- When a function is called by itself then it is known as Recursion.
				when a function is called by main function then it is not a Recursion.

				Every problems which are solved by loop can also be sovled by Recursion


Explanation:-   let f(x)= x^2;

				f(f(x))--->f called f(x)----> Recursion ---> f(f(x))=f(x^2)

				let x=2;

				f(x)= 2^2=4;
				f(f(x)) = f(2^2) = f(4) =4^2 = 16;



Qs. 1: Print 5 to 1 Number

Solution: 

(1) By loop

for(int i=5;i>0;i--)
{
	System.out.ptint(i+" ");
}				


(2) by Recursion


public static void PrintNumber(int n)
{
	if(n==0)
		return ;
	System.out.print(n);
	PrintNumber(n-1);   // --->Recursion
}

Code:-

// print 10 to 1 number
public class RecursionBasic {
	
	// Method-01 By loop
	static void printnumber(int n)
	{
		for(int i=n;i>0;i--)
		{
			System.out.println(i+" ");
		}
	}
	
	
	// Method - 02 Recursion
	static void printNumber(int n)
	{
		if(n==0)
			return ;
		System.out.println(n);
		printNumber(n-1);
	}

	public static void main(String[] args) {
		
		int n=10;
		printNumber(n);
		printnumber(n);
		

	}

}

Output:-

10
9
8
7
6
5
4
3
2
1
10 
9 
8 
7 
6 
5 
4 
3 
2 
1 




---> Unlike Iteration Recursion occupie much more memory. Because at every Recursion level the variables 
(passing to function) occupie new space. but in loop memory occupie by variables only single time.  

---> if we have not spacified base case then Recursion run infinite number of times which will give Stack OverFlow error.  


Qs. 2: print number 1 to 5

public static void PrintNumber(int n)
{
	if(n==6)
		return ;
	System.out.println(n);
	PrintNumber(n+1);   // --->Recursion
}

public static void main(String[] args) {
		
		int n=1;
		printNumber(n);


Output:-
1
2
3
4
5



Qs:3:- print sum of N natural numbers

Code:-


public class NaturalNumberSum {
	
	static void PrintSum(int i, int n, int sum)
	{
		// Base case
		if(i==n)
		{
			sum+=i;
			System.out.print("Natural Sum: "+sum);
			return ;
		}
		
		sum+=i;
		PrintSum(i+1,n,sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int n=10;
		int sum=0; // Initially
				
		PrintSum(i,n,sum);
	}
}

Output:-
Natural Sum: 55